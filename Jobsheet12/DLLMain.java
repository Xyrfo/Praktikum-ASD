package Jobsheet12;

import java.util.Scanner;

public class DLLMain {
    public static Mahasiswa26 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa26(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
                System.out.println("\nMenu Double Linked List Mahasiswa");
                System.out.println("1. Tambah di Awal");
                System.out.println("2. Tambah di Akhir");
                System.out.println("3. Hapus di Awal");
                System.out.println("4. Hapus di Akhir");
                System.out.println("5. Tampilkan Data");
                System.out.println("6. Cari Mahasiswa Berdasarkan NIM");
                System.out.println("7. Sisipkan Setelah NIM Tertentu");
                System.out.println("8. Menambahkan Data Mahasiswa di index Tertentu");
                System.out.println("9. Menghapus Data Mahasiswa setelah NIM Tertentu");
                System.out.println("10. Menghapus Data Mahasiswa di index Tertentu");
                System.out.println("11. Menampilkan Data di Awal");
                System.out.println("12. Menampilkan Data di Akhir");
                System.out.println("13. Menampilkan Data Mahasiswa di index Tertentu");
                System.out.println("14. Jumlah Data Mahasiswa");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scan.nextInt();
                scan.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa26 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {                    
                    Mahasiswa26 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();                
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node26 found = list.search(nim);                    
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM untuk sisipkan setelah: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa26 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan index untuk menambahkan data: ");
                    int index = scan.nextInt(); scan.nextLine();
                    Mahasiswa26 mhs = inputMahasiswa(scan);
                    list.add(mhs, index);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                    String keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                }
                case 10 -> {
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int index = scan.nextInt(); scan.nextLine();
                    list.remove(index);
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan index yang ingin ditampilkan: ");
                    int index = scan.nextInt(); scan.nextLine();
                    list.getIndex(index);
                }
                case 14 -> System.out.println("Jumlah data mahasiswa: " + list.size());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0); {
            scan.close();
        }
    }
}
