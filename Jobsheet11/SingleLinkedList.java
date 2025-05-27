package Jobsheet11;

public class SingleLinkedList {
    NodeMahasiswa26 head;
    NodeMahasiswa26 tail;

    public SingleLinkedList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa26 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa26 input) {
        NodeMahasiswa26 nInput = new NodeMahasiswa26(input, null);
        if (isEmpty()) {
            head = nInput;
            tail = nInput;
        } else {
            nInput.next = head;
            head = nInput;
        }
    }

    public void addLast(Mahasiswa26 input) {
        NodeMahasiswa26 nInput = new NodeMahasiswa26(input, null);
        if (isEmpty()) {
            head = nInput;
            tail = nInput;
        } else {
            tail.next = nInput;
            tail = nInput;
        }
    }

    public void insertAfter(String key, Mahasiswa26 input) {
        NodeMahasiswa26 nInput = new NodeMahasiswa26(input, null);
        NodeMahasiswa26 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                nInput.next = temp.next; 
                temp.next = nInput;
                if (nInput.next == null) {
                    tail = nInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa26 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa26(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        NodeMahasiswa26 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa26 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa26 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak bisa dihapus");
        } else{
            NodeMahasiswa26 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
