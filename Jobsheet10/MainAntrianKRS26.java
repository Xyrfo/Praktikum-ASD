package Jobsheet10;

import java.util.Scanner;

public class MainAntrianKRS26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS26 antrian = new AntrianKRS26(10);
        int mahasiswaDilayani = 0;
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    DataAntrianKRS26 mhs = new DataAntrianKRS26(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    DataAntrianKRS26 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    mahasiswaDilayani += 2;
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlahAntrian());
                    System.out.println("Jumlah mahasiswa yang sudah dilayani: " + mahasiswaDilayani);
                    System.out.println("Jumlah mahasiswa yang belum melakukan KRS: " + (antrian.getJumlahAntrian() + mahasiswaDilayani));
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 7:
                    antrian.KosongkanAntrian();
                    mahasiswaDilayani = 0;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
