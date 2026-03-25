/**
 * Main Application
 * Use Case 9: Error Handling & Validation
 */

public class APP{

    public static void main(String[] args){

        RoomInventory1 inv=new RoomInventory1();

        // Setup inventory
        inv.addRoom("Single Room",1);
        inv.addRoom("Double Room",0);

        BookingService bs=new BookingService();

        // Valid booking
        bs.process(new Reservation2("Alice","Single Room"),inv);

        // Invalid room type
        bs.process(new Reservation2("Bob","Luxury Room"),inv);

        // No availability
        bs.process(new Reservation2("Charlie","Double Room"),inv);

        // Empty guest name
        bs.process(new Reservation2("","Single Room"),inv);
    }
}
