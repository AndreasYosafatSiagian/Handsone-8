public class Kendaraan {
    protected String merk;
    protected String warna;
    protected int tahunProduksi;
    private String nomorRangka;

    public Kendaraan(String merk, String warna, int tahunProduksi) {
        System.out.println("Constructor Kendaraan dipanggil");
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.nomorRangka = generateNomorRangka(merk, tahunProduksi);
    }

    private String generateNomorRangka(String merk, int tahun) {
        return merk.substring(0, 3).toUpperCase() + tahun + "001";
    }

    public String getNomorRangka() {
        return nomorRangka;
    }

    public void displayInfo() {
        System.out.println("\n=== Info Kendaraan ===");
        System.out.println("Merk           : " + merk);
        System.out.println("Warna          : " + warna);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }

    public void klakson() {
        System.out.println("Tin tin!");
    }
}
