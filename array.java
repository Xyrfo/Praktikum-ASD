import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        System.out.print("Masukkan nilai Angka untuk MK Pancasila: ");
        double nilaiPan = sc.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK Konsep Teknologi Informasi: ");
        double nilaiKti = sc.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving: ");
        double nilaiCtps = sc.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK Matematika Dasar: ");
        double nilaiMat = sc.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK Bahasa Inggris: ");
        double nilaiBing = sc.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK Dasar Pemrograman: ");
        double nilaiDas = sc.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman: ");
        double nilaiPrak = sc.nextDouble();
        System.out.print("Masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja: ");
        double nilaiK3 = sc.nextDouble();

        String[] matkul = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        double[] nilai = {nilaiPan, nilaiKti, nilaiCtps, nilaiMat, nilaiBing, nilaiDas, nilaiPrak, nilaiK3};
        String[] nilaiHuruf = new String[8];
        double[] nilaiAngka = new double[8];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiAngka[i] = 4.00;
            } else if (nilai[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiAngka[i] = 3.50;
            } else if (nilai[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiAngka[i] = 3.00;
            } else if (nilai[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiAngka[i] = 2.50;
            } else if (nilai[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiAngka[i] = 2.00;
            } else if (nilai[i] >= 39) {
                nilaiHuruf[i] = "D";
                nilaiAngka[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                nilaiAngka[i] = 0.00;
            }
        }

        double totalNilai = 0;
        for (int i = 0; i < nilai.length; i++) {
            totalNilai += nilaiAngka[i];
        }

        double ipSemester = totalNilai / nilai.length;

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("MK\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("%-40s\t%.2f\t%-10s\t%.2f\n", matkul[i], nilai[i], nilaiHuruf[i], nilaiAngka[i]);
        }
        System.out.printf("\nIP Semester: %.2f\n", ipSemester);

        sc.close();
    }
}
