import java.util.*;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        /*
         * REAL-WORLD PROJECT: Vehicle Rental Management System
         *
         * Deskripsi: Sistem untuk mengelola rental kendaraan dengan berbagai
         * tipe kendaraan dan perhitungan biaya rental yang berbeda.
         */

        // ===== SETUP RENTAL SYSTEM =====
        System.out.println("=== VEHICLE RENTAL MANAGEMENT SYSTEM ===\n");

        // ===== LATIHAN 1: Create vehicle fleet =====
        List<Vehicle> fleet = new ArrayList<>();

        // Buat 3 Mobil
        fleet.add(new Car("Toyota", "Avanza", 2022, "B 1234 XY", 300000, 7, "Automatic", true));
        fleet.add(new Car("Honda", "Jazz", 2021, "B 5678 ZA", 350000, 5, "Manual", true));
        fleet.add(new Car("Suzuki", "Ertiga", 2020, "B 9101 QW", 280000, 7, "Automatic", false));

        // Buat 2 Motor
        fleet.add(new Motorcycle("Honda", "Beat", 2022, "B 1111 XX", 120000, "Matic", 110));
        fleet.add(new Motorcycle("Yamaha", "NMAX", 2023, "B 2222 YY", 150000, "Sport", 155));

        System.out.println("Fleet created: " + fleet.size() + " vehicles\n");

        // ===== LATIHAN 2: Display all vehicles =====
        System.out.println("=== DAFTAR KENDARAAN ===");
        for (Vehicle v : fleet) {
            v.displayInfo();
        }

        // ===== LATIHAN 3: Rent a vehicle =====
        System.out.println("\n=== RENTAL TRANSACTION ===");
        RentalTransaction r1 = new RentalTransaction("Andi", fleet.get(0), 3);
        r1.displayRentalDetails();

        // ===== LATIHAN 4: Calculate monthly revenue =====
        System.out.println("=== MONTHLY REVENUE ===");
        RentalTransaction r2 = new RentalTransaction("Budi", fleet.get(1), 5);
        RentalTransaction r3 = new RentalTransaction("Cici", fleet.get(3), 4);
        RentalTransaction r4 = new RentalTransaction("Dewi", fleet.get(2), 6);

        double totalRevenue = r1.getTotalBiaya() + r2.getTotalBiaya() + r3.getTotalBiaya() + r4.getTotalBiaya();
        System.out.println("Total revenue bulan ini: Rp " + String.format("%,.0f", totalRevenue) + "\n");

        // ===== LATIHAN 5: Vehicle maintenance =====
        fleet.get(1).setTersedia(false);
        fleet.get(4).setTersedia(false);

        long available = fleet.stream().filter(Vehicle::isTersedia).count();
        long maintenance = fleet.size() - available;

        System.out.println("Available vehicles: " + available);
        System.out.println("Under maintenance: " + maintenance + "\n");

        // ===== LATIHAN 6: Find vehicles by criteria =====
        System.out.println("=== VEHICLE SEARCH ===");
        List<Car> cheapCars = new ArrayList<>();
        List<Motorcycle> maticMotors = new ArrayList<>();

        for (Vehicle v : fleet) {
            if (v instanceof Car && v.getHargaRentalPerHari() < 350000) {
                cheapCars.add((Car) v);
            }
            if (v instanceof Motorcycle && ((Motorcycle) v).getJenisMotor().equalsIgnoreCase("Matic")) {
                maticMotors.add((Motorcycle) v);
            }
        }

        System.out.println("Found " + cheapCars.size() + " Mobil sesuai kriteria");
        System.out.println("Found " + maticMotors.size() + " Motor matic\n");

        // ===== LATIHAN 7: Generate rental report =====
        System.out.println("=== RENTAL REPORT ===");
        int mobilRentals = 3; // contoh data simulasi
        int motorRentals = 2;
        double mobilRevenue = totalRevenue * 0.8;
        double motorRevenue = totalRevenue * 0.2;

        System.out.println("Mobil: " + mobilRentals + " rentals, Rp " + String.format("%,.0f", mobilRevenue));
        System.out.println("Motor: " + motorRentals + " rentals, Rp " + String.format("%,.0f", motorRevenue));
        System.out.println("Total: Rp " + String.format("%,.0f", totalRevenue));
    }
}
