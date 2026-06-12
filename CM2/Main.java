package CM2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkListAntrian antrian = new DoubleLinkListAntrian();
        DoubleLinkListPesanan pesanan = new DoubleLinkListPesanan();
        int pilihan;

        Pembeli[] dataPembeli = {
            new Pembeli("Ainra", "08224500000"),
            new Pembeli("Danra", "08224511111"),
            new Pembeli("Sanri", "08224522222")
        };
        for (int i = 0; i < dataPembeli.length; i++) {
            antrian.addLast(dataPembeli[i]);
        }



        do {
            System.out.println("\n======================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan no HP: ");
                    String noHp = sc.nextLine();
                    Pembeli pembeliBaru = new Pembeli(nama, noHp);
                    antrian.addLast(pembeliBaru);
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    NodeAntrian hapus = antrian.removeFirst();
                    if (hapus != null) {
                        System.out.println(hapus.data.namaPembeli + " dipanggil dari antrian.");
                        System.out.print("Masukkan kode pesanan: ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan nama pesanan: ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Masukkan harga: ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        Pesanan pesananBaru = new Pesanan(kode, namaPesanan, harga);
                        pesanan.addLast(pesananBaru);
                        System.out.println(hapus.data.namaPembeli + " telah memesan " + namaPesanan);
                    } else {
                        System.out.println("Antrian Kosong");
                    }
                    break;
                case 4:
                    pesanan.printLaporan();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilihan != 0);
        
        sc.close();
    }
}
