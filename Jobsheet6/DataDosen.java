package Jobsheet6;

public class DataDosen {
    Dosen26[] dataDosen = new Dosen26[10];
    int idx = 0;

    void tambah(Dosen26 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i] != null) { 
                dataDosen[i].tampil();
                System.out.println("--------------------------");
            }
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) { 
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen26 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < idx; i++) {  
            Dosen26 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) { 
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
