import java.util.List;

public class Task_10 {
    public static void main(String[] args) {

        final House house = new House(List.of(
                new Kitchen(1, 2, 5, "red", 50, 3,
                        1, 6, "samsung", "philips", 1,
                        "samsung"),
                new Bedroom(1, 3, 6, "blue", 72, 4,
                        2, "samsung", 4)
        ),1, 3, 4);


        System.out.println(house);

        house.getRooms().get(1).increaseNumberOfWindows();
        house.getRooms().get(0).increaseNumberOfDoors();

        house.increaseNumberOfEnteries();
        house.reduceNumberOfFloors();

        System.out.println("hashcode:  " + house.getRooms().get(1).hashCode());
        System.out.println("equals:  " + house.getRooms().get(0).equals(1));

        System.out.println(house);
    }
}
