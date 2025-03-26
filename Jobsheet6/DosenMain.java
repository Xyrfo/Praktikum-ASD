package Jobsheet6;

public class DosenMain {
    public static void main(String[] args) {

        DataDosen dataDosen = new DataDosen();

        dataDosen.tambah(new Dosen26("D001", "Andi", true, 35));
        dataDosen.tambah(new Dosen26("D002", "Siti", false, 40));
        dataDosen.tambah(new Dosen26("D003", "Budi", true, 30));
        dataDosen.tambah(new Dosen26("D004", "Ani", false, 45));

        System.out.println("\nData Dosen sebelum disorting:");
        dataDosen.tampil();

        System.out.println("\nData telah diurutkan secara ASC berdasarkan usia:");
        dataDosen.SortingASC();
        dataDosen.tampil();

        System.out.println("\nData telah diurutkan secara DSC berdasarkan usia:");
        dataDosen.SortingDSC();
        dataDosen.tampil();
    }
}
