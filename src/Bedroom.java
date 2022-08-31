public class Bedroom extends Room{
    private int numberOfBeds;
    private String tv;
    private int numberOfFurniture;

    public Bedroom(final int numberOfDoors, final int numberOfWindows, final int numberOfLaps, final String color,
                   final double size, final int furniture, final int numberOfBeds,  final String tv,
                   final int numberOfFurniture) {
        super(numberOfDoors, numberOfWindows, numberOfLaps, color, size, furniture);
        this.numberOfBeds = numberOfBeds;
        this.tv = tv;
        this.numberOfFurniture = numberOfFurniture;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(final int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(final String tv) {
        this.tv = tv;
    }

    public int getNumberOfFurniture() {
        return numberOfFurniture;
    }

    public void setNumberOfFurniture(final int numberOfFurniture) {
        this.numberOfFurniture = numberOfFurniture;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                System.lineSeparator() +
                ", numberOfDoors: " + getNumberOfDoors() +
                ", numberOfWindows: " + getNumberOfWindows() +
                System.lineSeparator() +
                ", numberOfLaps: " + getNumberOfLaps() +
                ", color: '" + getColor() + '\'' +
                ", size: " + getSize() +
                ", furniture: " + getFurniture()
                + System.lineSeparator() +
                "numberOfBeds: " + numberOfBeds +
                " tv: " + tv + '\'' + System.lineSeparator() +
                ", numberOfFurniture: " + numberOfFurniture +
                '}';
    }
}
