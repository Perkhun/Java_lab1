import java.util.List;
import java.util.Objects;

public class House {
    private List<Room> rooms;
    private int numberOfEnteries;
    private int numberOfFloors;
    private int numberOfCorridors;

    public House(final List<Room> rooms, final int numberOfEnteries, final int numberOfFloors,
                 final int numberOfCorridors ) {
        this.rooms = rooms;
        this.numberOfEnteries = numberOfEnteries;
        this.numberOfFloors = numberOfFloors;
        this.numberOfCorridors = numberOfCorridors;
    }

    public int getNumberOfEnteries() {
        return numberOfEnteries;
    }

    public void setNumberOfEnteries(final int numberOfEnteries) {
        this.numberOfEnteries = numberOfEnteries;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(final int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfCorridors() {
        return numberOfCorridors;
    }

    public void setNumberOfCorridors(final int numberOfCorridors) {
        this.numberOfCorridors = numberOfCorridors;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    public void increaseNumberOfFloors() {
        numberOfFloors++;
    }
    public  void reduceNumberOfFloors() {
        numberOfFloors--;
    }
    public void increaseNumberOfEnteries() {
        numberOfEnteries++;
    }
    public void reduceNumberOfEnteries() {
        numberOfEnteries--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberOfEnteries == house.numberOfEnteries && numberOfFloors == house.numberOfFloors && numberOfCorridors == house.numberOfCorridors && rooms.equals(house.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, numberOfEnteries, numberOfFloors, numberOfCorridors);
    }

    @Override
    public java.lang.String toString() {
        return "House: " +
                "rooms: " + rooms +
                ", numberOfEnteries: " + numberOfEnteries +
                ", numberOfFloors: " + numberOfFloors +
                ", numberOfCorridors: " + System.lineSeparator() + numberOfCorridors +
                '}';
    }
}
