import java.io.*;

public class SerializeService {
    public static void serializer(OutputStream outputStream, House house) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(house);
        }
    }

    public static House deserializer(InputStream inputStream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            House house = (House) objectInputStream.readObject();
            return house;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
