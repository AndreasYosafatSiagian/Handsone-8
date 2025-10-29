public class Vehicle {
    // Properties
    protected String merk;
    protected String model;
    protected int tahunProduksi;
    protected String nomorPolisi;
    protected double hargaRentalPerHari;
    protected boolean tersedia;

    // Constructor
    public Vehicle(String merk, String model, int tahunProduksi,
                   String nomorPolisi, double hargaRentalPerHari) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.nomorPolisi = nomorPolisi;
        this.hargaRentalPerHari = hargaRentalPerHari;
        this.tersedia = true;
    }

    // Method untuk rental
    public double hitungBiayaRental(int jumlahHari) {
        return hargaRentalPerHari * jumlahHari;
    }

    // Method displayInfo
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahunProduksi);
        System.out.println("No Polisi: " + nomorPolisi);
        System.out.println("Harga Rental/Hari: Rp " + String.format("%,.0f", hargaRentalPerHari));
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Maintenance"));
    }

    // Getters and setters
    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public double getHargaRentalPerHari() {
        return hargaRentalPerHari;
    }

    public String getMerk() {
        return merk;
    }
}
