package OOP_pommitamine;

import java.util.Arrays;

/**
 * Created by Kaia on 21.11.2015.
 */
public class Meri {
    private int mereServaPikkus;
    private Laev[] laevastik = new Laev[5];

    public  Meri(int pikkus){
        System.out.println("Start Meri");
        mereServaPikkus=pikkus;
        looLaevastik();
    }

    private void looLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i]=new Laev(mereServaPikkus);

        }
        //Laev laev = new Laev(mereServaPikkus);
    }

    public boolean kasOnLaevuElus() {
        for (Laev laev: laevastik){
            boolean elus = laev.kasOledElus();
            if (elus){
                return true;
            }
        }
        return false;
    }

    public boolean kasKeegiSaiPihta(int[] lask) {
        for (Laev laev : laevastik){
            boolean pihtas = laev.kasSaadPihta(lask);
            if (pihtas){
                return true;
            }
        }
        return false;
    }
    public void kuvaSeis() {
        //loome lauamaatriksi
        int[][] laud = new int[mereServaPikkus][mereServaPikkus];
        for (Laev laev : laevastik){
            int[] koordinaadid = laev.annaKoordinaadid();
            boolean elus = laev.kasOledElus();
            int x = koordinaadid[0];
            int y = koordinaadid[1];
            if (!elus){
                laud[x][y] = 2;
            }else{
                laud[x][y] = 0;
            }

            // kas laev on terve tuleks siin küsida
        }
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
    }
}
