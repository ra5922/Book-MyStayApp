public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        BookingRequestQueue queue = new BookingRequestQueue();

        // Add booking requests
        queue.addRequest(new Reservation("Alice", "Single Room"));
        queue.addRequest(new Reservation("Bob", "Single Room"));
        queue.addRequest(new Reservation("Charlie", "Suite Room"));
        queue.addRequest(new Reservation("David", "Suite Room"));
        queue.addRequest(new Reservation("Eve", "Suite Room"));

        // Process bookings
        BookingService service = new BookingService(inventory, queue);
        service.processBookings();

        // Show final inventory
        inventory.displayInventory();
    }
}
