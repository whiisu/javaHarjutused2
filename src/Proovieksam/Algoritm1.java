package Proovieksam;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle keskmise?
 */
public class Algoritm1 {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleKeskmise(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleKeskmise(int[] ints) {
        //muudan kõik üle 60 pt-d ka võrduma 60-ga
        for (int i = 0; i < ints.length; i++) {
            //System.out.print(ints[i]);
            if (ints[i] >= 60){
                ints[i] = 60;
                //System.out.print(ints[i]);
            }
        }
        // mitu tudengit said üle keskmise?
        //arvuta kesmine ja loe kokku need tudengid kes on üle keskmise
        double sum = 0;
        double keskmine;
        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
            //System.out.print(sum);
        }
        keskmine = sum / ints.length;
        //System.out.print(keskmine);
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > keskmine){
                count++;
            }
        }
        return count;
    }

}
