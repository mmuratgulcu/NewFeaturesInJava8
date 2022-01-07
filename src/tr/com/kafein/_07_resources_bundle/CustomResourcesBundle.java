package tr.com.kafein._07_resources_bundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class CustomResourcesBundle{

    public static void main(String[] args) {
        resourcesBundle();
    }

    public static void resourcesBundle(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("tr.com.kafein._07_resources_bundle.Message", Locale.ENGLISH);
        System.out.println(resourceBundle.getString("key1"));
        System.out.println(resourceBundle.getString("key2"));

        resourceBundle = ResourceBundle.getBundle("tr.com.kafein._07_resources_bundle.Message", new Locale("tr"));
        System.out.println(resourceBundle.getString("key1"));
        System.out.println(resourceBundle.getString("key2"));

        Set<String> keys = resourceBundle.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + resourceBundle.getString(key));
        }
    }
}
