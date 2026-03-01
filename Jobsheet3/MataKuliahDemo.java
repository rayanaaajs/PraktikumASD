package Jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah yang ingin diinput: ");
        int jumlahArray = sc.nextInt();
        sc.nextLine();

        MataKuliah25[] arrayOfMatakuliah = new MataKuliah25[jumlahArray];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah25();

            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);


        }
        
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}
