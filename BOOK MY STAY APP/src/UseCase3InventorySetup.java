public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        System.out.println("\n--- Updating Inventory ---");

        // Update example
        inventory.updateAvailability("Single Room", 4);

        // Fetch availability
        int singleAvailable = inventory.getAvailability("Single Room");
        System.out.println("Updated Single Room Availability: " + singleAvailable);

        System.out.println();

        // Display updated inventory
        inventory.displayInventory();
    }
}
