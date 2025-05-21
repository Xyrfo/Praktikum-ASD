package Jobsheet10;

public class DataAntrianKRS26 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public DataAntrianKRS26(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
