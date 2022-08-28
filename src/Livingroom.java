public class Livingroom {
    private int numberOfSofas;
    private int numberOfChairs;
    //public int numberOfTvs;
    private String tv;
    private int bookShelf;
    private int anotherFurniture;


    public Livingroom(final int numberOfSofas, final int numberOfChairs, final String tv,
                      final int bookShelf, final int anotherFurniture) {
        this.numberOfSofas = numberOfSofas;
        this.numberOfChairs = numberOfChairs;
        this.tv = tv;
        this.bookShelf = bookShelf;
        this.anotherFurniture = anotherFurniture;
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
                "numberOfSofas=" + numberOfSofas +
                ", numberOfChairs=" + numberOfChairs +
                ", tv='" + tv + '\'' +
                ", bookShelf=" + bookShelf +
                ", anotherFurniture=" + anotherFurniture +
                '}';
    }
}
