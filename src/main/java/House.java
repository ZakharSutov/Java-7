import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class House implements Serializable {
    private static final long serialVersionUID = 1;
    private String cadastralNumber;
    private String address;
    private Person housekeeper;
    private List<Flat> listFlat;


    public House() {
        this.cadastralNumber = null;
        this.address = null;
        this.housekeeper = null;
        this.listFlat = null;
    }

    public House(String cadastralNumber, String address, Person housekeeper, List<Flat> listFlat) {
        this.cadastralNumber = cadastralNumber;
        this.address = address;
        this.sethousekeeper(housekeeper);
        // this.housekeeper = housekeeper;
        this.listFlat = listFlat;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person gethousekeeper() {
        return housekeeper;
    }

    public void sethousekeeper(Person housekeeper) {
        if (housekeeper == null) throw new IllegalArgumentException("OlderPerson must be not null!");
        this.housekeeper = new Person(housekeeper);
        //this.housekeeper = housekeeper;
    }

    public List<Flat> getListFlat() {
        return listFlat;
    }

    public void setListFlat(List<Flat> listFlat) {
        this.listFlat = listFlat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(cadastralNumber, house.cadastralNumber) && Objects.equals(address, house.address) && Objects.equals(housekeeper, house.housekeeper) && Objects.equals(listFlat, house.listFlat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadastralNumber, address, housekeeper, listFlat);
    }

    @Override
    public String toString() {
        return "House{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", address='" + address + '\'' +
                ", housekeeper=" + housekeeper +
                ", listFlat=" + listFlat +
                '}';
    }
}
