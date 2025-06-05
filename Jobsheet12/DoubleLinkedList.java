package Jobsheet12;

public class DoubleLinkedList {
    Node26 head;
    Node26 tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa26 data) {
        Node26 newNode = new Node26(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa26 data) {
        Node26 newNode = new Node26(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    
    public void insertAfter(String keyNim, Mahasiswa26 data) {
    Node26 current = head;

    // cari node dengan nim = keyNim
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node26 newNode = new Node26(data);

    // jika current adalah tail, tambahkan di akhir
    if (current == tail) {
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    } else {
        // sisipkan di tengah
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }
    size++;

    System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (head == null) {
            System.out.println("List kosong.");
        } else {
            Node26 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang dihapus adalah: ");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public Node26 search(String nim) {
        Node26 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(Mahasiswa26 data, int index) {
        Node26 newNode = new Node26(data);
        if (index < 0 || index >= size()) {
            System.out.println("Index di luar jangkauan.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            System.out.println("Data berhasil ditambahkan di index " + index);
            return;
        } else if (index == size()) {
            addLast(data);
            System.out.println("Data berhasil ditambahkan di index " + index);
            return;
        } else {
            Node26 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            newNode.prev = current;

            current.next.prev = newNode;
            current.next = newNode;

            System.out.println("Data berhasil ditambahkan di index " + index);
        }
        size++;
    } 

    public void removeAfter(String key) {
        Node26 current = head;

        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + key);
            return;
        }

        Node26 toRemove = current.next;
        System.out.println("Data yang dihapus: ");
        toRemove.data.tampil();
        current.next = toRemove.next;

        if (toRemove == tail) {
            tail = current;
            tail.next = null;
        } else {
            current.next = toRemove.next;
            toRemove.next.prev = current;
        }
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Index di luar jangkauan.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        } else if (index == size() - 1) {
            removeLast();
            return;
        } else {
            Node26 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;

            System.out.println("Data yang dihapus: ");
            current.data.tampil();

            size--;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pertama: ");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data terakhir: ");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Index di luar jangkauan.");
            return;
        }

        Node26 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada index " + index + ": ");
        current.data.tampil();
    }

    public int size() {
        int count = 0;
        Node26 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}