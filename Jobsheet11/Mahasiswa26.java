package Jobsheet11;

public class Mahasiswa26 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa26(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
