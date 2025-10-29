public class RentalTransaction {
    private String namaPelanggan;
    private Vehicle kendaraan;
    private int durasiHari;
    private double totalBiaya;

    public RentalTransaction(String namaPelanggan, Vehicle kendaraan, int durasiHari) {
        this.namaPelanggan = namaPelanggan;
        this.kendaraan = kendaraan;
        this.durasiHari = durasiHari;
        this.totalBiaya = kendaraan.hitungBiayaRental(durasiHari);
        kendaraan.setTersedia(false);
    }

    public void displayRentalDetails() {
        System.out.println("Rental untuk: " + namaPelanggan);
        System.out.println("Kendaraan: " + kendaraan.merk + " (" +
                (kendaraan instanceof Car ? "Mobil" : "Motor") + ")");
        System.out.println("Durasi: " + durasiHari + " hari");
        System.out.println("Biaya per hari: Rp " + String.format("%,.0f", kendaraan.getHargaRentalPerHari()));
        System.out.println("Total biaya: Rp " + String.format("%,.0f", totalBiaya));
        System.out.println("------------------------");
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}
