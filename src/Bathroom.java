public class Bathroom extends Room{
    private int numberOfToilets;
    private int numberOfShowers;
    private int numberOfSinks;
    private int numberOfMirrors;
    private int numberOfFurniture;

    public Bathroom(final int numberOfDoors, final int numberOfWindows, final int numberOfLaps, final String color,
                    final double size, final int furniture, final int numberOfToilets, final int numberOfShowers,
                    final int numberOfSinks, final int numberOfMirrors, final int numberOfFurniture) {
        super(numberOfDoors, numberOfWindows, numberOfLaps, color, size, furniture);
        this.numberOfToilets = numberOfToilets;
        this.numberOfShowers = numberOfShowers;
        this.numberOfSinks = numberOfSinks;
        this.numberOfMirrors = numberOfMirrors;
        this.numberOfFurniture = numberOfFurniture;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(final int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public int getNumberOfShowers() {
        return numberOfShowers;
    }

    public void setNumberOfShowers(final int numberOfShowers) {
        this.numberOfShowers = numberOfShowers;
    }

    public int getNumberOfSinks() {
        return numberOfSinks;
    }

    public void setNumberOfSinks(final int numberOfSinks) {
        this.numberOfSinks = numberOfSinks;
    }

    public int getNumberOfMirrors() {
        return numberOfMirrors;
    }

    public void setNumberOfMirrors(final int numberOfMirrors) {
        this.numberOfMirrors = numberOfMirrors;
    }

    public int getNumberOfFurniture() {
        return numberOfFurniture;
    }

    public void setNumberOfFurniture(final int numberOfFurniture) {
        this.numberOfFurniture = numberOfFurniture;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                System.lineSeparator() +
                ", numberOfDoors: " + getNumberOfDoors() +
                ", numberOfWindows: " + getNumberOfWindows() +
                System.lineSeparator() +
                ", numberOfLaps: " + getNumberOfLaps() +
                ", color: '" + getColor() + '\'' +
                ", size: " + getSize() +
                ", furniture: " + getFurniture()
                + System.lineSeparator() +
                "numberOfToilets=" + numberOfToilets +
                ", numberOfShowers=" + numberOfShowers +
                ", numberOfSinks=" + numberOfSinks +
                System.lineSeparator() +
                ", numberOfMirrors=" + numberOfMirrors +
                ", numberOfFurniture=" + numberOfFurniture +
                '}' + System.lineSeparator();
    }
}
