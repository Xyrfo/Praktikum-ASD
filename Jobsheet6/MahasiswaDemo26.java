package Jobsheet6;

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
