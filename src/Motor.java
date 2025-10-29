public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merk, String warna, int tahunProduksi, String jenisMotor) {
        super(merk, warna, tahunProduksi);
        System.out.println("Constructor Motor dipanggil");
        this.jenisMotor = jenisMotor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Motor    : " + jenisMotor);
    }

    @Override
    public void klakson() {
        System.out.println("Tiiin tiiin! (suara motor)");
    }

    public void lakukanWheely() {
        System.out.println(merk + " melakukan wheelie!");
    }
}
