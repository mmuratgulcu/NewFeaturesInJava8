package tr.com.kafein._08_new_input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributesExample {
    public static void main(String[] args) throws IOException {
        Path folder = Paths.get("folder");

        System.out.println(Files.isDirectory(folder));
        System.out.println(Files.isRegularFile(folder));
        System.out.println(Files.isExecutable(folder));
        System.out.println(Files.isReadable(folder));
        System.out.println(Files.isWritable(folder));
        System.out.println(Files.isHidden(folder));

        Path file = Paths.get("test.txt");
        System.out.println(Files.size(file));
        System.out.println(Files.getLastModifiedTime(file));
        System.out.println(Files.getOwner(file));

        BasicFileAttributes attributes = Files.readAttributes(file,BasicFileAttributes.class);
        System.out.println(attributes.creationTime());
        System.out.println(attributes.isDirectory());
        System.out.println(attributes.isRegularFile());
        System.out.println(attributes.lastAccessTime());
        System.out.println(attributes.size());
    }
}
