import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SerializeServiceTest {
    @Test
    public void serializeHouseTest() throws ClassNotFoundException {
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

        try (OutputStream outputStream = new FileOutputStream("D:\\Serializable.txt");
             InputStream inputStream = new FileInputStream("D:\\Serializable.txt")) {

            SerializeService.serializer(outputStream, house);

            House houseResult = (House) SerializeService.deserializer(inputStream);

            assertEquals(house.toString(), houseResult.toString());
        } catch (IOException e) {
            System.out.println("ERROR" + e);
        }
    }
}