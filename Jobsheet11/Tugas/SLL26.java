package Jobsheet11.Tugas;

public class SLL26 {
    NodeMahasiswa26 front;
    NodeMahasiswa26 rear;
    int size;
    int max;

    public SLL26(int n) {
        max = n;
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa26 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah mahasiswa.");
            return;
        }
        NodeMahasiswa26 newNode = new NodeMahasiswa26(mhs, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa26 dequeue () {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        }
        Mahasiswa26 mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Mahasiswa " + mhs.nama + " telah dipanggil.");
        return mhs;
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            Mahasiswa26 mhs = dequeue();
            if (mhs != null) {
                mhs.tampilInformasi();
            }
        }
    }

    public void tampilDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            front.data.tampilInformasi();
        }
    }

    public void tampilAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            rear.data.tampilInformasi();
        }
    }

    public void tampilJumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }
}

