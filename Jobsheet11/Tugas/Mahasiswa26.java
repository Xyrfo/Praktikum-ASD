package Jobsheet11.Tugas;

public class Mahasiswa26 {
    String nama;
    String nim;
    String kelas;

    public Mahasiswa26(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas);
    }
}
