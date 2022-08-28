import java.util.Objects;

public class TypeOfRoom {
    private Kitchen kitchen;
    private Bedroom bedroom;
    private Bathroom bathroom;
    private Livingroom livingroom;

    public TypeOfRoom(final Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    public TypeOfRoom(final Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public TypeOfRoom(final Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public TypeOfRoom(final Livingroom livingroom) {
        this.livingroom = livingroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(final Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(final Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(final Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Livingroom getLivingroom() {
        return livingroom;
    }

    public void setLivingroom(final Livingroom livingroom) {
        this.livingroom = livingroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfRoom that = (TypeOfRoom) o;
        return kitchen.equals(that.kitchen) && bedroom.equals(that.bedroom) && bathroom.equals(that.bathroom) && livingroom.equals(that.livingroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kitchen, bedroom, bathroom, livingroom);
    }

    @Override
    public String toString() {
        return "TypeOfRoom{" +
                "kitchen=" + kitchen +
                ", bedroom=" + bedroom +
                ", bathroom=" + bathroom +
                ", livingroom=" + livingroom +
                '}';
    }
}
