import java.util.Collection;
// import java.util.List;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Room cambridge = new Room("Premiere Room", "Cambridge", 4,175.50);
        Room manchester = new Room("Suite", "Suite",6,250.00);
        Room piccadilly = new Room("Guest Room","Piccadilly",2,100.00);
        Room oxford = new Room("Suite Room","Oxford",5,275.00);
        Collection<Room> rooms = Arrays.asList(cambridge, manchester, piccadilly, oxford);

        double totalRevenue = getPotentialRevenue(rooms);
        System.out.println(totalRevenue);
    }

    private static double getPotentialRevenue(Collection<Room> rooms){
        return rooms.stream()
                .mapToDouble(Room::getRate)
                .sum();
    }
}
