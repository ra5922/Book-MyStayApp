import java.util.*;

class BookingHistory {

    private List<Reservation1> history;

    public BookingHistory() {
        history = new ArrayList<>();
    }

    public void addReservation(Reservation1 reservation) {
        history.add(reservation);
        System.out.println("Added to history: " + reservation.getReservationId());
    }

    public List<Reservation1> getAllReservations() {
        return history;
    }

    public void displayHistory() {

        System.out.println("\n=== Booking History ===");

        if (history.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Reservation1 r : history) {
            System.out.println("ID: " + r.getReservationId()
                    + " | Guest: " + r.getGuestName()
                    + " | Room: " + r.getRoomType());
        }
    }
}
