import java.util.Scanner;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukan Nilai Tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukan Nilai Kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukan Nilai UTS: ");
        int nilaiUts = sc.nextInt();
        System.out.print("Masukan Nilai UAS: ");
        int nilaiUas = sc.nextInt();

        System.out.println("======================");
        System.out.println("======================");
        
        if (nilaiTugas < 0 || nilaiTugas > 100 ) {
            System.out.println("Nilai Tidak Valid"); 
            return;
        }
        if (nilaiKuis < 0 || nilaiKuis > 100 ) {
            System.out.println("Nilai Tidak Valid");
            return; 
        }
        if (nilaiUts < 0 || nilaiUts > 100 ) {
            System.out.println("Nilai Tidak Valid");
            return; 
        }
        if (nilaiUas < 0 || nilaiUas > 100 ) {
            System.out.println("Nilai Tidak Valid");
            return; 
        }
        
        nilaiAkhir = (nilaiTugas * 20/100) + (nilaiKuis * 20/100) + (nilaiUts * 30/100) + (nilaiUas * 30/100);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        
        System.out.print("Nilai Huruf : ");
        if (nilaiAkhir >= 80 && nilaiAkhir < 100 ) {
            System.out.println("A");
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80 ) {
            System.out.println("B+");
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73 ) {
            System.out.println("B");
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65 ) {
            System.out.println("C+");
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60 ) {
            System.out.println("C");
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50 ) {
            System.out.println("D");
        } else if (nilaiAkhir <= 39 ) {
            System.out.println("E");
        }
        
        System.out.println("======================");
        System.out.println("======================");
        
        if (nilaiAkhir >= 39) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
        
    }
}