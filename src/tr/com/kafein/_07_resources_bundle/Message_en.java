package tr.com.kafein._07_resources_bundle;

import java.util.ListResourceBundle;

public class Message_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"1","Welcome"},
                {"2", "God Bye!!"}
        };
    }
}
