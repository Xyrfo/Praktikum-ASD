package Jobsheet11;

public class SLLMain26 {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Mahasiswa26 mhs1 = new Mahasiswa26("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa26 mhs2 = new Mahasiswa26("Cintia", "22212202", "3C", 3.5);
        Mahasiswa26 mhs3 = new Mahasiswa26("Bimon", "23212201", "2B", 4.0);
        Mahasiswa26 mhs4 = new Mahasiswa26("Dirga", "21212203", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
