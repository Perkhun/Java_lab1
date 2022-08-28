public class Kitchen {
    private int numberOfTable;
    private int numberOfChair;
    private String oven;
    private String kettle;
    private int numberOfWashbasin;
    private String refrigerator;

    public Kitchen(final int numberOfTable, final int numberOfChair, final String oven, final String kettle,
                   final int numberOfWashbasin, final String refrigerator) {
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
                "numberOfTable=" + numberOfTable +
                ", numberOfChair=" + numberOfChair +
                ", oven='" + oven + '\'' +
                ", kettle='" + kettle + '\'' +
                ", numberOfWashbasin=" + numberOfWashbasin +
                ", refrigerator='" + refrigerator + '\'' +
                '}';
    }
}
