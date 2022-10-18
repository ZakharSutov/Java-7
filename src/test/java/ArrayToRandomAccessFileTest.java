import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import static org.junit.Assert.*;

public class ArrayToRandomAccessFileTest {

    @Test
    public void reader() {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\test.txt", "rw")) {
            int[] arr = {1, 2, 3, 4, 5};
            ArrayToRandomAccessFile.writer(randomAccessFile, arr);
            int[] res = ArrayToRandomAccessFile.reader(randomAccessFile, 2);
            int[] arrAns = {2, 3, 4, 5};
            assertArrayEquals(arrAns, res);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}