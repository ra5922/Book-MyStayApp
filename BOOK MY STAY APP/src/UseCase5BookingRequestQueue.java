public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        // Step 1: Initialize queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Step 2: Create booking requests
        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Double Room");
        Reservation r3 = new Reservation("Charlie", "Suite Room");

        // Step 3: Add requests to queue (FIFO order)
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Step 4: Display queue (NO processing yet)
        bookingQueue.viewRequests();
    }
}
