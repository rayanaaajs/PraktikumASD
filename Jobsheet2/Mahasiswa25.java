package Jobsheet2;

public class Mahasiswa25 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa25(){

    }

    public Mahasiswa25(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;

    }

    void tampilkanInformasi() {
        System.out.println("Nama " + nama);
        System.out.println("NIM " + nim);
        System.out.println("Kelas " + kelas);
        System.out.println("IPK " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }


    void updateIpk(double ipkBaru){
        if (ipk >= 0 && ipk <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }


    String niliaKinerja(){
        if (ipk >= 3.5) {
            return "kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "kinerja baik";
        } else if (ipk >= 2.0) {
            return "kinerja cukup";
        } else{
          return "kinerja kurang";  
        }
    }
}
