import java.util.ArrayList;
import java.util.List;

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Step 1: Initialize inventory (from Use Case 3)
        RoomInventory inventory = new RoomInventory();

        // Step 2: Create room objects (domain model)
        List<Room> rooms = new ArrayList<>();
        rooms.add(new SingleRoom());
        rooms.add(new DoubleRoom());
        rooms.add(new SuiteRoom());

        // Step 3: Initialize search service
        SearchService searchService = new SearchService(inventory);

        // Step 4: Perform search (READ ONLY)
        searchService.searchAvailableRooms(rooms);
    }
}
