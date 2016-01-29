package Proovieksam;

import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks k�ik suuremad arvud 60 peale �mardama.
 * Teiseks leia mitu tudengit said alla mediaani?
 */
public class Algoritm2 {
    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(allaMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaMediaani(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int allaMediaani(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] >= 60){
                ints[i] = 60;
            }
        }
        Arrays.sort(ints);
        int keskmine = ints.length/2;
        double mediaan;

        if (ints.length% 2 == 1){
            mediaan = ints[keskmine];
        }else{
            mediaan = (ints[keskmine-1] + ints[keskmine])/2;
        }
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < mediaan) {
                count++;
            }
        }
        return count;
    }
}
