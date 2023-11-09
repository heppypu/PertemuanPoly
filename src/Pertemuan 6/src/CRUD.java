package Pertemuan

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CRUD {
// class ini merupakan kumpulan menu program
    /*
     * di class ini bisa:
     * 1. menambahkan import lib java IO di setiap method
     * 2. emnambahkan tipe data array untuk penyimpanan array
     * 3. bufferedreader ditambahkan di masing2 method
     */

    // array: 1[baris] dan 2[baris][kolom] dimensi

    // deklarasi array berdasarkan class yang ada (laundry dan transaksi)

    Laundry master[];
    transaksiLaundry transaksi[];

    String jenis, metode, kode, nama, tglCuci, tglAmbil;
    int harga, berat;

    public void insertMasterData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // perlu 2 data untuk inpur master
        // deklarasi ulang array
        master = new Laundry[2];

        // ketika menggunakan array, input dan output menggunaan loop --> for
        for (int i = 0; i < master.length; i++) {
            // copas dari main class menu 1
            System.out.print("Entri jenis cucian: ");
            jenis = br.readLine();
            System.out.print("Entri harga: ");
            harga = Integer.parseInt(br.readLine());
            System.out.print("Entri metode: ");
            metode = br.readLine();
            master[i] = new Laundry(jenis, metode, harga);
            System.out.println();
        }

    }

    public void insertTransaksi() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        transaksi = new transaksiLaundry[1];

        for (int i = 0; i < transaksi.length; i++) {
            System.out.print("Entri Kode: ");
            kode = br.readLine();
            System.out.print("Entri Nama: ");
            nama = br.readLine();
            System.out.print("Entri jenis cuci \n Cuci Setrika/Cuci Kering : ");
            jenis = br.readLine();
            System.out.print("Entri Harga : ");
            harga = Integer.parseInt(br.readLine());
            System.out.print("Entri metode (Regular/Express) : ");
            metode = br.readLine();
            System.out.print("Entri berat: ");
            berat = Integer.parseInt(br.readLine());
            System.out.print("Entri tgl cuci: ");
            tglCuci = br.readLine();
            System.out.print("Entri tgl Ambil : ");
            tglAmbil = br.readLine();
            // simpan ke constructor
            transaksi[i] = new transaksiLaundry(jenis, metode, harga, kode, nama, tglCuci, tglAmbil, berat);
            System.out.println();
        }

    }

    public void cetakData() throws IOException {
        System.out.println("-- cetak data --");
        for (int i = 0; i < transaksi.length; i++) {
            transaksi[i].transaksi();
        }
    }

    public void cariData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < transaksi.length; i++) {
            System.out.print("Entri Kode transaksi yang dicari: ");
            kode = br.readLine();
            if (kode.equalsIgnoreCase(transaksi[i].getKode())) {
                transaksi[i].transaksi(kode);
            } else {
                System.out.println("kode tidak ada");
            }
        }
    }
}

