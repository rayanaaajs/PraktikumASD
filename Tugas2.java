import java.util.Scanner;

public class Tugas2 {
    
    static String[][] tabelJadwal;
    static Scanner inputUser = new Scanner(System.in);
    static int indeksAktif = 0;

    public static void main(String[] args) {
        int kapasitasMaksimal;
        System.out.println("\n--- INISIALISASI SISTEM ---");
        System.out.print("Tentukan kapasitas batas jadwal mata kuliah: ");
        kapasitasMaksimal = inputUser.nextInt();

        tabelJadwal = new String[kapasitasMaksimal][4];

        do {
            System.out.println("\n=== APLIKASI JADWAL MAHASISWA ===");
            System.out.println("1. Entri Jadwal Baru");
            System.out.println("2. Tampilkan Seluruh Jadwal");
            System.out.println("3. Filter Jadwal per Hari");
            System.out.println("4. Cari Jadwal per Nama MK");
            System.out.println("5. Tutup Aplikasi");
            System.out.println("=================================");
            System.out.print("Masukkan opsi Anda: ");
            int pilihanMenu = inputUser.nextInt();

            inputUser.nextLine(); // Membersihkan sisa enter

            switch (pilihanMenu) {
                case 1:
                    inputJadwalBaru();
                    break;
                case 2:
                    lihatSemuaJadwal();
                    break;
                case 3:
                    System.out.print("Ketik hari yang ingin dicari: ");
                    cariBerdasarkanHari(inputUser.nextLine());
                    break;
                case 4:
                    System.out.print("Ketik nama mata kuliah: ");
                    cariBerdasarkanNama(inputUser.nextLine());
                    break;
                case 5:
                    System.out.println("Program dihentikan. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak dikenali, silakan coba lagi.");
            }
        } while (true);
    }

    public static void inputJadwalBaru() {
        if (indeksAktif == tabelJadwal.length) {
            System.out.println("------------------------------");
            System.out.println("Mohon maaf, kapasitas jadwal sudah penuh!");
        } else {
            do {
                System.out.println("------------------------------");
                System.out.println("Entri Data ke-" + (indeksAktif + 1));
                System.out.print("Mata Kuliah: ");
                tabelJadwal[indeksAktif][0] = inputUser.nextLine();
                System.out.print("Ruang Kelas: ");
                tabelJadwal[indeksAktif][1] = inputUser.nextLine();
                System.out.print("Hari Kuliah: ");
                tabelJadwal[indeksAktif][2] = inputUser.nextLine();
                System.out.print("Jam (Mulai-Selesai): ");
                tabelJadwal[indeksAktif][3] = inputUser.nextLine();

                indeksAktif++;

            } while (indeksAktif < tabelJadwal.length);
        }
    }

    public static void lihatSemuaJadwal() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-35s %-15s %-15s %-20s\n", "MATA KULIAH", "RUANGAN", "HARI", "WAKTU");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < tabelJadwal.length; i++) {
            System.out.printf("%-35s %-15s %-15s %-20s\n",
                    tabelJadwal[i][0], tabelJadwal[i][1], tabelJadwal[i][2], tabelJadwal[i][3]);
        }
    }

    public static void cariBerdasarkanHari(String kataKunci) {
        System.out.println("----------------------------------------------------------------------------------");
        boolean adaData = false;
        
        for (int i = 0; i < tabelJadwal.length; i++) {
            if (tabelJadwal[i][2].equalsIgnoreCase(kataKunci)) {
                System.out.printf("%-35s %-15s %-15s %-20s\n",
                        tabelJadwal[i][0], tabelJadwal[i][1], tabelJadwal[i][2], tabelJadwal[i][3]);
                adaData = true;
            }
        }
        
        if (!adaData) {
            System.out.println("Jadwal pada hari " + kataKunci + " tidak ditemukan dalam sistem.");
        }
    }

    public static void cariBerdasarkanNama(String kataKunci) {
        System.out.println("----------------------------------------------------------------------------------");
        boolean adaData = false;
        
        for (int i = 0; i < tabelJadwal.length; i++) {
            if (tabelJadwal[i][0].equalsIgnoreCase(kataKunci)) {
                System.out.printf("%-35s %-15s %-15s %-20s\n",
                        tabelJadwal[i][0], tabelJadwal[i][1], tabelJadwal[i][2], tabelJadwal[i][3]);
                adaData = true;
            }
        }
        
        if (!adaData) {
            System.out.println("Mata kuliah " + kataKunci + " tidak ditemukan dalam sistem.");
        }
    }
}