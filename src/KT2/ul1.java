package KT2;

import java.util.Arrays;

/**
 * Etteantud n järgi niisuguse n korda n täisarvumaatriks, mille
 * rea ja veeru summa
 * Created by Kaia on 14.12.2015.
 */
public class ul1 {
    public static void main(String[] args) {
        int [][] res = liitmisTabel(9);
        System.out.println(Arrays.toString(res));
    }

    public static int[][] liitmisTabel(int n) {
        int [][] tulemus = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                tulemus[i][j] = i + j;
            }
        }
        return tulemus;
    }

}
