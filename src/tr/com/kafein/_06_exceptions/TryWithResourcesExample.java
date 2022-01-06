package tr.com.kafein._06_exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        moreObjectTryWithResources();
    }

    public static void finallyClosed(){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("file.text");
            fileWriter.write("test");
        }catch (IOException e){

        }finally {
            try {
                if(fileWriter !=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void tryWithResources(){
        try(FileWriter fileWriter = new FileWriter("file.text")){
            fileWriter.write("test");
        }catch (IOException exception){

        }
    }
    public static void customObjectTryWithResources(){
        try(Computer person = new Computer()){

        }catch (IOException exception){

        }
    }
    public static void moreObjectTryWithResources(){
        try(Person person = new Person(1);
            Person person2 = new Person(2)){

        }catch (IOException exception){

        }
    }
}

class Computer implements AutoCloseable{

    //Computer sınıfını try-with-resources özelliğinde kullanabilmek için AutoCloseable implemente etmesi gerekir.
    //Throws edeceği Excepiton parent classta fırlatılan exceptiondan daha düşük levelda olmalıdır.
    @Override
    public void close() throws IOException {

    }
}

class Person implements AutoCloseable{

    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Shutdown " + id);
    }
}
