public class Livingroom extends Room{
    private int numberOfSofas;
    private int numberOfChairs;
    private String tv;
    private int bookShelf;
    private int anotherFurniture;

    public Livingroom(final int numberOfDoors, final int numberOfWindows, final int numberOfLaps,
                      final String color, final double size, final int furniture, final int numberOfSofas,
                      final int numberOfChairs, final String tv,
                      final int bookShelf, final int anotherFurniture) {
        super(numberOfDoors, numberOfWindows, numberOfLaps, color, size, furniture);
        this.numberOfSofas = numberOfSofas;
    }

    public int getNumberOfSofas() {
        return numberOfSofas;
    }

    public void setNumberOfSofas(final int numberOfSofas) {
        this.numberOfSofas = numberOfSofas;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(final int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(final String tv) {
        this.tv = tv;
    }

    public int getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(final int bookShelf) {
        this.bookShelf = bookShelf;
    }

    public int getAnotherFurniture() {
        return anotherFurniture;
    }

    public void setAnotherFurniture(final int anotherFurniture) {
        this.anotherFurniture = anotherFurniture;
    }

    @Override
    public String toString() {
        return "Livingroom{" +
                System.lineSeparator() +
                ", numberOfDoors: " + getNumberOfDoors() +
                ", numberOfWindows: " + getNumberOfWindows() +
                System.lineSeparator() +
                ", numberOfLaps: " + getNumberOfLaps() +
                ", color: '" + getColor() + '\'' +
                ", size: " + getSize() +
                ", furniture: " + getFurniture()
                + System.lineSeparator() +
                "numberOfSofas=" + numberOfSofas +
                ", numberOfChairs=" + numberOfChairs +
                ", tv='" + tv + '\'' +
                ", bookShelf=" + bookShelf +
                ", anotherFurniture=" + anotherFurniture +
                '}';
    }
}
