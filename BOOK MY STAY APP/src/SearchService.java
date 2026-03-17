import java.util.List;

class SearchService {

    private RoomInventory inventory;

    public SearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    // Read-only search method
    public void searchAvailableRooms(List<Room> rooms) {

        System.out.println("=== Available Rooms ===");

        for (Room room : rooms) {

            int available = inventory.getAvailability(room.getRoomType());

            // Filter unavailable rooms
            if (available > 0) {
                room.displayDetails();
                System.out.println("Available: " + available);
                System.out.println("----------------------");
            }
        }
    }
}
