public class TasTestDrive {
    public static void main(String[] args) {
        Bacpack tasBacpack = new Bacpack(2);
        Slingbag tasSlingBag = new Slingbag(3);
        Totebag tasToteBag = new Totebag(10);

        /*
         * NIM = 19650026
         * A = (NIM terakhir + 1) | A = 6 + 1 = 7
         * B = (NIM 2 digit sebelum terakhir + 1) | B = 2 + 1 = 3
         * C = (NIM 3 digit sebelum terakhir +1) | C = 0 + 1 = 1
         */
        final int a = 7;
        final int b = 3;
        final int c = 1;

        System.out.println("Tas Backpack");
        tasBacpack.setJenisTas("For men");
        tasBacpack.setWarnaDasar("Hijau");
        tasBacpack.setBahan("Katun");
        tasBacpack.setHargaJual(200000);
        tasBacpack.setPersenDiskon((((50 / tasBacpack.getJumlahKantong()) + a) / 100.0));
        tasBacpack.cetakInfo();
        System.out.println("Harga Potongan diskon adalah = " + tasBacpack.hitungHargaPotonganDiskon());
        System.out.println("Harga Setelah diskon adalah = " + tasBacpack.hitungHargaSetelahDiskon());

        System.out.println("---");
        System.out.println("Tas SlingBag");
        tasSlingBag.setJenisTas("For Women");
        tasSlingBag.setWarnaDasar("Kuning");
        tasSlingBag.setBahan("Katun");
        tasSlingBag.setHargaJual(300000);
        tasSlingBag.setPersenDiskon((((50 / tasSlingBag.getJumlahTali()) + b) / 100.0));
        tasSlingBag.cetakInfo();
        System.out.println("Harga Potongan diskon adalah = " + tasSlingBag.hitungHargaPotonganDiskon());
        System.out.println("Harga Setelah diskon adalah = " + tasSlingBag.hitungHargaSetelahDiskon());

        System.out.println("---");
        System.out.println("Tas Totebag");
        tasToteBag.setJenisTas("For Couples");
        tasToteBag.setWarnaDasar("Putih");
        tasToteBag.setBahan("Kanvas");
        tasToteBag.setHargaJual(250000);
        tasToteBag.setPersenDiskon((((50 / tasToteBag.getjumlahWarna()) + c) / 100.0));
        tasToteBag.cetakInfo();
        System.out.println("Harga Potongan diskon adalah = " + tasToteBag.hitungHargaPotonganDiskon());
        System.out.println("Harga Setelah diskon adalah = " + tasToteBag.hitungHargaSetelahDiskon());
    }
}
