package Proovieksam;

import java.util.Random;

/** Grigori lahendus
 * Prindi konsooli 27x27 maatriks, kus on täidetud eesti tähestiku sudoku.
 * https://et.wikipedia.org/wiki/Eesti_t%C3%A4hestik
 */
public class Maatriks2 {
    static String[] tahestik = new String[]{"a", "b", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "S", "z",
            "Z", "t", "u", "v", "6", "2", "8", "Y"};
    static String[] nihutatud = new String[27];
    static String[] uustahestik = new String[27];
    public static void main(String[] args) {
        Random rnd = new Random();
        int nr = rnd.nextInt(26 - 0) + 0;
        shuffleArray(nr, tahestik);
        System.arraycopy(nihutatud, 0, uustahestik, 0, tahestik.length);
        Genereerisudoku();


    }

    private static void Genereerisudoku() {
        String[][] sudoku = new String[27][27];
        for (int i = 0; i < sudoku.length; i++) {
            shuffleArray(i, uustahestik);
            for (int j = 0; j < sudoku.length; j++) {
                sudoku[i][j] = nihutatud[j];
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void shuffleArray(int nr, String[] mtrx) {
        int nrmiinus = nr;
        int count = 0;
        for (int i = 0; i < mtrx.length; i++) {
            if (count < mtrx.length - nr){
                nihutatud[i] = mtrx[nr + count];
                count++;
            }else{
                nihutatud[i] = mtrx[nr - nrmiinus];
                nrmiinus--;
            }
        }

    }
}
