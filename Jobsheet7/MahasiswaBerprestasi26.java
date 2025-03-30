package Jobsheet7;

public class MahasiswaBerprestasi26 {
    Mahasiswa26[] listMhs = new Mahasiswa26[5];
    int idx;

    void tambah (Mahasiswa26 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil () {
        for (Mahasiswa26 m:listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    void tampilPosisi (double x, int pos) {
        if (pos!= -1) {
            System.out.println("data mahasiswa dengan IPK :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch (double x, int pos) {
        if (pos !=-1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + "tidak ditemukan");
        }
    }

    void bubbleSort () {
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length; j++ ) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa26 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void SelectionSort () {
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa26 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        } 
    }

    void insertionSort () {
        for (int i = 0; i < listMhs.length; i++) {
            Mahasiswa26 temp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari1, int left, int right) {
        boolean ascending = listMhs[left].ipk < listMhs[right].ipk;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (listMhs[mid].ipk == cari1) {
                return mid;
            }
    
            if (ascending) {  
                if (listMhs[mid].ipk > cari1) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (listMhs[mid].ipk < cari1) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1; 
    }
    
}
