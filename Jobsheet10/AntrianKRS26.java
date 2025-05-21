package Jobsheet10;

public class AntrianKRS26 {
    DataAntrianKRS26[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianKRS26(int max) {
        this.max = max;
        this.data = new DataAntrianKRS26[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }


    public void tambahAntrian(DataAntrianKRS26 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public DataAntrianKRS26 layaniMahasiswa() {
        DataAntrianKRS26 mhs = data[front];
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        for (int i = 0; i < 2; i++) {
            if (isEmpty()) {
                System.out.println("Tidak ada mahasiswa yang bisa dilayani.");
                return null;
            }
            front = (front + 1) % max;
            size--;
        }
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public void KosongkanAntrian() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
