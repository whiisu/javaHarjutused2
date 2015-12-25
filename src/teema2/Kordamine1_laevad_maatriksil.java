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
        //k�in k�ik kohad l�bi ja genereerin kas 0 v�i 1
        //0 - t�hi, 1 - laev, 2 - pihtasaanud laev
        for (int i = 0; i < laius; i++) { //x-telg
            for (int j = 0; j < pikkus; j++) { // y-telg
                laud[i][j] = (int) (Math.random() * 1.01);
                // Aseta laua positsioonile i-j (x-y) 0 v�i 1
            }
        }
        // N�ita lauda lihtsalt arendamise lihtsustamiseks
        System.out.println("Genereeritud laud:");
        for (int i = 0; i < laius; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        // Scanner aitab meil kasutajalt sisendit v�tta
        Scanner scanner = new Scanner(System.in);

        // Pommitamine k�ib while ts�kli sees.
        // kuni (tingimus) {tegevus}
        // Antud juhul k�ivitatakse meetod nimega laevuAlles(), mis on defineeritud faili l�pus.

        while (laevuAlles(laud)){
            // Lisa kaks t�hja rida (\n on "uus rida")
            System.out.println("\n\n");

            //k�si kasutajalt sisendit
            System.out.println("Sisesta x koordinaat: ");
            int x = scanner.nextInt() - 1; //k�si sisendit x
            System.out.println("Sisesta Y koordinaat: ");
            int y = scanner.nextInt() - 1; //k�si sisendit y
            // "-1" on sisendil sellep�rast, et kasutaja m�ngib laiusel 1-9
            // aga massiivide loendamine algab nullist ja tegelikult k�ib
            // m�ng laiusel 0-8

            // Kontrolli, et sisend on m�ngu piires
            // "kui (x < 1 V�I y < 1 V�I x > 9 V�I y > 9) {siis...}"
            if (x < 0 || y < 0 || x > 9 || y > 9){
                System.out.println("M�ngulaud on 9x9");
                continue; // katkesta while ts�kli praegune ring ja hakka otsast
            }
            // kontrolli kas m�ngija sai pihta
            if (laud[x][y] == 1){
                System.out.println("Said pihta!");
                laud[x][y] = 2;
            } else if (laud [x][y] == 2){
                System.out.println("Juba p6hjas, proovi uuesti!");
            }else if (laud[x][y] == 0) {
                System.out.println("M88das.");
            }
        }
        // kui ts�kkel on katkenud siis j�relikult on m�ng l�bi
        System.out.println("Said laevadest jagu!");
    }
    // Kas laual on pommitamata laevu alles?
    // Tagastab booleani, ehk true v�i false
    // vastu v�tab int[][] ehk maatriksi, mille nimetame meetodi mugavuse jaoks "laud"
    private static boolean laevuAlles(int[][] laud){
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud[i].length; j++) {
                if (laud[i][j] == 1){   // Kui x-y v��rtus on 1, siis
                    return true;    // tagasta true, ehk t�ene.
                }   // return katekstab reeglina meetodi t��.
                // Programm j�tkub sealt, kus meetod v�lja kutsuti.
            }
        }
        return false;
    }

}
