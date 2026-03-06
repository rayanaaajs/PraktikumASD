package Kuis;

public class kuisMain25 {
    public static void main(String[] args) {
        kuis25[] arrayOfPegawai = new kuis25[4];

        for (int i = 0; i < arrayOfPegawai.length; i++) {
            arrayOfPegawai[i] = new kuis25();
        }

        arrayOfPegawai[0].idPegawai = "116";
        arrayOfPegawai[0].nama = "Irfan";
        arrayOfPegawai[0].gajiPokok = 2500000;
        arrayOfPegawai[0].hariKerja = 20;
        
        arrayOfPegawai[1].idPegawai = "121";
        arrayOfPegawai[1].nama = "Timina";
        arrayOfPegawai[1].gajiPokok = 2750000;
        arrayOfPegawai[1].hariKerja = 24;

        arrayOfPegawai[2].idPegawai = "134";
        arrayOfPegawai[2].nama = "Luvi";
        arrayOfPegawai[2].gajiPokok = 2500000;
        arrayOfPegawai[2].hariKerja = 25;

        arrayOfPegawai[3].idPegawai = "147";
        arrayOfPegawai[3].nama = "Siti";
        arrayOfPegawai[3].gajiPokok = 3000000;
        arrayOfPegawai[3].hariKerja = 24;


        for (int i = 0; i < arrayOfPegawai.length; i++) {
            arrayOfPegawai[i].tampilkanInformarsi();
            double gajiBulanan = arrayOfPegawai[i].hitungGajiBulanan(arrayOfPegawai[i].gajiPokok, arrayOfPegawai[i].hariKerja);
            System.out.println("Gaji Bulanan : " + gajiBulanan);
            System.out.println();
        }
       
    }
}
