import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        char KODE[] = {
                'A',
                'B',
                'D',
                'E',
                'F',
                'G',
                'H',
                'L',
                'N',
                'T'
        };

        char KOTA[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ' },
                { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ' },
                { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ' },
                { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ' }
        };

        System.out.print("masukkan kode plat yang ingin kamu cari : ");
        
        char inputKode = input.next().toUpperCase().charAt(0);


        boolean ditemukan = false ;

        for (int i = 0; i < KOTA.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println(KOTA[i]);
                ditemukan = true;
                break;
            }   
            
        }

        if (!ditemukan) {
            System.out.println("plat yang anda cari tidak ketemu");
        }
    }
}
