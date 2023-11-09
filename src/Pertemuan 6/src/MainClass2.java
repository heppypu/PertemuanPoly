package Pertemuan

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainClass2 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // instance of class
            CRUD crud = new CRUD();

            // deklarasi variabel

            // menu
            // loop
            do {
                System.out.println("-- Laundryku --");
                System.out.println("1. Menu Master");
                System.out.println("2. Menu Transaksi");
                System.out.println("3. Menu Cari Data");
                System.out.println("4. Menu Keluar");
                System.out.print("Masukkan pilihan menu : ");
                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    case 1:
                        System.out.println("-- 1. Menu Master Data");
                        crud.insertMasterData();
                        break;
                    case 2:
                        System.out.println("-- 2. Menu Transaksi");
                        crud.insertTransaksi();
                        System.out.println("--- Cetak Data ---");
                        crud.cetakData();
                        break;
                    case 3:
                        System.out.println("-- 3. Menu Cari Data");
                        crud.cariData();
                        break;
                    default:
                        System.exit(0);
                }
            } while (true);
        }
    }


