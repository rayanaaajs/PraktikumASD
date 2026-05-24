package Jobsheet9;


public class StackTugasMahasiswa25 {
    Mahasiswa25[] stack;
    int top;
    int size;

    public StackTugasMahasiswa25(int size){
        this.size = size;
        stack = new Mahasiswa25[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
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

    public void push(Mahasiswa25 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh!, tidak dapat menambah tugas lagi");
        }
    }

    public Mahasiswa25 pop() {
        if (!isEmpty()) {
            Mahasiswa25 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong!, tidak ada tugas untuk dinilai");
            return null;
        }
    }


    public Mahasiswa25 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong!, tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 1; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa25 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public int count() {
        return top + 1;
    }


    public String konversiDesimalKeBiner(int nilai){
        StackKonversi stack = new StackKonversi();
        while (nilai > 0) {
            int sisa = nilai % 2 ;
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
