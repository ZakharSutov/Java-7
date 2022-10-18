import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SerializeServiceWithJacksonTest {

    @Test
    public void serializableObjectJson() throws IOException {
        Person person1 = new Person("Иванов", "Иван", "Иваныч", 2000, 2, 2);
        Person person2 = new Person("Петров", "Петр", "Петрович", 2000, 1, 1);
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person1);
        listPerson.add(person2);
        Flat flat = new Flat(1, 100, listPerson);
        Person oldPerson = new Person("Чел", "Чел", "Чел", 3000, 3,3);
        List<Flat> listFlat = new ArrayList<>();
        listFlat.add(flat);
        House house = new House("777", "Pushkina 2", oldPerson, listFlat);
        try (Writer writer = new FileWriter("JsonFile.txt", StandardCharsets.UTF_8);
             Reader reader = new FileReader("JsonFile.txt", StandardCharsets.UTF_8)
        ) {
            SerializeServiceWithJackson.serializer(house, writer);

            House houseResult = SerializeServiceWithJackson.deSerializer(reader);

            assertEquals(house, houseResult);
        }
    }

}