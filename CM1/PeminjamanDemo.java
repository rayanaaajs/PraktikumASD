package CM1;

import java.util.Scanner;

public class PeminjamanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemPeminjaman sistem = new SistemPeminjaman(); // Membuat objek untuk memanggil method sorting & searching

        // a. Inisialisasi Data Mahasiswa
        Mahasiswa[] arrayMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // b. Inisialisasi Data Buku
        Buku[] arrayBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        // c. Inisialisasi Data Peminjaman
        Peminjaman[] arrayPeminjaman = {
            new Peminjaman(arrayMhs[0], arrayBuku[0], 7),
            new Peminjaman(arrayMhs[1], arrayBuku[1], 3),
            new Peminjaman(arrayMhs[2], arrayBuku[2], 10),
            new Peminjaman(arrayMhs[2], arrayBuku[3], 6),
            new Peminjaman(arrayMhs[0], arrayBuku[1], 4)
        };

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan Nama");
            System.out.println("6. Tampilkan Rata-rata Lama Pinjam");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa m : arrayMhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku b : arrayBuku) {
                        b.tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman p : arrayPeminjaman) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    sistem.bubbleSortDenda(arrayPeminjaman);
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman p : arrayPeminjaman) {
                        p.tampilPeminjaman();

                    }
                    break;

                case 5:
                    System.out.print("\nMasukkan Nama: ");
                    String cariNama = input.nextLine();
                    sistem.binarySearchNamaMhs(arrayPeminjaman, cariNama);
                    break;

                case 6:
                    for (Peminjaman p : arrayPeminjaman) {
                        p.rataLamaPinjam(arrayPeminjaman);
                        break;
                    }
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}
