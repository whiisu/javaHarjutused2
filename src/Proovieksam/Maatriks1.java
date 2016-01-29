package Proovieksam;

/**
 * Prindi konsooli 9x9 maatriks selliselt, et
 * joonistub suur X �le laua, nagu bingo diagonaalid.
 *
 * N�ide:
 *
 * x       x
 *  x     x
 *   x   x
 *    x x
 *     x
 *    x x
 *   x   x
 *  x     x
 * x       x
 *
 * Kasuta mis iganes t�hiseid soovid �lesande lahendamiseks.
 */
public class Maatriks1 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j || j + i == 8){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
