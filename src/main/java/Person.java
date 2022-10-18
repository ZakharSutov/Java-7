import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 2;
    private String firstname;
    private String name;
    private String lastName;
    private int year;
    private int month;
    private int day;

    public Person() {
        this.firstname = null;
        this.name = null;
        this.lastName = null;
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Person(String firstname, String name, String lastName, int year, int month, int day) {
        this.firstname = firstname;
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Person(Person person) {
        this(person.getFirstname(), person.getname(), person.getLastName(), person.getYear(), person.getMonth(), person.getDay());
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return year == person.year && month == person.month && day == person.day && Objects.equals(firstname, person.firstname) && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, name, lastName, year, month, day);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
