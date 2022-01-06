package tr.com.kafein._06_exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchExceptionExample {
    public static void main(String[] args) {

        try {
            multiCatchExample();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            multiCatchExample();
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public static void multiCatchExample() throws FileNotFoundException, SQLException {}
}
