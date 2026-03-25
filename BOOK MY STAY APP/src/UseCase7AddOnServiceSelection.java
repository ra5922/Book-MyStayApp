public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        // Create manager
        AddOnServiceManager manager = new AddOnServiceManager();

        // Dummy reservation IDs (from previous use case)
        String res1 = "RES101";
        String res2 = "RES102";

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService wifi = new AddOnService("WiFi", 200);
        AddOnService spa = new AddOnService("Spa", 1500);

        // Add services
        manager.addService(res1, breakfast);
        manager.addService(res1, wifi);
        manager.addService(res2, spa);

        // Display services
        manager.displayServices(res1);
        manager.displayServices(res2);

        // Show total cost
        double total1 = manager.calculateTotalCost(res1);
        double total2 = manager.calculateTotalCost(res2);

        System.out.println("\nTotal cost for " + res1 + ": ₹" + total1);
        System.out.println("Total cost for " + res2 + ": ₹" + total2);
    }
}