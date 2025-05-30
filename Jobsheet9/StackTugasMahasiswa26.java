package Jobsheet9;

public class StackTugasMahasiswa26 {
    Mahasiswa26[] stack;
    int top;
    int size;
    public StackTugasMahasiswa26(int size) {
        this.size = size;
        stack = new Mahasiswa26[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
            
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa26 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }
    public Mahasiswa26 pop() {
        if (!isEmpty()) {
            Mahasiswa26 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpilkan");
            return null;
        }
    }
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public Mahasiswa26 bottom() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                if (stack[i] != null) {
                    return stack[i];
                }
            }
        }
        return null;
    }
    public int jumlahTugas() {
        return top + 1;
    }
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi26 stack = new StackKonversi26();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
