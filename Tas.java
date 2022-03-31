public class Tas implements Diskon {
    private String jenisTas;
    private String warnaDasar;
    private String bahan;
    private double hargaJual;
    private double persenDiskon;

    public String getJenisTas() {
        return jenisTas;
    }

    public void setJenisTas(String jenisTas) {
        this.jenisTas = jenisTas;
    }

    public String getWarnaDasar() {
        return warnaDasar;
    }

    public void setWarnaDasar(String warnaDasar) {
        this.warnaDasar = warnaDasar;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public double getPersenDiskon() {
        return persenDiskon;
    }

    public void setPersenDiskon(double persenDiskon) {
        this.persenDiskon = persenDiskon;
    }

    public void cetakInfo() {
        System.out.println("Jenis Tas :" + jenisTas);
        System.out.println("Warna Dasar :" + warnaDasar);
        System.out.println("Bahan :" + bahan);
        System.out.println("Harga Jual :" + hargaJual);
        System.out.println("Persen Diskon :" + persenDiskon);
    }

    @Override
    public double hitungHargaPotonganDiskon() {
        return 0;
    }

    @Override
    public double hitungHargaSetelahDiskon() {
        return hargaJual - hitungHargaPotonganDiskon();
    }
}
