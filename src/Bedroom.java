public class Bedroom {
    private int numberOfBeds;
    private String tv;
    private int numberOfFurniture;

    public Bedroom(final int numberOfBeds, final String tv, final int numberOfFurniture) {
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
                "numberOfBeds=" + numberOfBeds +
                ", tv='" + tv + '\'' +
                ", numberOfFurniture=" + numberOfFurniture +
                '}';
    }
}
