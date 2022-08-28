import java.util.Objects;

public class CustomDoubleForCalc {
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

    public CustomDoubleForCalc(int intNumber, double doubleNumber) {
        this.intNumber = intNumber;
        this.doubleNumber = doubleNumber;
    }
    public CustomDoubleForCalc(double result) {   //???
        this.intNumber = (int) result;
        this.doubleNumber = result - intNumber;
    }
    public double toDouble() {
        return (double) this.intNumber + this.doubleNumber;
    }
    public CustomDoubleForCalc sum (CustomDoubleForCalc second) {
        double result = this.toDouble() + second.toDouble();
        return new CustomDoubleForCalc(result);
    }
    public CustomDoubleForCalc sum (double second) {
        return this.sum(new CustomDoubleForCalc(second));
    }
    public CustomDoubleForCalc subtraction (CustomDoubleForCalc second) {
        double result = this.toDouble() - second.toDouble();
        return new CustomDoubleForCalc(result);
    }
    public CustomDoubleForCalc subtraction (double second) {
        return this.subtraction(new CustomDoubleForCalc(second));
    }
    public CustomDoubleForCalc multiplication (CustomDoubleForCalc second) {
        double result =  intNumber * second.intNumber + intNumber * second.doubleNumber + doubleNumber * second.intNumber + doubleNumber * second.doubleNumber;
        return new CustomDoubleForCalc(result);
    }
    public CustomDoubleForCalc multiplication (double second) {
        return this.multiplication(new CustomDoubleForCalc(second));
    }
    public CustomDoubleForCalc division(CustomDoubleForCalc second) {
        double result = this.toDouble() / second.toDouble();
        return new CustomDoubleForCalc(result);
    }

    public CustomDoubleForCalc division(double second) {
        return this.division(new CustomDoubleForCalc(second));
    }

    public void comparison (CustomDoubleForCalc second) {
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
        CustomDoubleForCalc that = (CustomDoubleForCalc) o;
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
