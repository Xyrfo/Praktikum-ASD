package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jlm = sc.nextInt();
        sc.nextLine();

        MataKuliah26[] arrayOfMataKuliah26 = new MataKuliah26[jlm];

        for (int i = 0; i < jlm; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah26[i] = new MataKuliah26("", "", 0, 0);
            arrayOfMataKuliah26[i].tambahData(sc);
        }

        for (int i = 0; i < jlm; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah26[i].cetakInfo();
        }

        sc.close();
    }
}
