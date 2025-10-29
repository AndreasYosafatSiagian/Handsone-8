public class Main {
    public static void main(String[] args) {
        Vehicle mobil = new Vehicle("Toyota", "Avanza", 2021, "B 1234 CD", 350000);
        mobil.displayInfo();

        double biaya = mobil.hitungBiayaRental(3);
        System.out.println("Biaya rental 3 hari: Rp " + biaya);
    }
}
