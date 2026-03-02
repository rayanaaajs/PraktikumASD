package Jobsheet3;
import java.util.Scanner;
public class DosenDemo25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen25[] arrayOfDosen = new Dosen25[jumlahDosen];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W): ");
            char jkInput = sc.next().charAt(0);
            boolean jk = (jkInput == 'p' || jkInput == 'P');
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("--------------------------------");

            // Instansiasi objek langsung dengan constructor berparameter
            arrayOfDosen[i] = new Dosen25(kode, nama, jk, usia);
        }

        System.out.println("\n======= DAFTAR DOSEN =======");
        int hitungan = 1;
        for (Dosen25 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + hitungan);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            // Konversi Boolean ke teks agar sesuai contoh output
            String gender = dosen.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Jenis Kelamin : " + gender);
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------------");
            hitungan++;
        }

         DataDosen25 dataHelper = new DataDosen25();
        
        // Memanggil semua method statistik 
        dataHelper.dataSemuaDosen(arrayOfDosen);
        dataHelper.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataHelper.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataHelper.infoDosenPalingTua(arrayOfDosen);
        dataHelper.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}