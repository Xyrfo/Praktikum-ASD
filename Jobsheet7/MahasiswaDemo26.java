package Jobsheet7;

import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo26 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26();

        System.out.print("Masukan Jumlah mahasiswa: ");
        int jlmMhs = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jlmMhs; i++ ) {
            System.out.println("Masukan Data mahasiswa ke-" + (i + 1));
            System.out.print("Nim: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double IPK = input.nextDouble();
            input.nextLine();
            

            Mahasiswa26 m = new Mahasiswa26(nim, nama, kelas, IPK);
            list.tambah(m);
            System.out.println("-----------------------------");
        }
            list.tampil();
            System.out.println("----------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("----------------------------------------------");
            System.out.println("masukan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = input.nextDouble();

            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int) posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);
            System.out.println();

            System.out.println("------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("------------------------------------------");
            System.out.println("masukan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari1 = input.nextDouble();
            System.out.println("-----------------------------");
            System.out.println("menggunakan binary search");
            System.out.println("-----------------------------");
            double posisi2 = list.findBinarySearch(cari1, 0, jumMhs-1);
            int pss2 = (int) posisi2;
            list.tampilPosisi(cari1, pss2);
            list.tampilDataSearch(cari1, pss2);
            System.out.println();

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
