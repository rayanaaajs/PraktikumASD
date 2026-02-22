package Jobsheet2;

public class Dosen25 {
    String idDosen, nama, bidangKeahlian;
    Boolean statusAktif;
    int tahunBergabung;

    public Dosen25(){

    }

    public Dosen25(String idDosen, String namaDosen, Boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        nama = namaDosen;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
            if (statusAktif == true) {
                System.out.println("Status : Aktif");
            } else {
                System.out.println("Status : Tidak Aktif");
            }
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Masa Kerja   : " + hitungMasaKerja(2026) + " tahun");    }

    void setStatus(Boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    int hitungMasaKerja(int tahunSekarang){
        return tahunSekarang - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }


    

}
