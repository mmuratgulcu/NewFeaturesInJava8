package tr.com.kafein._08_new_input_output;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class PathFileStreamExample {
    public static void main(String[] args) throws IOException {
        streamLinesMethod();
    }

    public static void streamListMethod() throws IOException {
        try (Stream<Path> entries = Files.list(Paths.get("."))) {
            //entries.forEach(System.out::println);
            //entries.forEach(x -> System.out.println(x.getFileName()));
            entries.forEach(x -> System.out.println(x.toAbsolutePath().normalize()));
        }

        System.out.println("old way!");
        File files = new File(".");
        File[] fileArray = files.listFiles();

        for (File file : fileArray) {
            System.out.println(file.getName());
        }
    }

    public static void streamWalkMethod() throws IOException {
        //parent dosyalarıda gezer.
        Stream<Path> stream = Files.walk(Paths.get("."));
        stream.forEach(System.out::println);
        stream.close();

        //maxDepth ile derinlik kısıtlaması getirebiliriz.
        Stream<Path> stream2 = Files.walk(Paths.get("."), 2);
        stream.forEach(System.out::println);
        stream2.close();
    }

    public static void streamFindMethod() throws IOException {

        BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) ->
                attribute.isDirectory() || path.toString().endsWith("class");

        try (Stream<Path> stream = Files.find(Paths.get("."), 2, matcher)) {
            stream.forEach(System.out::println);
        }
    }

    public static void streamLinesMethod() throws IOException {
        //Dosyanın içeriğini stream'e almaktadır..
        try (Stream<String> lines = Files.lines(Paths.get("test.txt"))) {
            lines.forEach(System.out::println);
        }
    }
}
