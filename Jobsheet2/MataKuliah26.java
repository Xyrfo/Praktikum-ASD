public class MataKuliah26 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
        
    public MataKuliah26() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }
        
    public MataKuliah26(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }
    
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }
        
    public void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan, jumlah jam tidak mencukupi.");
        }
    }
}


