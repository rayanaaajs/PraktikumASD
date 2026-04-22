package CM1;

public class SistemPeminjaman {

    void bubbleSortDenda(Peminjaman[] listPeminjaman) {
        for (int i = 0; i < listPeminjaman.length - 1; i++) {
            for (int j = 0; j < listPeminjaman.length - i - 1; j++) {
                if (listPeminjaman[j].denda < listPeminjaman[j + 1].denda) {
                    Peminjaman temp = listPeminjaman[j];
                    listPeminjaman[j] = listPeminjaman[j + 1];
                    listPeminjaman[j + 1] = temp;
                }
            }
        }
    }

   
    void sortNIMAscending(Peminjaman[] daftarPeminjaman) {
        int jumlahDataPeminjaman = daftarPeminjaman.length;
        for (int i = 0; i < jumlahDataPeminjaman - 1; i++) {
            for (int j = 0; j < jumlahDataPeminjaman - i - 1; j++) {
                if (daftarPeminjaman[j].mhs.nim.compareTo(daftarPeminjaman[j + 1].mhs.nim) > 0) {
                    Peminjaman temp = daftarPeminjaman[j];
                    daftarPeminjaman[j] = daftarPeminjaman[j + 1];
                    daftarPeminjaman[j + 1] = temp;
                }
            }
        }
    }

 
    void binarySearchNIM(Peminjaman[] daftarPeminjaman, String targetNIM) {
        sortNIMAscending(daftarPeminjaman);
        
        int left = 0;
        int right = daftarPeminjaman.length - 1;
        boolean ketemu = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = targetNIM.compareTo(daftarPeminjaman[mid].mhs.nim);

            if (res == 0) {
                // Mencari batas atas dan bawah jika mahasiswa meminjam lebih dari 1 buku
                int start = mid;
                int end = mid;
                while (start > 0 && daftarPeminjaman[start - 1].mhs.nim.equals(targetNIM)) start--;
                while (end < daftarPeminjaman.length - 1 && daftarPeminjaman[end + 1].mhs.nim.equals(targetNIM)) end++;

                System.out.println("Data ditemukan:");
                for (int i = start; i <= end; i++) {
                    daftarPeminjaman[i].tampilPeminjaman();
                }
                ketemu = true;
                break;
            }
            
            if (res > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ketemu) {
            System.out.println("Data peminjaman dengan NIM " + targetNIM + " tidak ditemukan.");
        }
    }

    //MODIFIKASI B3: Searching berdasarkan nama mahasiswa (Ascending)

    void sortNamaMhsAsc(Peminjaman[] daftarPeminjaman) {
        int jumlahDataPeminjaman = daftarPeminjaman.length;
        for (int i = 0; i < jumlahDataPeminjaman - 1; i++) {
            for (int j = 0; j < jumlahDataPeminjaman - i - 1; j++) {
                if (daftarPeminjaman[j].mhs.nama.compareTo(daftarPeminjaman[j + 1].mhs.nama) > 0) {
                    Peminjaman temp = daftarPeminjaman[j];
                    daftarPeminjaman[j] = daftarPeminjaman[j + 1];
                    daftarPeminjaman[j + 1] = temp;
                }
            }
        }
    }

    void binarySearchNamaMhs(Peminjaman[] daftarPeminjaman, String targetNama) {
        sortNamaMhsAsc(daftarPeminjaman);
        
        int left = 0;
        int right = daftarPeminjaman.length - 1;
        boolean ketemu = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = targetNama.compareTo(daftarPeminjaman[mid].mhs.nama);

            if (res == 0) {
                // Mencari batas atas dan bawah jika mahasiswa meminjam lebih dari 1 buku
                int start = mid;
                int end = mid;
                while (start > 0 && daftarPeminjaman[start - 1].mhs.nama.equals(targetNama)) start--;
                while (end < daftarPeminjaman.length - 1 && daftarPeminjaman[end + 1].mhs.nama.equals(targetNama)) end++;

                System.out.println("Data ditemukan:");
                for (int i = start; i <= end; i++) {
                    daftarPeminjaman[i].tampilPeminjaman();
                }
                ketemu = true;
                break;
            }
            
            if (res > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ketemu) {
            System.out.println("Data peminjaman dengan nama " + targetNama + " tidak ditemukan.");
        }
    }

   
}