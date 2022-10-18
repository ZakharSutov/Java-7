import org.junit.Test;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class ArrayToSymbolTest {

    @Test
    public void writerArr() throws IOException {
        int[] arr = {1, 2, 3};
        char[] arrAns = {'1', ' ', '2', ' ', '3', ' '};
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        ArrayToSymbol.writerArr(charArrayWriter, arr);
        assertArrayEquals(arrAns, charArrayWriter.toCharArray());
    }

    @Test
    public void readerArr() throws IOException {
        int[] arrAns = {1, 2, 3};
        char[] symbols = {'1', ' ', '2', ' ', '3', ' '};
        int[] arr = new int[3];
        CharArrayReader charArrayReader = new CharArrayReader(symbols);
        ArrayToSymbol.readerArr(charArrayReader, arr);
        assertArrayEquals(arrAns, arr);
    }
}