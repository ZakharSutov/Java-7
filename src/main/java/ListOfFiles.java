import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfFiles {
    public static List<String> listOfFiles(File file, String extension) {
        List<String> listName = new ArrayList<>();
        String[] arrName = file.list(new ExtensionFilter(extension));
        Collections.addAll(listName, arrName);
        return listName;
    }
}
