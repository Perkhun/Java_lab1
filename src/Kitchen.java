public class Kitchen extends Room {
    private int numberOfTable;
    private int numberOfChair;
    private String oven;
    private String kettle;
    private int numberOfWashbasin;
    private String refrigerator;

    public Kitchen(final int numberOfDoors, final int numberOfWindows, final int numberOfLaps, final String color,
                   final double size, final int furniture, final int numberOfTable, final int numberOfChair,
                   final String oven, final String kettle,
                   final int numberOfWashbasin, final String refrigerator) {
        super(numberOfDoors, numberOfWindows, numberOfLaps, color, size, furniture);
        this.numberOfTable = numberOfTable;
        this.numberOfChair = numberOfChair;
        this.oven = oven;
        this.kettle = kettle;
        this.numberOfWashbasin = numberOfWashbasin;
        this.refrigerator = refrigerator;
    }

    public int getNumberOfTable() {
        return numberOfTable;
    }

    public void setNumberOfTable( final int numberOfTable) {
        this.numberOfTable = numberOfTable;
    }

    public int getNumberOfChair() {
        return numberOfChair;
    }

    public void setNumberOfChair(final int numberOfChair) {
        this.numberOfChair = numberOfChair;
    }

    public String getOven() {
        return oven;
    }

    public void setOven(final String oven) {
        this.oven = oven;
    }

    public String getKettle() {
        return kettle;
    }

    public void setKettle(final String kettle) {
        this.kettle = kettle;
    }

    public int getNumberOfWashbasin() {
        return numberOfWashbasin;
    }

    public void setNumberOfWashbasin(final int numberOfWashbasin) {
        this.numberOfWashbasin = numberOfWashbasin;
    }

    public String getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(final String refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                System.lineSeparator() +
                ", numberOfDoors: " + getNumberOfDoors() +
                ", numberOfWindows: " + getNumberOfWindows() +
                System.lineSeparator() +
                ", numberOfLaps: " + getNumberOfLaps() +
                ", color: '" + getColor() + '\'' +
                ", size: " + getSize() +
                ", furniture: " + getFurniture()
                + System.lineSeparator() +
                "numberOfTable: " + numberOfTable +
                ", numberOfChai: =" + numberOfChair +
                ", oven: " + oven + '\'' +
                System.lineSeparator() +
                ", kettle: " + kettle + '\'' +
                ", numberOfWashbasin: " + numberOfWashbasin +
                ", refrigerator: " + refrigerator + '\'' +
                '}' + System.lineSeparator();
    }
}
