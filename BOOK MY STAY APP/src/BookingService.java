import java.util.*;

class BookingService {

    private RoomInventory inventory;
    private BookingRequestQueue queue;

    private Set<String> allocatedRoomIds = new HashSet<>();
    private Map<String, Set<String>> roomAllocations = new HashMap<>();

    public BookingService(RoomInventory inventory, BookingRequestQueue queue) {
        this.inventory = inventory;
        this.queue = queue;
    }

    public void processBookings() {

        System.out.println("\n=== Processing Booking Requests ===");

        while (true) {

            // ✅ Correct method call
            Reservation request = queue.processNextRequest();

            if (request == null) break;

            String roomType = request.getRoomType();
            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                String roomId = generateRoomId(roomType);

                allocatedRoomIds.add(roomId);

                roomAllocations.putIfAbsent(roomType, new HashSet<>());
                roomAllocations.get(roomType).add(roomId);

                // Update inventory
                inventory.updateAvailability(roomType, available - 1);

                System.out.println("Booking Confirmed → "
                        + request.getGuestName()
                        + " | Room ID: " + roomId);

            } else {
                System.out.println("Booking Failed (No Availability) → "
                        + request.getGuestName());
            }
        }
    }

    private String generateRoomId(String roomType) {

        String prefix = roomType.replace(" ", "").substring(0, 3).toUpperCase();
        String roomId;

        do {
            roomId = prefix + "_" + (int)(Math.random() * 1000);
        } while (allocatedRoomIds.contains(roomId));

        return roomId;
    }
}


