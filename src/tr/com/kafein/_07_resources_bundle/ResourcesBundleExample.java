package tr.com.kafein._07_resources_bundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourcesBundleExample {
    public static void main(String[] args) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("config", new Locale("tr"));

        String message = resourceBundle.getString("key1");
        System.out.println(message);

        resourceBundle = ResourceBundle.getBundle("config", Locale.ENGLISH);

        message = resourceBundle.getString("key1");
        System.out.println(message);

        Set<String> keys = resourceBundle.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + resourceBundle.getString(key));
        }
    }
}
