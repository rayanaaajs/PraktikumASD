package Jobsheet2;

public class MahasiswaMain25 {
    public static void main(String[] args) {
        
        Mahasiswa25 mhs1 = new Mahasiswa25();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720271";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;
        
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa25 mhs2 = new Mahasiswa25("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();


        Mahasiswa25 mhsRayana = new Mahasiswa25("Rayana Jaka Surya", "254107020026", 3.73, "TI 1C");
        mhsRayana.tampilkanInformasi();
    }
}
