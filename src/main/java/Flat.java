import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Flat implements Serializable {
    private static final long serialVersionUID = 3;
    private int number;
    private double square;
    private List<Person> listPerson;

    public Flat() {
        this.number = 0;
        this.square = 0;
        this.listPerson = null;
    }

    public Flat(int number, double square, List<Person> listPerson) {
        this.number = number;
        this.square = square;
        this.listPerson = listPerson;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return number == flat.number && Double.compare(flat.square, square) == 0 && Objects.equals(listPerson, flat.listPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, square, listPerson);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "number=" + number +
                ", square=" + square +
                ", listPerson=" + listPerson +
                '}';
    }
}
