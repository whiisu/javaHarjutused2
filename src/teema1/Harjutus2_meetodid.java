package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {


    public static void main(String[] args) {
        int kuup = tostaKuupi(3);
        String sisestus = kasutajaSisestus("Mitu s6rme on yhel k2el?", 0, 5);
        System.out.println(kuup);
        System.out.println(sisestus);
    }
    public static int tostaKuupi(int arv) {
        return arv * arv * arv;
    }

    public static String kasutajaSisestus(String kysimus, int min, int max) {

        Scanner sc = new Scanner(System.in);
        System.out.println(kysimus);
        int sisestus = sc.nextInt();

        if (sisestus < max && sisestus > min){
            return kysimus;
        }else {
            System.out.println("Vale, proovi uuesti.");
            return kasutajaSisestus(kysimus, min, max);
        }
    }
}
