package Jobsheet11;

public class Mahasiswa25 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa25(){

    }

    public Mahasiswa25(String nm, String name, String kls, double ip ){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilkanInformasi(){
      System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
