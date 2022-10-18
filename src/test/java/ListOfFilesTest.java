import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListOfFilesTest {

   /* @Test
    public void listOfFiles() {
        File file = new File("D://Учёба");
        List<String> arrFile = listOfFiles(file, ".txt");
        List<String> arrAns = new ArrayList<>();
        arrAns.add("test.txt");
        arrAns.add("test1.txt");
        arrAns.add("test2.txt");
        assertEquals(arrAns, arrFile);
    }*/

    @Test
    public void testListOfFiles() {
        File file = new File("D://Учёба");
        List<String> arrFile = ListOfFiles.listOfFiles(file, ".txt");
        List<String> arrAns = new ArrayList<>();
        arrAns.add("test.txt");
        arrAns.add("test1.txt");
        arrAns.add("test2.txt");
        assertEquals(arrAns, arrFile);
    }
}