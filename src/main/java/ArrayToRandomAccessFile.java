import java.io.IOException;
import java.io.RandomAccessFile;

public class ArrayToRandomAccessFile {
    public static void writer(RandomAccessFile randomAccessFile, int[] arr) throws IOException {
        for (int elem : arr) {
            randomAccessFile.writeInt(elem);
        }
    }

    public static int[] reader(RandomAccessFile randomAccessFile, int position) throws IOException {
        int[] res = new int[(int) (randomAccessFile.length() / Integer.BYTES - position + 1)];
        randomAccessFile.seek((long) (position - 1) * Integer.BYTES);
        for (int i = 0; i < (int) (randomAccessFile.length() / Integer.BYTES) - 1; i++) {
            res[i] = randomAccessFile.readInt();
        }

        /*int i = 0;
        while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
            res[i] = randomAccessFile.readInt();
            i++;
        }*/
        return res;
    }
}
