package Jobsheet9;

public class StackSurat25 {
    Surat25[] stack;
    int top;
    int size;

    StackSurat25(int size){
        this.size = size;
        stack = new Surat25[size];
        top = -1;
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Surat25 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack Penuh tidak dapat menambah surat lagi!");
        }
    }

    Surat25 pop(){
        if (!isEmpty()) {
            Surat25 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack Kosong, tidak ada surat");
            return null;
        }
    }

    Surat25 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong, tidak ada surat");
            return null;
        }
    }

    void cariSurat(String namaCari){
        if (isEmpty()) {
            System.out.println("Stack Kosong, tidak ada surat");
            return;
        }

        boolean isKetemu = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaCari)) {
                System.out.println("--- Surat Ditemukan ---");
                System.out.println("ID Surat   : " + stack[i].idSurat);
                System.out.println("Jenis Izin : " + stack[i].jenisIzin);
                System.out.println("Durasi     : " + stack[i].durasi + " hari");

                isKetemu = true;
                break;
            }
        }

        if (!isKetemu) {
            System.out.println("Surat izin atas nama " + namaCari + " tidak ditemukan.");
        }
    }

    
}
