package Praktikum03;
import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen26[] arrayOfDosen = new Dosen26[3];
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
            String jenisKelaminInput = sc.nextLine();
            jenisKelamin = jenisKelaminInput.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();

            System.out.println("--------------------------------");
            arrayOfDosen[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }

        DataDosen26 dataDosen = new DataDosen26();

        System.out.println("Data Semua Dosen:");
        dataDosen.dataSemuaDosen(arrayOfDosen);

        System.out.println("Jumlah Dosen Per Jenis Kelamin:");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("Rerata Usia Dosen Per Jenis Kelamin:");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("Info Dosen Paling Tua:");
        dataDosen.infoDosenPalingTua(arrayOfDosen);

        System.out.println("Info Dosen Paling Muda:");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
