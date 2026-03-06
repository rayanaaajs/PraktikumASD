package Kuis;

public class kuis25 {
    String idPegawai, nama;
    double gajiPokok;
    int hariKerja;

    kuis25() {
    }

    void tampilkanInformarsi(){
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Hari Kerja : " + hariKerja);
    }

    double hitungGajiBulanan(double gajiPokok, int hariKerja){
        double totalGaji = gajiPokok * hariKerja / 25; 
        return totalGaji;
    }

}
