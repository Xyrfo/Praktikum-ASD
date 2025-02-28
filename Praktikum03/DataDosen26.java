package Praktikum03;

public class DataDosen26 {

    public void dataSemuaDosen(Dosen26[] arrayOfDosen) {
        for (Dosen26 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen26 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int RataPria = 0, RataWanita = 0;

        for (Dosen26 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                RataPria++;
            } else {
                totalWanita += dosen.usia;
                RataWanita++;
            }
        }

        if (RataPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / RataPria));
        } else {
            System.out.println("Tidak ada Dosen Pria.");
        }

        if (RataWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / RataWanita));
        } else {
            System.out.println("Tidak ada Dosen Wanita.");
        }

        System.out.println("------------------------------");
    }

    public void infoDosenPalingTua(Dosen26[] arrayOfDosen) {
        Dosen26 palingTua = arrayOfDosen[0];

        for (Dosen26 dosen : arrayOfDosen) {
            if (dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua :");
        palingTua.cetakInfo();
        System.out.println("------------------------------");
    }

    public void infoDosenPalingMuda(Dosen26[] arrayOfDosen) {
        Dosen26 palingMuda = arrayOfDosen[0];

        for (Dosen26 dosen : arrayOfDosen) {
            if (dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda :");
        palingMuda.cetakInfo();
        System.out.println("------------------------------");
    }
}
