package tr.com.kafein._07_resources_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class CustomResourcesBundle{

    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.gulcu.murat._06_resources_bundle.Message", Locale.ENGLISH);
        System.out.println(resourceBundle.getString("key1"));
        System.out.println(resourceBundle.getString("key2"));

        resourceBundle = ResourceBundle.getBundle("com.gulcu.murat._06_resources_bundle.Message", new Locale("tr"));
        System.out.println(resourceBundle.getString("key1"));
        System.out.println(resourceBundle.getString("key2"));
    }
}
