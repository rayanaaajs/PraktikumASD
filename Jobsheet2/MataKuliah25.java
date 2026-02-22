package Jobsheet2;

public class MataKuliah25 {
    String kodeMk, nama;
    int sks, jumlahJam;

    public MataKuliah25(){

    }

    public MataKuliah25(String kodeMk, String NamaMatkul, int jumlahSks, int jumlahJam){
        this.kodeMk = kodeMk;
        nama = NamaMatkul;
        sks = jumlahSks;
        this.jumlahJam = jumlahJam;
    }
    

    void tampilInformasi(){
        System.out.println("kode matkul : " + kodeMk);
        System.out.println("nama matkul : " + nama);
        System.out.println("jumlah SKS : " + sks);
        System.out.println("jumlah jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam = jumlahJam + jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam < jam) {
            System.out.println("pengurangan tidak dapat dilakukan jumlah jam awal lebih kecil dari jam pengurang");
        } else {
            jumlahJam = jumlahJam - jam;
        }
    }

}
