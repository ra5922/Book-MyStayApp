import java.util.*;

class BookingReportService {

    public void showAllBookings(List<Reservation1> reservations) {

        System.out.println("\n=== Booking History (Report) ===");

        if (reservations.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        for (Reservation1 r : reservations) {
            System.out.println("ID: " + r.getReservationId()
                    + " | Guest: " + r.getGuestName()
                    + " | Room: " + r.getRoomType());
        }
    }

    public void generateSummary(List<Reservation> reservations) {

        System.out.println("\n=== Booking Summary Report ===");

        Map<String, Integer> countMap = new HashMap<>();

        for (Reservation r : reservations) {
            String roomType = r.getRoomType();
            countMap.put(roomType, countMap.getOrDefault(roomType, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " booked: " + entry.getValue());
        }
    }
}
