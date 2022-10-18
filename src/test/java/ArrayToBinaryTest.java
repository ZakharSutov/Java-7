import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayToBinaryTest {

    @Test
    public void writer() throws IOException {
        int[] arr = new int[]{1, 2, 3};
        byte[] arrAns = {0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 3};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ArrayToBinary.writer(outputStream, arr);
        assertArrayEquals(arrAns, outputStream.toByteArray());
    }

    @Test
    public void reader() throws IOException {
        int[] arrAns = {1, 2, 3};
        byte[] buf = {0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 3};
        int[] arr = new int[3];
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);
        ArrayToBinary.reader(inputStream, arr);
        assertArrayEquals(arrAns, arr);
    }
}