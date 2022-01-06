package tr.com.kafein._08_new_input_output;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {

    }

    public static void test01() {
        Path path = Paths.get("/folder1/folder2/test.txt");

        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount()); //Root'tan sonra derinlik bilgisini verir.
        System.out.println(path.getName(0)); //Sub folderları çekmeye yarar.
        System.out.println(path.getClass());
        System.out.println(path.subpath(0, 2)); // [beginIndex, endIndex)
        System.out.println(path.getFileSystem());
    }
    public static void test02(){
        Path path = Paths.get("bee", "home", "foo");
        System.out.println(path);

        File file = path.toFile(); //File'a dönüştürür.
        path = file.toPath(); // Path'a dönüştürür.
    }
    public static void test03(){
        Path path = Paths.get("../../folder/folder2/test.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toAbsolutePath().normalize());//Url'i düzenler gereksiz alanları kaldır.
    }
}
