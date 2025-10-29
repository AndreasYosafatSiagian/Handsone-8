public class Motorcycle extends Vehicle {
    private String jenisMotor; // "Sport", "Matic", "Bebek"
    private int kapasitasMesin; // dalam CC

    public Motorcycle(String merk, String model, int tahunProduksi,
                      String nomorPolisi, double hargaRentalPerHari,
                      String jenisMotor, int kapasitasMesin) {
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jenisMotor = jenisMotor;
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis: Motor");
        System.out.println("Tipe Motor: " + jenisMotor);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
        System.out.println("------------------------");
    }

    @Override
    public double hitungBiayaRental(int jumlahHari) {
        double diskon = 0.9; // Motor lebih murah
        return super.hitungBiayaRental(jumlahHari) * diskon;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }
}
