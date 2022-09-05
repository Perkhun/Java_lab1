import java.util.Objects;

public class CustomDouble {
    private int intNumber;
    private double doubleNumber;
    public int getIntNumber() {
        return intNumber;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public void setIntNumber(int intNumber) {
        this.intNumber = intNumber;
    }

    public CustomDouble(int intNumber, double doubleNumber) {
        this.intNumber = intNumber;
        this.doubleNumber = doubleNumber;
    }
    public CustomDouble(double result) {
        this.intNumber = (int) result;
        this.doubleNumber = result - intNumber;
    }
    public double toDouble() {
        return (double) this.intNumber + this.doubleNumber;
    }
    public CustomDouble plus (CustomDouble second) {
        double result = this.toDouble() + second.toDouble();
        return new CustomDouble(result);
    }
    public CustomDouble plus (double second) {
        return this.plus(new CustomDouble(second));
    }
    public CustomDouble subtract (CustomDouble second) {
        double result = this.toDouble() - second.toDouble();
        return new CustomDouble(result);
    }
    public CustomDouble subtract (double second) {
        return this.subtract(new CustomDouble(second));
    }

    public void compare (CustomDouble second) {
        double result = this.toDouble() - second.toDouble();
        if (result == 0) {
            System.out.println(" First = second ");
        }
        else if (result > 0) {
            System.out.println(" First > second ");
        }
        else {
            System.out.println(" First < second ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDouble that = (CustomDouble) o;
        return intNumber == that.intNumber && Double.compare(that.doubleNumber, doubleNumber) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intNumber, doubleNumber);
    }

    @Override
    public String toString() {
        return " " + this.toDouble();
    }
}
