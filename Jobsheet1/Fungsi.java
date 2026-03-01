public class Fungsi {

    // Data stok bunga
    static int[][] stok = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    
    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;

    
    public static int hitungPendapatan(int[] dataCabang) {
        int total = 0;

        total += dataCabang[0] * hargaAglonema;
        total += dataCabang[1] * hargaKeladi;
        total += dataCabang[2] * hargaAlocasia;
        total += dataCabang[3] * hargaMawar;

        return total;
    }

    // menampilkan laporan semua cabang
    public static void tampilkanLaporan() {
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(stok[i]);

            System.out.print("Pendapatan RoyalGarden " + (i + 1) + " = Rp" + pendapatan);

            if (pendapatan > 1500000) {
                System.out.print(" (Status: Sangat Baik)");
            } else {
                System.out.print(" (Status: Perlu Evaluasi)");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== LAPORAN PENDAPATAN ROYALGARDEN ===");
        tampilkanLaporan();
    }
}

