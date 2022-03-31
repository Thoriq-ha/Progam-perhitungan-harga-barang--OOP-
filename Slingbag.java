public class Slingbag extends Tas {
    private int _jumlahTali;

    Slingbag(int jumlahTali) {
        _jumlahTali = jumlahTali;
    }

    public int getJumlahTali() {
        return _jumlahTali;
    }

    @Override
    public double hitungHargaPotonganDiskon() {
        return getPersenDiskon() * getHargaJual();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Tali :" + _jumlahTali);
    }
}
