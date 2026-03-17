abstract class Room {
    private String roomType;
    private int beds;
    private double price;
    private int size;

    public Room(String roomType, int beds, double price, int size) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
        this.size = size;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public abstract void displayDetails();
}

