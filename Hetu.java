import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Hetu {
    static Scanner lukija = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Anna hetu");
        String hetu = lukija.nextLine();
        if (checkIdNumber(hetu)) printBirthdate(hetu);
    }

    static boolean checkIdNumber(final String hetu)
    {
        int lkm = hetu.length();
        if(lkm == 11){
            char merkit[] = {'-', 'A', '+'};
            for (char merkki:merkit){
                if (merkki== hetu.charAt(6)) {
                    System.out.printf("Merkkejä %d, hetu ok%n", lkm);
                    return true;
                }
            }
                System.out.println("Hetu väärin");
                return false;
        }
        else {
            System.out.printf("Hetu väärin, merkkejä %d%n", lkm);
            return false;
        }
    }
    static void printBirthdate(final String hetu){
        String dd = hetu.substring(0,2); 
        String mm = hetu.substring(2,4); 
        String yy = hetu.substring(4,6); 
        int vuosi = 0;
        if (hetu.charAt(6) == '+') vuosi = 18;
        if (hetu.charAt(6) == '-') vuosi = 19;
        if (hetu.charAt(6) == 'A') vuosi = 20;
        System.out.printf("%s.%s.%d%s", dd, mm, vuosi, yy);
    }
}

/*
Tehtävä 3. Henkilötunnus koostuu 11 merkistä ja on muotoa xxxxxxyzzzq, missä
• xxxxxx on henkilön syntymäaika muodossa ppkkvv,
• y on sen vuosisadan tunnus, jolloin henkilö on syntynyt,
o 1800-luvulla syntyneillä + o 1900-luvulla syntyneillä – o 2000-luvulla syntyneillä A
• zzz on yksilönumero,
• q on tarkistusmerkki.
Kirjoita ohjelma, joka kysyy henkilötunnuksen ja tulostaa henkilön syntymäajan muodossa
pp.kk.vvvv
Kirjoita tätä varten metodit:
• static boolean checkIdNumber(final String hetu);
• static void printBirthdate(final String hetu);
Ensimmäinen metodi tarkistaa, että syötteessä on 11 merkkiä ja että vuosisadan tunnus on jokin kolmesta sallitusta merkistä. Muita tarkistuksia ei tehdä. Merkkijonon pituuden saa selville String-luokan metodilla length() ja merkkijonon tietyssä kohdassa sijaitsevan merkin metodilla charAt, esimerkiksi charAt(2) palauttaa merkkijonon jono kolmannen merkin ja kutsu jono.length() palauttaa kyseisen merkkijonon pituuden.
Toinen funktio tulostaa tarkistamastaan tunnuksesta syntymäajan.
Mikäli ohjelmointi-intoa riittää, henkilötunnuksen tarkistamista voi täydentää ylimääräisenä tehtävänä tutkimalla seuraavat asiat:
1. että syntymäaika on laillinen päivämäärä,
2. että yksilönumero koostuu numeerisista merkeistä, 3. että tarkistusmerkki on oikea
*/
