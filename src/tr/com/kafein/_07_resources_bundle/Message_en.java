package tr.com.kafein._07_resources_bundle;

import java.util.ListResourceBundle;

public class Message_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"key1","Welcome"},
                {"key2", "God Bye!!"}
        };
    }
}
