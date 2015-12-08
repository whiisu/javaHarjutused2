package OOP_pommitamine;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kaia on 21.11.2015.
 *
 */
public class Laev { //muutujad on tavaliselt privat classid
    private int[] koordinaadid;
    private boolean elus = true;

    public Laev(int mereServaPikkus) {
        //kutsume meeetodi välja
        System.out.println("Start Laev");
        genereeriKoordinaadid(mereServaPikkus);
    }

    private void genereeriKoordinaadid(int mereServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(mereServaPikkus);
        int y = rand.nextInt(mereServaPikkus);
        koordinaadid = new int[]{x, y};
        System.out.println(Arrays.toString(koordinaadid));
    }
    public boolean kasOledElus() {
        return elus;
    }
    public boolean kasSaadPihta(int[] lask) {
        if (Arrays.equals(lask, koordinaadid) && elus){
            elus = false;
            return true;
        }
        return false;
    }
    public int[] annaKoordinaadid() {
        return koordinaadid;
    }
}
