import java.util.Objects;

public class Room {
    private TypeOfRoom typeOfRoom;
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfLaps;
    private String color;
    private double size;
    private int furniture;

    public Room(final TypeOfRoom typeOfRoom, final int numberOfDoors, final int numberOfWindows,
                final int numberOfLaps, final String color, final double size, final int furniture) {
        this.typeOfRoom = typeOfRoom;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfLaps = numberOfLaps;
        this.color = color;
        this.size = size;
        this.furniture = furniture;
    }

    public TypeOfRoom getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(final TypeOfRoom typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(final int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(final int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }

    public void setNumberOfLaps(final int numberOfLaps) {
        this.numberOfLaps = numberOfLaps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(final double size) {
        this.size = size;
    }

    public int getFurniture() {
        return furniture;
    }

    public void setFurniture(final int furniture) {
        this.furniture = furniture;
    }

    public void increaseNumberOfWindows() {
        numberOfWindows++;
    }
    public void reduceNumberOfWindows() {
        numberOfWindows--;
    }
    public void increaseNumberOfDoors() {
        numberOfDoors++;
    }
    public void reduceNumberOfDoors() {
        numberOfDoors--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return numberOfDoors == room.numberOfDoors && numberOfWindows == room.numberOfWindows && numberOfLaps == room.numberOfLaps && Double.compare(room.size, size) == 0 && furniture == room.furniture && typeOfRoom.equals(room.typeOfRoom) && color.equals(room.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfRoom, numberOfDoors, numberOfWindows, numberOfLaps, color, size, furniture);
    }

    @Override
    public String toString() {
        return "Room: " +
                "typeOfRoom: " + typeOfRoom +
                System.lineSeparator() +
                ", numberOfDoors: " + numberOfDoors +
                ", numberOfWindows: " + numberOfWindows +
                System.lineSeparator() +
                ", numberOfLaps: " + numberOfLaps +
                ", color: '" + color + '\'' +
                ", size: " + size +
                ", furniture: " + furniture
                + System.lineSeparator();
    }
}
