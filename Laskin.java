import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Laskin {
    static Scanner lukija = new Scanner(System.in);
    public static void main(String args[]){
        int max_int_value = Integer.MAX_VALUE;
        int min_int_value = Integer.MIN_VALUE;
        System.out.printf("Saat antaa lukuja välillä: %d -> %d%n", min_int_value,
                                                                max_int_value);
        int lkm = 0, max = 0, min = 0;
        int luku = 0;
        double yhteensa = 0;
        do {
            try {
            System.out.print("Anna positiivinen luku tai lopeta (neg tai 0) \n");
            luku = lukija.nextInt();
            if (luku <= 0) break;
            yhteensa += luku; 
            lkm++;
            max = luku > max || lkm == 1 ? luku : max;
            min = (luku < min && luku > 0 ) || lkm == 1 ? luku : min;
            }
            catch (java.util.InputMismatchException e) {
                System.out.print("Invalid number \n");
                lukija.next();
            }
        } while (true);
        System.out.printf("Minimiarvo: %d%n", min);
        System.out.printf("Maximiarvo: %d%n", max);
        System.out.printf("Lukumäärä: %d%n", lkm);
        System.out.printf("Keskiarvo: %.2f%n", yhteensa/lkm);
    }
}