package Proovieksam;

import java.util.Arrays;

/**
 * EvelinJ, siksak maatriks
 */
public class Maatriks6 {
    //private String tahis = "Z";
    public static void main (String[] args) {
        String [][] maatriks = new String [100][10];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {

                if (i+j==0 || i-j == 0) {
                    maatriks[i][j] = "x";
                } else if (i+j==18 || i-j == 18) {
                    maatriks[i][j] = "x";
                } else if (i+j==36 || i-j == 36) {
                    maatriks[i][j] = "x";
                } else if (i+j==54 || i-j == 54) {
                    maatriks[i][j] = "x";
                } else if (i+j==72 || i-j == 72) {
                    maatriks[i][j] = "x";
                } else if (i+j==90 || i-j == 90) {
                    maatriks[i][j] = "x";
                }  else {
                    maatriks[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(maatriks[i]));
        }
    }
}
