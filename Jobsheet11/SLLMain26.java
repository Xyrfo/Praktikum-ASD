package Jobsheet11;
import java.util.Scanner;

public class SLLMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();

        Mahasiswa26 mhs1 = new Mahasiswa26("Cintia", "22212202", "3C", 3.5);
        Mahasiswa26 mhs2 = new Mahasiswa26("Bimon", "23212201", "2B", 4.0);
        Mahasiswa26 mhs3 = new Mahasiswa26("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa26 mhs4 = new Mahasiswa26("Dirga", "21212203", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();


        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
