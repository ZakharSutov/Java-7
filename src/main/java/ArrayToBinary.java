import java.io.*;

public class ArrayToBinary {
    public static void writer(OutputStream outputStream, int[] arr) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(outputStream)) {
            for (int elm : arr) {
                dataOutputStream.writeInt(elm);
            }
        }
    }

    public static void reader(InputStream inputStream, int[] arr) throws IOException {
        try (DataInputStream dataInputStream = new DataInputStream(inputStream)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = dataInputStream.readInt();
            }
        }
    }
}
