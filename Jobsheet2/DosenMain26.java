public class DosenMain26 {
    public static void main(String[] args) {
        Dosen26 dosen1 = new Dosen26();
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Matematika");
        dosen1.tampilInformasi();
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        
        Dosen26 dosen2 = new Dosen26("D002", "Dr. Budi", true, 2010, "SIB");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("K3");
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.tampilInformasi();
    }
}
