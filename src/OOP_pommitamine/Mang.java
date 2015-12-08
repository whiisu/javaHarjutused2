package OOP_pommitamine;

/**
 * Created by Kaia on 21.11.2015.
 * Mere ja laevastiku genereerimine
 * Mängu loogika: kuni laevu on elus:
 *      küsi kasutaja koordinaadid
 *      pommita merd
 */
public class Mang {
    public Mang(){
        System.out.println("START M2NG");
        Meri meri = new Meri(10); //genereerib positsioonid 0-9
        Mangija mangija = new Mangija();

        while (meri.kasOnLaevuElus()){
            meri.kuvaSeis();
            int[] lask = mangija.kysiLasuKoordinaadid();
            boolean pihtas = meri.kasKeegiSaiPihta(lask);
            if (pihtas){
                mangija.pihtas();

            }else {
                mangija.moodas();
            }
        }
        mangija.gameover();
    }
}
