package Jobsheet7;

public class Mahasiswa26 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa26() {

    }

    Mahasiswa26 (String nm, String name, String kls, double ip  ) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
        
    }

    void tampilInformasi () {

        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Ipk: " + ipk);
    }
}
