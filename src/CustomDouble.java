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

    public CustomDouble sum (CustomDouble second) {
        double result = this.toDouble() + second.toDouble();
        return new CustomDouble(result);
    }

    public CustomDouble subtraction (CustomDouble second) {
        double result = this.toDouble() - second.toDouble();
        return new CustomDouble(result);
    }

    public void comparison (CustomDouble second) {
        double result = this.toDouble() - second.toDouble();
        if (result == 0) {
            System.out.println("Перше число рівне другому");
        }
        else if (result > 0) {
            System.out.println("Перше число більше ніж друге");
        }
        else {
            System.out.println("Друге число більше ніж перше");
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
