public class BasicInheritancePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Basic Inheritance
         * Implementasi lengkap semua latihan (1–7)
         */

        // ===== INHERITANCE DASAR =====
        System.out.println("=== INHERITANCE DASAR ===");

        // Latihan 1
        Mobil mobil = new Mobil("Toyota", "Hitam", 2022, 4, "Bensin");
        mobil.displayInfo();
        mobil.nyalakanAC();

        // Latihan 2
        Motor motor = new Motor("Honda", "Merah", 2023, "Sport");
        motor.displayInfo();
        motor.klakson();
        motor.lakukanWheely();

        // ===== PENGGUNAAN SUPER =====
        System.out.println("\n=== PENGGUNAAN SUPER ===");

        // Latihan 3
        Truk truk = new Truk("Mitsubishi", "Putih", 2021, 5.0, 6);
        truk.displayInfo();

        // Latihan 4
        truk.klakson();

        // ===== MULTILEVEL INHERITANCE =====
        System.out.println("\n=== MULTILEVEL INHERITANCE ===");

        // Latihan 5
        MobilSport mobilSport = new MobilSport("Ferrari", "Merah", 2024, 2, "Bensin", true, 320);
        mobilSport.displayInfo();
        mobilSport.aktifkanTurbo();

        // ===== TESTING INHERITANCE =====
        System.out.println("\n=== TESTING INHERITANCE ===");

        // Latihan 6
        System.out.println("mobilSport instanceof MobilSport: " + (mobilSport instanceof MobilSport));
        System.out.println("mobilSport instanceof Mobil: " + (mobilSport instanceof Mobil));
        System.out.println("mobilSport instanceof Kendaraan: " + (mobilSport instanceof Kendaraan));
        System.out.println("mobilSport instanceof Object: " + (mobilSport instanceof Object));

        // Latihan 7
        System.out.println("\nProtected property (merk): " + mobilSport.merk);
        System.out.println("Private property via getter (nomorRangka): " + mobilSport.getNomorRangka());
    }
}
