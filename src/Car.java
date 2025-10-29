public class Car extends Vehicle {
    private int jumlahPenumpang;
    private String tipeTransmisi; // "Manual", "Automatic"
    private boolean acTersedia;

    public Car(String merk, String model, int tahunProduksi, String nomorPolisi,
               double hargaRentalPerHari, int jumlahPenumpang,
               String tipeTransmisi, boolean acTersedia) {
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jumlahPenumpang = jumlahPenumpang;
        this.tipeTransmisi = tipeTransmisi;
        this.acTersedia = acTersedia;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis: Mobil");
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Transmisi: " + tipeTransmisi);
        System.out.println("AC: " + (acTersedia ? "Ada" : "Tidak Ada"));
        System.out.println("------------------------");
    }

    @Override
    public double hitungBiayaRental(int jumlahHari) {
        double total = super.hitungBiayaRental(jumlahHari);
        if (acTersedia) {
            total += 50000 * jumlahHari; // surcharge untuk AC
        }
        return total;
    }
}
