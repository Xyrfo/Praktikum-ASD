package Praktikum03;
import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen26[] arrayOfDosen26 = new Dosen26[3];
        String kode, nama;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          : ");
            usia = sc.nextInt();

            System.out.println("--------------------------------");

            arrayOfDosen26[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen26[i].kode);
            System.out.println("Nama          : " + arrayOfDosen26[i].nama);
            System.out.println("Jenis Kelamin : " + arrayOfDosen26[i].jenisKelamin);
            System.out.println("Usia          : " + arrayOfDosen26[i].usia);
            System.out.println("------------------------------");
        }
    }
}
