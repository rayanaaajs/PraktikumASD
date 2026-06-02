package Jobsheet12;

public class Mahasiswa25 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa25(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil(){
        System.out.println(
            "NIM   : " + nim +
            "\nNama  : " + nama +
            "\nKelas : " + kelas +
            "\nIPK   : " + ipk
        );
    }

}
