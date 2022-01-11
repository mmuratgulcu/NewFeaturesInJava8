package tr.com.kafein._06_exceptions;

import javax.naming.NamingException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchExceptionExample {
    public static void main(String[] args) {

    }

    public static void oldWayCatch(){

        try {
            exceptionThrows();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }catch (NamingException e){
            System.out.println(e.getMessage());
        }

    }

    public static void multiCatch(){

        try {
            exceptionThrows();
        } catch (IllegalStateException | FileNotFoundException | SQLException | NamingException e) {
            e.printStackTrace();
        }

    }

    public static void exceptionThrows() throws FileNotFoundException, SQLException, IllegalStateException, NamingException {}
}
