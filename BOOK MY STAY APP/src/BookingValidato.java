/**
 * Validates booking input and system state
 */
public class BookingValidato{

    public static void validate(Reservation2 r,RoomInventory1 inv)
            throws InvalidBookingException{

        // Validate guest name
        if(r.getGuestName()==null || r.getGuestName().isEmpty()){
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        // Validate room type exists
        if(!inv.isValidRoomType(r.getRoomType())){
            throw new InvalidBookingException("Invalid room type: "+r.getRoomType());
        }

        // Validate availability
        if(inv.getAvailability(r.getRoomType())<=0){
            throw new InvalidBookingException("Room not available: "+r.getRoomType());
        }
    }
}
