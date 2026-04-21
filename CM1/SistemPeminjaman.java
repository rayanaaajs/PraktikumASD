package CM1;

public class SistemPeminjaman {

    // Method Sorting BUBBLE SORT (Berdasarkan Denda - Descending)
    public void bubbleSortDenda(Peminjaman[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].denda < arr[j + 1].denda) {
                    Peminjaman temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper Method: Sort berdasarkan NIM Ascending (Wajib dilakukan sebelum Binary Search)
    public void sortNIMAscending(Peminjaman[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].mhs.nim.compareTo(arr[j + 1].mhs.nim) > 0) {
                    Peminjaman temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method Searching BINARY SEARCH (Berdasarkan NIM)
    public void binarySearchNIM(Peminjaman[] arr, String targetNIM) {
        sortNIMAscending(arr); // Urutkan dulu datanya agar Binary Search berfungsi
        
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = targetNIM.compareTo(arr[mid].mhs.nim);

            if (res == 0) {
                // Mencari batas atas dan bawah jika mahasiswa meminjam lebih dari 1 buku
                int start = mid;
                int end = mid;
                while (start > 0 && arr[start - 1].mhs.nim.equals(targetNIM)) start--;
                while (end < arr.length - 1 && arr[end + 1].mhs.nim.equals(targetNIM)) end++;

                System.out.println("Data ditemukan:");
                for (int i = start; i <= end; i++) {
                    arr[i].tampilPeminjaman();
                }
                found = true;
                break;
            }
            
            if (res > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Data peminjaman dengan NIM " + targetNIM + " tidak ditemukan.");
        }
    }
}