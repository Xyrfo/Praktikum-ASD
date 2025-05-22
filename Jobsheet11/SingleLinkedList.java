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
}
