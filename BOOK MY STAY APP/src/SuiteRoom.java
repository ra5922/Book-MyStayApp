class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 6000.0, 400);
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + getBeds());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Size: " + getSize() + " sq.ft");
    }
}
