import java.io.*;
import java.util.Scanner;

public class Hello {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String args[]){
        
        System.out.print("Hello World!\n");
        System.out.println("Anna etunimesi ja sukunimesi");
        String nimi = lukija.nextLine();
        System.out.printf("Tervetuloa java-ohjelmoinnin maailmaan %s\n", nimi);
        nimi = lukija.nextLine();
    }
}