package Jobsheet7;

import java.util.Scanner;

import Jobsheet6.DataDosen;

public class DosenMain26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen26 dataDosen = new DataDosen26();

        dataDosen.tambah(new Dosen26("D001", "Andi", true, 35));
        dataDosen.tambah(new Dosen26("D002", "Ani", false, 40));
        dataDosen.tambah(new Dosen26("D003", "Budi", true, 40));
        dataDosen.tambah(new Dosen26("D004", "Ani", false, 45));

        System.out.println("----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------");
        System.out.println("masukan nama dosen yang dicari: ");
        System.out.print("nama: ");
        String cari = input.nextLine();

        System.out.println("menggunakan sequential searching");
        int posisi = dataDosen.sequentialSearching(cari);
        if (posisi == -1) {
            System.out.println("Data dosen dengan nama " + cari + " tidak ditemukan.");
        } else {
            dataDosen.tampilPosisiNama(cari, posisi);
            dataDosen.tampilDataSearchNama(cari, posisi);
        }

        System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("masukan usia dosen yang dicari: ");
        System.out.print("usia: ");
        int cari1 = input.nextInt();
        System.out.println("-----------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-----------------------------");
        int posisi2 = dataDosen.BinarySearch(cari1, 0, dataDosen.idx-1);
        if (posisi2 == -1) {
            System.out.println("Data dosen dengan usia " + cari1 + " tidak ditemukan.");
        } else {
            dataDosen.tampilPosisi(cari1, posisi2);
            dataDosen.tampilDataSearch(cari1, posisi2);
        }

        System.out.println("Data Dosen sebelum disorting:");
        dataDosen.tampil();

        System.out.println("Data telah diurutkan secara ASC berdasarkan usia:");
        dataDosen.SortingASC();
        dataDosen.tampil();

        System.out.println("Data telah diurutkan secara DSC berdasarkan usia:");
        dataDosen.SortingDSC();
        dataDosen.tampil();
    }
}
