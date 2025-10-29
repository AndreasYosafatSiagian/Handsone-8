public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merk, warna, tahunProduksi);
        System.out.println("Constructor Mobil dipanggil");
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
        System.out.println("Bahan Bakar    : " + jenisBahanBakar);
    }

    public void nyalakanAC() {
        System.out.println("AC menyala");
    }
}
