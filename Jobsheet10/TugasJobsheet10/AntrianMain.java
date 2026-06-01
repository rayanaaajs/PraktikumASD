package Jobsheet10.TugasJobsheet10;
import java.util.Scanner;
public class AntrianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS antrian = new AntrianKRS(10);

        int pilihan;

        do {
            System.out.println("\n=== Sistem Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Mahasiswa (Proses KRS)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Status Antrian (Kosong/Penuh)");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Cetak Info Statistik KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-8): ");
            
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Masukkan Data Mahasiswa ---");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilKRS();
                    break;

                case 3:
                    System.out.println();
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    System.out.println();
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 5:
                    System.out.println();
                    antrian.tampilkanTerakhir();
                    break;

                case 6:
                    System.out.println();
                    if (antrian.isEmpty()) {
                        System.out.println("Status: Antrian saat ini KOSONG.");
                    } else if (antrian.isFull()) {
                        System.out.println("Status: Antrian saat ini PENUH.");
                    } else {
                        System.out.println("Status: Antrian terisi " + antrian.size + " dari maksimal " + antrian.max + ".");
                    }
                    break;

                case 7:
                    System.out.println();
                    antrian.clear();
                    break;

                case 8:
                    System.out.println();
                    antrian.cetakInfoKRS();
                    break;

                case 0:
                    System.out.println("\nTerima kasih telah menggunakan sistem antrian KRS.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih menu 0-8.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
