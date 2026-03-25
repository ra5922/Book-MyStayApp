import java.util.LinkedList;
import java.util.Queue;

class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        queue.offer(reservation);
        System.out.println("Request added for " + reservation.getGuestName());
    }

    // ✅ MUST EXIST (fixes your error)
    public Reservation pollRequest() {
        return queue.poll();
    }
}

