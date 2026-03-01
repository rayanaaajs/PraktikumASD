package Jobsheet3;

import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa25[] arrayOfMahasiswa25 = new Mahasiswa25[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa25.length; i++) {
            arrayOfMahasiswa25[i] = new Mahasiswa25();


            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa25[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa25[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa25[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa25[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");

        }

        for (int i = 0; i < arrayOfMahasiswa25.length; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            arrayOfMahasiswa25[i].cetakInfo();
        }


        sc.close();
    }
}
