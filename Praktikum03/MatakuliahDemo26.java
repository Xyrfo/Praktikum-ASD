package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah26[] arrayOfMataKuliah26 = new MataKuliah26[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------");

            arrayOfMataKuliah26[i] = new MataKuliah26(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("NIM        : " + arrayOfMataKuliah26[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah26[i].nama);
            System.out.println("Sks        : " + arrayOfMataKuliah26[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah26[i].jumlahJam);
            System.out.println("------------------------------");
        }
    }
}
