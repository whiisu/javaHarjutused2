package teema2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Loo laevade pommitamine, kus on vaid 1x1 laevad ja kasutaja saab arvuti laevasid pommitada 9x9 maatriksil.
 */
public class Kordamine1_laevad_maatriksil {
    public static void main(String[] args) {
        int laius = 9;
        int pikkus = 9;
        //loon uue laua 9x9 maatriksi
        int[][] laud = new int[laius][pikkus];
        //käin kõik kohad läbi ja genereerin kas 0 või 1
        //0 - tühi, 1 - laev, 2 - pihtasaanud laev
        for (int i = 0; i < laius; i++) { //x-telg
            for (int j = 0; j < pikkus; j++) { // y-telg
                laud[i][j] = (int) (Math.random() * 1.01);
                // Aseta laua positsioonile i-j (x-y) 0 või 1
            }
        }
        // Näita lauda lihtsalt arendamise lihtsustamiseks
        System.out.println("Genereeritud laud:");
        for (int i = 0; i < laius; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        // Scanner aitab meil kasutajalt sisendit võtta
        Scanner scanner = new Scanner(System.in);

        // Pommitamine käib while tsükli sees.
        // kuni (tingimus) {tegevus}
        // Antud juhul käivitatakse meetod nimega laevuAlles(), mis on defineeritud faili lõpus.

        while (laevuAlles(laud)){
            // Lisa kaks tühja rida (\n on "uus rida")
            System.out.println("\n\n");

            //küsi kasutajalt sisendit
            System.out.println("Sisesta x koordinaat: ");
            int x = scanner.nextInt() - 1; //küsi sisendit x
            System.out.println("Sisesta Y koordinaat: ");
            int y = scanner.nextInt() - 1; //küsi sisendit y
            // "-1" on sisendil sellepärast, et kasutaja mängib laiusel 1-9
            // aga massiivide loendamine algab nullist ja tegelikult käib
            // mäng laiusel 0-8

            // Kontrolli, et sisend on mängu piires
            // "kui (x < 1 VÕI y < 1 VÕI x > 9 VÕI y > 9) {siis...}"
            if (x < 0 || y < 0 || x > 9 || y > 9){
                System.out.println("Mängulaud on 9x9");
                continue; // katkesta while tsükli praegune ring ja hakka otsast
            }
            // kontrolli kas mängija sai pihta
            if (laud[x][y] == 1){
                System.out.println("Said pihta!");
                laud[x][y] = 2;
            } else if (laud [x][y] == 2){
                System.out.println("Juba p6hjas, proovi uuesti!");
            }else if (laud[x][y] == 0) {
                System.out.println("M88das.");
            }
        }
        // kui tsükkel on katkenud siis järelikult on mäng läbi
        System.out.println("Said laevadest jagu!");
    }
    // Kas laual on pommitamata laevu alles?
    // Tagastab booleani, ehk true või false
    // vastu võtab int[][] ehk maatriksi, mille nimetame meetodi mugavuse jaoks "laud"
    private static boolean laevuAlles(int[][] laud){
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud[i].length; j++) {
                if (laud[i][j] == 1){   // Kui x-y väärtus on 1, siis
                    return true;    // tagasta true, ehk tõene.
                }   // return katekstab reeglina meetodi töö.
                // Programm jätkub sealt, kus meetod välja kutsuti.
            }
        }
        return false;
    }

}
