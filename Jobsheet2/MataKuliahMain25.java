package Jobsheet2;

public class MataKuliahMain25 {
    public static void main(String[] args) {
        
        MataKuliah25 mk1 = new MataKuliah25();
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.kodeMk = "ASD1C";
        mk1.sks = 2;
        mk1.jumlahJam = 4;
        
        System.out.println("\n-- Mata Kuliah 1 --");
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println("\n-- Update Mata Kuliah 1 --");
        mk1.tampilInformasi();


        MataKuliah25 mk2 = new MataKuliah25("BD1C", "Basis Data", 2, 4);

        System.out.println("\n-- Mata Kuliah 2 --");
        mk2.tampilInformasi();
        mk2.kurangiJam(6);

        System.out.println("\n-- Update Mata Kuliah 2 --");
        mk2.tampilInformasi();

        
    }  
}
