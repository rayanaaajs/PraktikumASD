package jobsheet5;

import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();
        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < 5; i++) {
        //     System.out.print("Nama : ");
        //     String nama = sc.nextLine();

        //     System.out.print("NIM : ");
        //     String nim = sc.nextLine();

        //     System.out.print("Kelas : ");
        //     String kelas = sc.nextLine();

        //     System.out.print("IPK : ");
        //     double ipk = Double.parseDouble(sc.nextLine());

        //     Mahasiswa25 m = new Mahasiswa25(nama, nim, kelas, ipk);
        //     list.tambah(m);
        //     System.out.println();
        // }


        Mahasiswa25 m1 = new Mahasiswa25("123", "Zidan", "2A", 3.2);
        Mahasiswa25 m2 = new Mahasiswa25("124", "Ayu", "2A", 3.5);
        Mahasiswa25 m3 = new Mahasiswa25("125", "Fira", "2A", 3.1);
        Mahasiswa25 m4 = new Mahasiswa25("126", "Azel", "2A", 3.7);
        Mahasiswa25 m5 = new Mahasiswa25("127", "bagas", "2A", 3.9);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("data yang sudah terurut menggunakan selection sort (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("data yang sudah terurut menggunakan insertion sort (DESC)");
        list.insertionSort();
        list.tampil();  

        sc.close();
    }
}
