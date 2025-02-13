import java.util.Scanner;

public class tugas3 {

    public static Scanner sc = new Scanner(System.in);

    public static void inputDataMatkul(
        int n, String namaMatkul[], int sksMatkul[], int semesterMatkul[], String hariMatkul[]) {
    for (int i = 0; i < n; i++) {
        System.out.print("Masukkan Nama Mata Kuliah: ");
        namaMatkul[i] = sc.nextLine();
        System.out.print("Masukkan SKS Mata Kuliah: ");
        sksMatkul[i] = sc.nextInt();
        System.out.print("Masukkan Semester Mata Kuliah: ");
        semesterMatkul[i] = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Hari Mata Kuliah: ");
        hariMatkul[i] = sc.nextLine();
        }
    }

    public static void printDataMatkul(
        int n, String namaMatkul[], int sksMatkul[], int semesterMatkul[], String hariMatkul[]) {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

    for (int i = 0; i < namaMatkul.length; i++) {
        System.out.printf(
            "%-40s %-20d %-20d %-20s\n",
            namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
        }
    }

    public static void mencariHari(
        int n,
        String namaMatkul[],
        int sksMatkul[],
        int semesterMatkul[],
        String hariMatkul[],
        String inputHari) {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

    boolean found = false;
    for (int i = 0; i < namaMatkul.length; i++) {
        if (hariMatkul[i].equalsIgnoreCase(inputHari)) {
        System.out.printf(
            "%-40s %-20d %-20d %-20s\n",
            namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
        found = true;
        }
    }
    if (!found) {
        System.out.println("Data mata kuliah pada hari " + inputHari + " tidak ditemukan");
        }
    }

    public static void mencariSemester(
        int n,
        String namaMatkul[],
        int sksMatkul[],
        int semesterMatkul[],
        String hariMatkul[],
        int semester) {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

    boolean found = false;
    for (int i = 0; i < namaMatkul.length; i++) {
        if (semesterMatkul[i] == semester) {
        System.out.printf(
            "%-40s %-20d %-20d %-20s\n",
            namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
        found = true;
        }
    }
    if (!found) {
        System.out.println("Data mata kuliah pada semester " + semester + " tidak ditemukan");
        }
    }

    public static void mencariNama(
        int n,
        String namaMatkul[],
        int sksMatkul[],
        int semesterMatkul[],
        String hariMatkul[],
        String inputNama) {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

    boolean found = false;
    for (int i = 0; i < namaMatkul.length; i++) {
        if (namaMatkul[i].equalsIgnoreCase(inputNama)) {
        System.out.printf(
            "%-40s %-20d %-20d %-20s\n",
            namaMatkul[i], sksMatkul[i], semesterMatkul[i], hariMatkul[i]);
        found = true;
        }
    }
    if (!found) {
        System.out.println("Data mata kuliah dengan nama " + inputNama + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int n = sc.nextInt();
        String namaMatkul[] = new String[n];
        int sksMatkul[] = new int[n];
        int semesterMatkul[] = new int[n];
        String hariMatkul[] = new String[n];
        sc.nextLine();
        inputDataMatkul(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul);
    while (true) {
        System.out.println("Progam Mata Kuliah");
        System.out.println("1. Menampilkan Data Mata Kuliah");
        System.out.println("2. Mencari Mata Kuliah Berdasarkan Hari");
        System.out.println("3. Mencari Mata Kuliah Berdasarkan Semester");
        System.out.println("4. Mencari Mata Kuliah Berdasarkan Nama");
        System.out.println("5. Keluar");
        System.out.print("Silahkan Pilih Menu Program dibawah ini: ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        switch (pilihan) {
        case 1:
            printDataMatkul(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul);
            break;
        case 2:
            System.out.print("Masukkan Hari Mata Kuliah: ");
            String inputHari = sc.nextLine();
            mencariHari(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul, inputHari);
            break;
        case 3:
            System.out.print("Masukkan Semester Mata Kuliah: ");
            int inputSemester = sc.nextInt();
            mencariSemester(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul, inputSemester);
            break;
        case 4:
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String inputNama = sc.nextLine();
            mencariNama(n, namaMatkul, sksMatkul, semesterMatkul, hariMatkul, inputNama);
            break;
        case 5:
            System.out.println("Program Selesai");
            return;
        default:
            System.out.println("Pilihan Tidak Tersedia");
            break;
            }
        }
    }
}