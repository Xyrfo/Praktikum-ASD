package Praktikum03;

public class Dosen26 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    int usia;

    public Dosen26 (String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo () {
        System.out.println("Kode          : " + kode);
            System.out.println("Nama          : " + nama);
            System.out.println("Jenis Kelamin : " + jenisKelamin);
            System.out.println("Usia          : " + usia);
            System.out.println("------------------------------");
    }
}
