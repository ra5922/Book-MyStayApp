class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 3500.0, 250);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + getBeds());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Size: " + getSize() + " sq.ft");
    }
}
