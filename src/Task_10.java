import java.util.List;

public class Task_10 {
    public static void main(String[] args) {
        final House house = new House(List.of(
                new Room( new TypeOfRoom(
                        new Kitchen(1, 6, "samsung", "philips",
                        1, "samsung")),
                        1, 2, 5, "red", 50, 3),
                new Room(new TypeOfRoom(
                        new Bedroom(2,"samsung", 2)), 1,
                        2, 4, "blue", 52, 2)


        ), 1, 3, 4);

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
