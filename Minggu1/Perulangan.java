public class Perulangan {

    public static void main(String[] args) {

        int n = 26; 
        // nim saya : 254107020026

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue ;
            } else if ( i % 3 == 0 ) {
                System.out.print(" # ");
            } else if ( i % 2 != 0) {
                System.out.print(" * ");
            } else if (i % 2 == 0 && i % 3 != 0 ){
                System.out.print(" "+ i + " ");
            }
            
        }

    }
}