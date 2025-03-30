package Jobsheet7;

public class DataDosen26 {
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
        for (Dosen26 dsn: dataDosen) {
            if (dsn != null) {
                String jns = dsn.jenis ? "Laki-Laki" : "Perempuan" ;
                System.out.println();
                System.out.println("Kode: " + dsn.kode);
                System.out.println("Nama: " + dsn.nama);
                System.out.println("Jenis: " + jns);
                System.out.println("Usia: " + dsn.usia);
                System.out.println("-------------------------");
            }
        }
    }

    void tampilPosisi (int x, int pos) {
        if (pos!= -1) {
            System.out.println("data Dosen dengan Usia :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch (int x, int pos) {
        if (pos !=-1) {
            System.out.println("kode\t : " + dataDosen[pos].kode);
            System.out.println("nama\t : " + dataDosen[pos].nama);
            System.out.println("jenis\t : " + dataDosen[pos].jenis);
            System.out.println("usia\t : " + x);
        } else {
            System.out.println("Data Dosen dengan Usia " + x + "tidak ditemukan");
        }
    }

    void tampilPosisiNama (String x, int pos) {
        if (pos!= -1) {
            System.out.println("data Dosen dengan Nama :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearchNama (String x, int pos) {
        if (pos !=-1) {
            System.out.println("kode\t : " + dataDosen[pos].kode);
            System.out.println("nama\t : " + x);
            System.out.println("jenis\t : " + dataDosen[pos].jenis);
            System.out.println("usia\t : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data Dosen dengan Nama " + x + "tidak ditemukan");
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

    int sequentialSearching(String cari) {
        int posisi = -1;
        int count = 0;
    
        for (int j = 0; j < dataDosen.length; j++) {
            if (dataDosen[j] != null && dataDosen[j].nama.equalsIgnoreCase(cari)) {
                if (posisi == -1) {
                    posisi = j; 
                }
                count++; 
            }
        }
    
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
        }
    
        return posisi; 
    }
    
    int BinarySearch(int cari1, int left, int right) {
        int mid;
        int count = 0;
        int posisi = -1;
    
        if (right >= left) {
            mid = (left + right) / 2;
    
            if (dataDosen[mid].usia == cari1) {
                posisi = mid;
                count++;
                int l = mid - 1;
                while (l >= left && dataDosen[l].usia == cari1) {
                    count++;
                    l--;
                }
                int r = mid + 1;
                while (r <= right && dataDosen[r].usia == cari1) {
                    count++;
                    r++;
                }
            } else if (dataDosen[mid].usia > cari1) {
                return BinarySearch(cari1, left, mid - 1);
            } else {
                return BinarySearch(cari1, mid + 1, right);
            }
        }
    
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
        }
    
        return posisi;
    }    
}
