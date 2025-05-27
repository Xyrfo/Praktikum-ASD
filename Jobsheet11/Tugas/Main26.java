package Jobsheet11.Tugas;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt(); sc.nextLine();
        SLL26 linkedList = new SLL26(n);

        while (true) {
            System.out.println("===Sistem Antrian Unit Mahasiswa===");
            System.out.println("1. Daftar Mahasiswa");
            System.out.println("2. Mengosongkan Antrian");
            System.out.println("3. Menambahkan Antrian");
            System.out.println("4. Memanggil Antrian");
            System.out.println("5. Menampilkan Antrian Terdepan");
            System.out.println("6. Menampilkan Antrian Terakhir");
            System.out.println("7. Menampilkan Jumlah Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt(); sc.nextLine();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = sc.nextLine();
                System.out.print("Masukkan kelas mahasiswa: ");
                String kelas = sc.nextLine();
                Mahasiswa26 mhs = new Mahasiswa26(nama, nim, kelas);
                linkedList.tambahAntrian(mhs);
            case 2:
                linkedList.clear();
                break;
            case 3:
                linkedList.dequeue();
                break;
            case 4:
                linkedList.panggilAntrian();
                break;
            case 5:
                linkedList.tampilDepan();
                break;
            case 6:
                linkedList.tampilAkhir();
                break;
            case 7:
                linkedList.tampilJumlahAntrian();
                break;
            case 8:
                System.out.println("Terima kasih telah menggunakan sistem antrian.");
                System.exit(0);
            default:
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
                break;
            }
        }
    }
}

