public class Room {

    private String name;
    private String type;
    private int capacity;
    private double rate;

    public Room(String type, String name, int capacity, double rate) {
        this.type = type;
        this.name = name;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public static String toArrayString(Room[] rooms){
        StringBuilder result = new StringBuilder("[");

        for(Room room: rooms){
           String details = "[";
           details += "Name: "+room.getName()+",";
           details += " Type: "+room.getType()+",";
           details += " Capacity: "+room.getCapacity();
           details += " Rate: "+room.getRate() +"]";
           result.append(details).append(",\n");

        }

        // to remove last comma
        result.setLength(result.length() - 1);
        result.append("]");
        return result.toString();

    }
}
