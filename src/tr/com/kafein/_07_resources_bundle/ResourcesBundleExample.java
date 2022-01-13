package tr.com.kafein._07_resources_bundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourcesBundleExample {
    public static void main(String[] args) {
        resourceBundle();
    }

    public static void resourceBundle(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", new Locale("tr"));

        String message = resourceBundle.getString("key1");
        System.out.println(message);

        String message2 = resourceBundle.getString("key2");
        System.out.println(message2);

        resourceBundle = ResourceBundle.getBundle("message", Locale.ENGLISH);

        message = resourceBundle.getString("key1");
        System.out.println(message);

        Set<String> keys = resourceBundle.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + resourceBundle.getString(key));
        }
    }
}
