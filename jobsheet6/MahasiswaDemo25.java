package jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("NIM : ");
            String nim = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            double ipk = Double.parseDouble(sc.nextLine());

            list.tambah(new Mahasiswa25(nama, nim, kelas, ipk));
            System.out.println();
        }


        list.tampil();
        //melakukan pencarian sequential
        System.out.println("------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK : ");
        double cari = Double.parseDouble(sc.nextLine());
        
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(posisi, pss);
        list.tampilDataSearch(posisi, pss);

        // System.out.println("data mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("data yang sudah terurut menggunakan selection sort (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("data yang sudah terurut menggunakan insertion sort (DESC)");
        // list.insertionSort();
        // list.tampil();  

        sc.close();
    }
}
