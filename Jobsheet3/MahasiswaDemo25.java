package Jobsheet3;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Mahasiswa25[] arrayOfMahasiswa25 = new Mahasiswa25[3];

        arrayOfMahasiswa25[0] = new Mahasiswa25();
        arrayOfMahasiswa25[0].nim = "244107060033";
        arrayOfMahasiswa25[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa25[0].kelas = "SIB-1E";
        arrayOfMahasiswa25[0].ipk = (float) 3.75;

        arrayOfMahasiswa25[1] = new Mahasiswa25();
        arrayOfMahasiswa25[1].nim = "2341720172";
        arrayOfMahasiswa25[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa25[1].kelas = "TI-2A";
        arrayOfMahasiswa25[1].ipk = (float) 3.36;

        arrayOfMahasiswa25[2] = new Mahasiswa25();
        arrayOfMahasiswa25[2].nim = "244107023006";
        arrayOfMahasiswa25[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa25[2].kelas = "TI-2E";
        arrayOfMahasiswa25[2].ipk = (float) 3.80;


        
        System.out.println("NIM     : " + arrayOfMahasiswa25[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa25[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa25[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa25[0].ipk);
        System.out.println("-----------------------------------");
        
        System.out.println("NIM     : " + arrayOfMahasiswa25[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa25[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa25[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa25[1].ipk);
        System.out.println("-----------------------------------");
        
        System.out.println("NIM     : " + arrayOfMahasiswa25[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa25[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa25[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa25[2].ipk);
        System.out.println("-----------------------------------");
    }
}
