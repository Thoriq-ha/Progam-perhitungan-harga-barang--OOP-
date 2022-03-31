public class Totebag extends Tas {
    private int _jumlahWarna;

    Totebag(int jumlahWarna) {
        _jumlahWarna = jumlahWarna;
    }

    public int getjumlahWarna() {
        return _jumlahWarna;
    }

    @Override
    public double hitungHargaPotonganDiskon() {
        return getPersenDiskon() * getHargaJual();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Warna :" + _jumlahWarna);
    }
}
