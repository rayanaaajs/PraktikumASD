package jobsheet5;

public class Mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    double ipk;


    //konstruktor default
    Mahasiswa25(){
        
    }
    

    //konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa25(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("kelas: " + kelas);
        System.out.println("ipk: " + ipk);
    }
}
