import java.util.Scanner;

public class NilaiAkhir {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
    System.out.println("==============================");

    System.out.print("masukkan nilai tugas : ");
    double nilaiTugas = input.nextDouble();
    
    System.out.print("masukkan nilai kuis : ");
    double nilaiKuis = input.nextDouble();

    System.out.print("masukkan nilai UTS : ");
    double nilaiUts = input.nextDouble();
    
    System.out.print("masukkan nilai UAS : ");
    double nilaiUas = input.nextDouble();

    System.out.println("==============================");
    System.out.println("==============================");

    if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {

    System.out.println("nilai yang dinput tidak valid");
    System.out.println("==============================");
    System.out.println("==============================");

    } else {
        
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUts) + (0.3 * nilaiUas) ;
    
        String nilaiHuruf;
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
    

            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            
            System.out.println("==============================");
            System.out.println("==============================");
    
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")   ) {
                
                System.out.println("maaf anda tidak lulus");

            } else {
                
                System.out.println("selamat anda lulus");
            }
            
        }
    }
    
}

