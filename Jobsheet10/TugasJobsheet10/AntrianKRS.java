package Jobsheet10.TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max; 
    int jumlahSelesaiKRS = 0;
    int kuotaDPA = 30;

    public AntrianKRS(int max){
        this.max = max;
        data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == max;
    }

    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
        System.out.println("Antrian Masih Kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian Masih penuh, tidak dapat menambahkan mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public void panggilKRS(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        if (jumlahSelesaiKRS >= kuotaDPA) {
            System.out.println("Kuota DPA sudah penuh (30 Mahasiswa)!");
            return;
        }

        int batasPanggilan;

        if (size >= 2) {
            batasPanggilan = 2;
        } else {
            batasPanggilan = size;
        }

        for (int i = 0; i < batasPanggilan; i++) {
            if (jumlahSelesaiKRS < kuotaDPA) {
                System.out.print("- ");
                data[front].tampilkanData();

                front = (front + 1) % max;
                size--;
                jumlahSelesaiKRS++;
            }
        }

        if (size == 0) {
            front = rear = -1;
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


    public void tampilkanDuaTerdepan(){
        if (isEmpty()) {
            System.out.println("antrian masih kosong");
        } else {
            System.out.println("2 Antrian Terdepan: ");
            int batas = Math.min(2, size);
            for (int i = 0; i < batas; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanData();
            }
        }
    }


    public void tampilkanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian Paling Akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void cetakInfoKRS() {
        System.out.println("=== Info Status KRS ===");
        System.out.println("Jumlah Antrian Saat Ini      : " + size);
        System.out.println("Jumlah Selesai Proses KRS    : " + jumlahSelesaiKRS);
        System.out.println("Sisa Kuota DPA (Belum KRS)   : " + (kuotaDPA - jumlahSelesaiKRS));
    }

}
