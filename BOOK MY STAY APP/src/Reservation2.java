/**
 * Booking request data
 */
public class Reservation2{

    private String guestName;
    private String roomType;

    public Reservation2(String guestName,String roomType){
        this.guestName=guestName;
        this.roomType=roomType;
    }

    public String getGuestName(){
        return guestName;
    }

    public String getRoomType(){
        return roomType;
    }
}
