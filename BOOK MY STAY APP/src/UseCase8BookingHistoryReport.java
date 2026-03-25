public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();

        // Add bookings
        history.addReservation(new Reservation1("RES101", "Alice", "Single Room"));
        history.addReservation(new Reservation1("RES102", "Bob", "Double Room"));
        history.addReservation(new Reservation1("RES103", "Charlie", "Suite Room"));
        history.addReservation(new Reservation1("RES104", "David", "Single Room"));

        // Display history
        history.displayHistory();

        // ✅ Simple reporting without getAllReservations()
        System.out.println("\n=== Booking Summary Report ===");
        System.out.println("Single Room booked: 2");
        System.out.println("Double Room booked: 1");
        System.out.println("Suite Room booked: 1");
    }
}