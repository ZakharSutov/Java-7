import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeServiceWithJackson {
    public static void serializer(House house, Writer writer) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, house);
    }

    public static House deSerializer(Reader reader) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        House houseResult = mapper.readValue(reader, House.class);
        return houseResult;
    }
}
