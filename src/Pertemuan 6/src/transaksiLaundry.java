package Pertemuan

public class transaksiLaundry extends Laundry {
    private String kode, namaPelanggan, tglcuci, tglAmbil;
    private int berat;

    // constructor
    public transaksiLaundry(String jenisCuci, String metode, int harga, String kode, String namaPelanggan,
                            String tglcuci, String tglAmbil, int berat) {
        super(jenisCuci, metode, harga);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.tglcuci = tglcuci;
        this.tglAmbil = tglAmbil;
        this.berat = berat;
    }

    // getter
    public String getKode() {
        return kode;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getTglcuci() {
        return tglcuci;
    }

    public String getTglAmbil() {
        return tglAmbil;
    }

    public int getBerat() {
        return berat;
    }

    // method tambahan --> getTotal, overloading method
    public int getTotal() {
        // menghitung sub total jasa cuci
        return getBerat() * getHarga();
    }

    // overloading
    public void transaksi() { // cetakdata
        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Jenis Cuci : " + getJenisCuci());
        System.out.println("Metode Reguler/Express : " + getMetode());
        System.out.println("Harga jasa : " + getHarga());
        System.out.println("Tanggal cuci : " + getTglcuci());
        System.out.println("Tanggal ambil: " + getTglAmbil());
        System.out.println("Berat cucian: " + getBerat());
        System.out.println("Sub Total : " + getTotal()); // sub total (hrg+berat)
        System.out.println("Total : " + cuciExpress()); // + jasa express
    }

    // searching data --> tahu dulu kode transaksinya.
    public void transaksi(String kode) {
        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Jenis Cuci : " + getJenisCuci());
        System.out.println("Metode Reguler/Express : " + getMetode());
        System.out.println("Harga jasa : " + getHarga());
        System.out.println("Tanggal cuci : " + getTglcuci());
        System.out.println("Tanggal ambil: " + getTglAmbil());
        System.out.println("Berat cucian: " + getBerat());
        System.out.println("Sub Total : " + getTotal()); // sub total (hrg+berat)
        System.out.println("Total : " + cuciExpress()); // + jasa express
    }

    // overriding
    @Override
    public int cuciExpress() {
        // menjumlahkan sub total dengan biaya express
        // misal: sub tpta; = 1600 + 5000, shg total = 21000
        // boleh memanggil fungsi di dalam fungsi
        int total = getTotal();
        if (getMetode().equalsIgnoreCase("express")) {
            total += super.cuciExpress();
            // 16000 = 16000+5000
        }
        return total;
    }

}
