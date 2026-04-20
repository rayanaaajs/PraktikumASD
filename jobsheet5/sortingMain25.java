package jobsheet5;

public class sortingMain25 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};
        
        sorting25 dataUrut1 = new sorting25(a, a.length);
        sorting25 dataUrut2 = new sorting25(b, b.length);
        sorting25 dataUrut3 = new sorting25(c, c.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("data sudah diurutkan dengan bubble sort (ASC)");
        dataUrut1.tampil();

        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("data sudah diurutkan dengan selection sort (ASC)");
        dataUrut2.tampil();

        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.selectionSort();
        System.out.println("data sudah diurutkan dengan insertion sort (ASC)");
        dataUrut3.tampil();
    }
    
}