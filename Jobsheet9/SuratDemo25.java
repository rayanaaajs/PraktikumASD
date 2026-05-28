package Jobsheet9;

import java.util.Scanner;

public class SuratDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackSurat25 stack = new StackSurat25(10); 
        int pilih;

        do {
            System.out.println("\n=== MENU PENGELOLAAN SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih menu (1-4): ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n--- Masukkan Data Surat Baru ---");
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S untuk Sakit / I untuk Izin) : ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); 

                    
                    Surat25 suratBaru = new Surat25(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat berhasil diterima!");
                    break;

                case 2:
                    System.out.println("\n--- Memproses Surat Teratas ---");
                    Surat25 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat atas nama " + diproses.namaMahasiswa + " telah diproses/divalidasi.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Melihat Surat Teratas ---");
                    Surat25 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir yang masuk adalah milik: " + terakhir.namaMahasiswa);
                        System.out.println("ID Surat: " + terakhir.idSurat);
                    }
                    break;

                case 4:
                    System.out.println("\n--- Cari Surat Izin ---");
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = sc.nextLine();
                    stack.cariSurat(namaCari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
        
        System.out.println("Program selesai.");
        sc.close();
    }
}

