package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kaia on 8.12.2015.
 */
public class Peamurdja3_laevad2 {
    public static void main(String[] args) {
        int[][] laud = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                laud[i][j] = r();
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        Scanner kasutaja = new Scanner(System.in);
/*
        while (!gameover(laud)){
            System.out.println(Arrays.toString(laud));
            System.out.println("Sisesta number 1-"+laud.length);
            int sisestus = kasutaja.nextInt() - 1;

            int hit = laud[sisestus];
            if (hit == 0){
                System.out.println("haha, mööda!");
            }else if (hit == 2){
                System.out.println("oled siia juba lasknud!");
            }else if (hit == 1){
                System.out.println("Yes, pihtas!");
                laud[sisestus] = 2;
            }
        }
*/
        System.out.println("Võitsid!");
    }
    public static boolean gameover(int[] laud){
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud.length; j++) {

            }
            if (laud[i]== 1){
                return true;
            }
        }
        return false;
    }
    public static int r(){
        return (int)(Math.random() * 2);
    }
}
