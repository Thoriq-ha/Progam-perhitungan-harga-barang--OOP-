
public class Bacpack extends Tas {
    private int _jumlahKantong;

    Bacpack(int jumlahKantong) {
        _jumlahKantong = jumlahKantong;
    }

    public int getJumlahKantong() {
        return _jumlahKantong;
    }

    @Override
    public double hitungHargaPotonganDiskon() {
        return getPersenDiskon() * getHargaJual();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Kantong :" + _jumlahKantong);
    }
}
