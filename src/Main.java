public class Main {
    static void main() {
        VehicleReport truckReport = new TruckReport();
        VehicleReport bikeReport = new BikeReport();
        System.out.println("Creating report for truck ---\n");
        truckReport.generateReport();
        System.out.println("\nCreating report for bike ---\n");
        bikeReport.generateReport();
    }
}
