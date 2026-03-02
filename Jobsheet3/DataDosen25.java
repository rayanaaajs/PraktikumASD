package Jobsheet3;

public class DataDosen25 {
    public void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        System.out.println("\n======= DATA SEMUA DOSEN =======");
        for (Dosen25 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("--------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int sumPria = 0, sumWanita = 0, totalPria = 0, totalWanita = 0;
        for (Dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                sumPria += d.usia;
                totalPria++;
            } else {
                sumWanita += d.usia;
                totalWanita++;
            }
        }
        System.out.println("Rata-rata Usia Pria   : " + (totalPria > 0 ? (double)sumPria/totalPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (totalWanita > 0 ? (double)sumWanita/totalWanita : 0));
    }

    public void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 tertua = arrayOfDosen[0];
        for (Dosen25 d : arrayOfDosen) {
            if (d.usia > tertua.usia) tertua = d;
        }
        System.out.println("Dosen Paling Tua: " + tertua.nama + " (Usia: " + tertua.usia + ")");
    }

    public void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 termuda = arrayOfDosen[0];
        for (Dosen25 d : arrayOfDosen) {
            if (d.usia < termuda.usia) termuda = d;
        }
        System.out.println("Dosen Paling Muda: " + termuda.nama + " (Usia: " + termuda.usia + ")");
    }
}