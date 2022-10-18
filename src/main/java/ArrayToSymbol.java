import java.io.*;

public class ArrayToSymbol {
    public static void writerArr(Writer writer, int[] arr) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (int i = 0; i < arr.length; i++) {
                bufferedWriter.write(String.valueOf(arr[i]));
                bufferedWriter.write(" ");
            }
        }
    }

    public static void readerArr(Reader reader, int[] arr) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String[] str = bufferedReader.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
        }
    }
}
