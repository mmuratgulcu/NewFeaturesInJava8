package tr.com.kafein._08_new_input_output;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _01_PathExample {
    public static void main(String[] args) {

        test03();

    }

    public static void test01() {
        Path path = Paths.get("/folder1/folder2/test.txt");
        //File file = new File("/folder1/folder2/test.txt");

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
        Path path = Paths.get("/tr", "com", "kafein");
        System.out.println(path);
        File file = path.toFile();
        path = file.toPath();
        System.out.println(path);
    }

    public static void test03(){
        Path path = Paths.get("../../folder/folder2/test.txt");
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toAbsolutePath().normalize());//Url'i düzenler gereksiz alanları kaldır.
    }
}
