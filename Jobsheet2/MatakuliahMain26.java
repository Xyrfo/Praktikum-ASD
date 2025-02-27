public class MatakuliahMain26 {
    public static void main(String[] args) {
        MataKuliah26 mk1 = new MataKuliah26();
        mk1.ubahSKS(3);
        mk1.tambahJam(4);
        mk1.tampilInformasi();
        
        MataKuliah26 mk2 = new MataKuliah26("MK002", "Pemrograman Lanjut", 4, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
    }
}

