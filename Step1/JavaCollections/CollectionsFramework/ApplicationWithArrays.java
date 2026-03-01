public class ApplicationWithArrays {

    public static void main(String[] args) {

        /*
            Arrays Vs Collections -
            Arrays - constraint on size
            - need to specify the position of the element to do any operation
            - try adding new elements => You will hit the index out of bounds error
         */
        Room cambridge = new Room("Premiere Room", "Cambridge", 4,175.50);
        Room manchester = new Room("Suite", "Suite",6,250.00);
        Room piccadilly = new Room("Guest Room","Piccadilly",2,100.00);
        Room oxford = new Room("Suite Room","Oxford",5,275.00);

        Room[] rooms = new Room[3];
        rooms[0] = cambridge;
        rooms[1] = manchester;
        rooms[2] = piccadilly;

        Room[] moreRooms = new Room[4];
        System.arraycopy(rooms, 0, moreRooms,0,rooms.length);
        moreRooms[moreRooms.length - 1] = oxford;

        System.out.println(Room.toArrayString(moreRooms));
    }
}
