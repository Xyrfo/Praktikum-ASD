package Praktikum03;
import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen26[] arrayOfDosen26 = new Dosen26[3];
        String kode, nama, jenisKelaminInput;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelaminInput = sc.nextLine();

            if (jenisKelaminInput.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else if (jenisKelaminInput.equalsIgnoreCase("Wanita")) {
                jenisKelamin = false;
            } else {
                System.out.println("Jenis Kelamin tidak valid, asumsi Pria");
                jenisKelamin = true;
            }

            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();

            System.out.println("--------------------------------");
            arrayOfDosen26[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }

        for (Dosen26 dosen : arrayOfDosen26) {
            dosen.cetakInfo();
        }
    }
}
