package tr.com.kafein._08_new_input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) {

    }

    public static void createFile() {
        Path path = Paths.get("test.txt");

        if (!Files.exists(path)) { //Dosyanın var olup olmadığını kontrol etmekte.
            try {
                Files.createFile(path);
                //Dosya yoksa oluşturur. Varsa FileAlreadyExistsException fırlatır.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createDirectory() {
        Path path = Paths.get("folder");

        if (!Files.exists(path)) { //Dosyanın var olup olmadığını kontrol etmekte.
            try {
                Files.createDirectory(path);
                //Dosya yoksa oluşturur. Varsa FileAlreadyExistsException fırlatır.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createDirectories() {
        Path path = Paths.get("folder/folder1");

        if (!Files.exists(path)) { //Dosyanın var olup olmadığını kontrol etmekte.
            try {
                // Files.createDirectory(path); parent dosya olmadığı için çoklu dosya olusturmada hata verir.
                //Dosya yoksa oluşturur. Varsa FileAlreadyExistsException fırlatır.
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void compareTo() {
        Path path = Paths.get("test.txt");
        Path path1 = Paths.get("C:\\Users\\Kafein\\Desktop\\pure-java\\test.txt");

        try {
            //Pathlerin aynı folder/file'ı gösterip göstermediğini kontrol eder.
            //İçeriği kontrol etmez. Aynı konumdaki iki farklı dosya için false döner içeriği aynı olsada.
            System.out.println(Files.isSameFile(path, path1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile() {
        Path path = Paths.get("test.txt");
        Path path1 = Paths.get("folder/copy.txt");
        if (!Files.exists(path1)) {
            try {
                Files.createDirectories(path1.getParent());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING);
            //StandardCopyOption.REPLACE_EXISTING
            //Mevcut dosya varsa onu ezerek üzerine yazmasını sağlar.
            //Kullanılmazsa olusturmak istenen dosya zaten varsa exception fırlatır.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFile() {
        Path path = Paths.get("myFolder");

        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Path path1 = Paths.get("renameFolder");
        try {
            Files.move(path, path1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferedWriterAndBufferedReader() {
        Path path = Paths.get("test.txt");

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            bufferedWriter.write("line1\nline2\nline3");
        } catch (IOException exception) {

        }

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
           String line = null;
           while ((line = bufferedReader.readLine()) != null){
               System.out.println(line);
           }
        } catch (IOException exception) {

        }

        //Dosya içeriğini satır satır listeye atmakta.
        //Büyük dosyalar için probleme neden olabilir. OutOfMemory!
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
