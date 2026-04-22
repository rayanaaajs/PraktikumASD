package CM1;

public class Peminjaman {
     Mahasiswa mhs;
     Buku buku;
     int lamaPinjam;
     int batasPinjam = 5;
     int terlambat;
     int denda;
     String status;

     Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    // MOFIFIKASI A3: Menambahkan logika untuk menentukan status peminjaman (Cepat, Normal, Lama) berdasarkan lama pinjam

     void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
            status = "Lama";
        } else if (lamaPinjam == 4 || lamaPinjam == 5) {
            terlambat = 0;
            denda = 0;
            status = "Normal";
        } else {
            terlambat = 0;
            denda = 0;
            status = "Cepat";
        }
    }

     void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Status: " + status + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }

    // MODIFIKASI C3: Menambahkan method untuk menghitung rata-rata lama pinjam dari semua data peminjaman

    void rataLamaPinjam(Peminjaman[] daftarPeminjaman) {
        int totalLama = 0;
        for (Peminjaman p : daftarPeminjaman) {
            totalLama += p.lamaPinjam;
        }
        double rataRata = (double) totalLama / daftarPeminjaman.length;
        System.out.println("Rata-rata Lama Pinjam: " + rataRata + " hari");
    }
}
