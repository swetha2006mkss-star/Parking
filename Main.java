import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {

    private String vehicleNo;
    private String ownerName;
    private String vehicleType;
    private int slotNo;

    public Vehicle(String vehicleNo, String ownerName, String vehicleType, int slotNo) {
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.slotNo = slotNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }
}

public class Main {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    static final int TOTAL_SLOTS = 10;

    public static void parkVehicle(Scanner sc) {

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        for (Vehicle v : vehicles) {
            if (v.getVehicleNo().equalsIgnoreCase(number)) {
                System.out.println("Vehicle Already Exists");
                return;
            }
        }

        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Slot Number: ");
        int slot = sc.nextInt();
        sc.nextLine();

        if (slot < 1 || slot > TOTAL_SLOTS) {
            System.out.println("Invalid Slot");
            return;
        }

        for (Vehicle v : vehicles) {
            if (v.getSlotNo() == slot) {
                System.out.println("Slot Already Occupied");
                return;
            }
        }

        vehicles.add(new Vehicle(number, owner, type, slot));
        System.out.println("Vehicle Parked Successfully");
    }

    public static void removeVehicle(Scanner sc) {

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getVehicleNo().equalsIgnoreCase(number)) {
                vehicles.remove(i);
                System.out.println("Vehicle Removed");
                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public static void searchVehicle(Scanner sc) {

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        for (Vehicle v : vehicles) {
            if (v.getVehicleNo().equalsIgnoreCase(number)) {

                System.out.println("Vehicle Number: " + v.getVehicleNo());
                System.out.println("Owner Name: " + v.getOwnerName());
                System.out.println("Vehicle Type: " + v.getVehicleType());
                System.out.println("Slot Number: " + v.getSlotNo());
                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public static void viewAllVehicles() {

        if (vehicles.isEmpty()) {
            System.out.println("No Vehicles Parked");
            return;
        }

        for (Vehicle v : vehicles) {
            System.out.println("----------------------");
            System.out.println("Vehicle Number: " + v.getVehicleNo());
            System.out.println("Owner Name: " + v.getOwnerName());
            System.out.println("Vehicle Type: " + v.getVehicleType());
            System.out.println("Slot Number: " + v.getSlotNo());
        }
    }

    public static void showFreeSlots() {

        System.out.println("Free Slots:");

        for (int i = 1; i <= TOTAL_SLOTS; i++) {

            boolean free = true;

            for (Vehicle v : vehicles) {
                if (v.getSlotNo() == i) {
                    free = false;
                    break;
                }
            }

            if (free) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("=== Parking Management System ===");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. View All Vehicles");
            System.out.println("5. Show Free Slots");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    parkVehicle(sc);
                    break;

                case 2:
                    removeVehicle(sc);
                    break;

                case 3:
                    searchVehicle(sc);
                    break;

                case 4:
                    viewAllVehicles();
                    break;

                case 5:
                    showFreeSlots();
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}