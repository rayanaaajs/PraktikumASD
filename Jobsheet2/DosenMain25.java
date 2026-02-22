package Jobsheet2;

public class DosenMain25 {
    public static void main(String[] args) {
        
        Dosen25 ds1 = new Dosen25();
        ds1.nama = "Budi Hartanto";
        ds1.idDosen = "BH";
        ds1.statusAktif = false;
        ds1.tahunBergabung = 1945;
        ds1.bidangKeahlian = "Software Engineering";

        System.out.println("--Data Dosen 1--");
        ds1.tampilInformasi();
        ds1.setStatus(true);
        ds1.ubahKeahlian("Network Engineering");

        System.out.println("--Update Data Dosen--");
        ds1.tampilInformasi();
        


    }   
}   
