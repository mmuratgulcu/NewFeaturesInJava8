package tr.com.kafein._00_sunum;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class PathExample {
    public static void main(String[] args) {


        try(Stream<String> list = Files.lines(Paths.get("test.txt"))){
            list.forEach(x -> System.out.println(x));
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
