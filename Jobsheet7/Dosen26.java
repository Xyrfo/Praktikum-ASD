package Jobsheet7;

public class Dosen26 {
    String kode;
    String nama;
    Boolean jenis;
    int usia;

    Dosen26() {

    }

    Dosen26(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenis = jk;
        usia = age;
    }

    void tampil () {
        String jns = jenis ? "Laki-Laki" : "Perempuan" ;
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jns);
        System.out.println("Usia: " + usia);
    }
}
