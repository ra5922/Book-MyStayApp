import java.util.LinkedList;
import java.util.Queue;

class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // Add booking request
    public void addRequest(Reservation reservation) {
        queue.offer(reservation);
        System.out.println("Request added for " + reservation.getGuestName());
    }

    // View all requests (without removing)
    public void viewRequests() {
        System.out.println("\n=== Booking Request Queue ===");

        for (Reservation r : queue) {
            r.display();
        }
    }

    // Get next request (for future use)
    public Reservation getNextRequest() {
        return queue.peek(); // does NOT remove
    }
}
