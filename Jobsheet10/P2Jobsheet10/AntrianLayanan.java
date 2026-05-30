package Jobsheet10.P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max; 

    public AntrianLayanan(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian Penuh, tidak dapat menambahkan mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    public Mahasiswa layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("antrian kosong");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }


    public void lihatTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Mahasiwa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("antrian Kosong");
            return;
        }
        System.out.println("Daftar nama dalam antrian");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }



    
}
