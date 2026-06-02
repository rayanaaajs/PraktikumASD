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
            new Pembeli("Sanri", "08224522222"),
            new Pembeli("Vania", "08422234556")
        };
        int indexPembeli = 0;

        Pesanan[] dataPesanan = {
            new Pesanan(123, "Es Teler", 5000),
            new Pesanan(124, "Mie Goreng", 34000),
            new Pesanan(125, "Es Degan", 6000),
            new Pesanan(126, "Nasi Goreng", 25000)
        };
        int indexPesanan = 0;

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

            switch (pilihan) {
                case 1:
                    if (indexPembeli < dataPembeli.length) {
                        antrian.addLast(dataPembeli[indexPembeli]);
                        indexPembeli++;
                    } else {
                        System.out.println("Data pembeli sudah dimasukkan semua");
                    }
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    NodeAntrian hapus = antrian.removeFirst();
                    if (hapus != null) {
                        if (indexPesanan < dataPesanan.length) {
                            pesanan.addLast(dataPesanan[indexPesanan]);
                            System.out.println(hapus.data.namaPembeli + " telah memesan " + dataPesanan[indexPesanan].namaPesanan);
                            indexPesanan++;
                        } else {
                            System.out.println(hapus.data.namaPembeli + " selesai dilayani (Tidak ada data pesanan tersisa)");
                        }
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
