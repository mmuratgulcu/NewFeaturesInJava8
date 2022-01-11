package tr.com.kafein._06_exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        customObjectTryWithResources();
    }

    public static void finallyClosed() {

        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileWriter = new FileWriter("file.txt");
            fileWriter.write("test");
            fileReader = new FileReader("test.txt");
            while (fileReader.read() != -1) {
                System.out.println((char) fileReader.read());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void tryWithResources() {

        try (FileWriter fileWriter = new FileWriter("file.txt");
             FileReader fileReader = new FileReader("test.txt")) {
            fileWriter.write("test");
            while (fileReader.read() != -1) {
                System.out.println((char) fileReader.read());
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void customObjectTryWithResources() {

        try (Person person = new Person(1);
             Person person2 = new Person(2);
             Computer computer = new Computer()) {

        } catch (IOException exception) {

        }
    }
}

class Computer implements AutoCloseable {

    @Override
    public void close() throws IOException {
        System.out.println("Shutdown Computer");
    }
}

class Person implements AutoCloseable {

    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Shutdown Person" + id);
    }

}
