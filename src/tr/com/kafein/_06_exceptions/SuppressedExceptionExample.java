package tr.com.kafein._06_exceptions;

public class SuppressedExceptionExample {

    public static void main(String[] args) {
        getProductSuppressedExceptionMethod();
    }

    public static void nonProductSuppressedExceptionMethod() {

        try (Product product = new Product();
            User user = new User()) {
            System.out.println("try block..!");
            throw new IllegalArgumentException("First Illegal argument exception");
        } catch (Exception exception) {
            System.out.println("catch block..!");
            System.out.println(exception.getMessage());
        }

    }

    public static void getProductSuppressedExceptionMethod() {

        try (Product product = new Product();
             User user = new User()) {
            System.out.println("try block..!");
            throw new IllegalArgumentException("First Illegal Argument Exception");
        } catch (Exception exception) {
            System.out.println("catch block..!");

            System.out.println(exception.getMessage());

            for (Throwable throwable : exception.getSuppressed()) {
                System.out.println(throwable.getMessage());
            }
        }

    }

}

class Product implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Shut down..! Product");
        throw new IllegalStateException("Third Illegal Argument Exception");
    }

}

class User implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Shut down..! User");
        throw new IllegalStateException("Second Illegal Argument Exception");
    }

}
