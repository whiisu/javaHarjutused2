package Proovieksam;

import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle mediaani?
 */
public class Algoritm4 {
    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleMediaani(new int[]{21, 85, 45}));
    }
    // Siia meetodi sisse kirjuta lahendus.
    private static int yleMediaani(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 60){
                ints[i] = 60;
            }
        }
        Arrays.sort(ints);
        int keskkoht = ints.length/2;
        double mediaan;
        if (ints.length % 2 == 1){
            mediaan = ints[keskkoht];
        }else{
            mediaan = (ints[keskkoht-1] + ints[keskkoht])/2;
        }
        int yleMediaani = 0;
        for (int anInt : ints) {
            if (anInt > mediaan) {
                yleMediaani = yleMediaani + 1;
            }
        }

        return yleMediaani;
    }
}
