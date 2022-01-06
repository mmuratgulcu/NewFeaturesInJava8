package tr.com.kafein._06_exceptions;

public class SuppressedExceptionExample {
    public static void main(String[] args) {

    }
    public static void nonProductSuppressedExceptionMethod(){
        try(Product product = new Product()){
            System.out.println("try block..!");
            throw new IllegalArgumentException("Illegal argument exception"); //Birinci exception
        }catch (Exception exception){
            System.out.println("catch block..!");
            System.out.println(exception.getMessage());
        }
    }
    public static void getProductSuppressedExceptionMethod(){
        try(Product product = new Product()){
            System.out.println("try block..!");
            throw new IllegalArgumentException("Illegal argument exception"); //Birinci exception
        }catch (Exception exception){
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
        System.out.println("Shut down..!");
        throw new IllegalStateException("Exception in close!"); //İkinci exception (suppressed)
    }

}
