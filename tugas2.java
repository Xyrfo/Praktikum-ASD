import java.util.Scanner;

public class tugas2 {

    public static void tampilkanMenu() {
        System.out.println("Pilih Rumus Yang akan Di Hitung : ");
        System.out.println("1. Perhitungan Volume Kubus ");
        System.out.println("2. Perhitungan Luas Permukaan Kubus ");
        System.out.println("3. Perhitungan Keliling Kubus ");
        System.out.println("4. Keluar");
    }

    public static double perhitunganVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double perhitunganLuasKubus(double sisi) {
        return sisi * sisi * 6;
    }

    public static double perhitunganKelilingKubus(double sisi) {
        return sisi * 12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double sisi;

        while (true) {
            tampilkanMenu();
            System.out.print("Masukkan Pilihan (1/2/3/4): ");
            pilihan = sc.nextInt();

            if (pilihan == 4) {
                System.out.println("Keluar dari program.");
                break;
            }

            System.out.print("Masukkan Panjang Sisi: ");
            sisi = sc.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + perhitunganVolumeKubus(sisi));
                    break;
                case 2:
                    System.out.println("Luas Kubus: " + perhitunganLuasKubus(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + perhitunganKelilingKubus(sisi));
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}
