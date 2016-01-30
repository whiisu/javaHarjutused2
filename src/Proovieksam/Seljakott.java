package Proovieksam;

import java.util.ArrayList;

/**
 * Created by Kaia on 30.01.2016.
 */
public class Seljakott {
    String Nimi;
    ArrayList<String> kotiSisu = new ArrayList<>();

    public Seljakott (String nimi){
        Nimi = nimi;
    }

    public void lisaAsi(String asjad) {
        kotiSisu.add(asjad);
    }

    public void eemaldaAsi(String asjad) {
        kotiSisu.remove(asjad);
    }

    public String misOnKotis() {
        String asjadKotis = " ";
        for (int i = 0; i < kotiSisu.size(); i++) {
            asjadKotis = asjadKotis + kotiSisu.get(i);
            asjadKotis = asjadKotis + ". ";
        }
        return asjadKotis;
    }

    public int mituAsjaOnKotis() {
        int mituAsja = 0;
        for (int i = 0; i < kotiSisu.size(); i++) {
            mituAsja = mituAsja + 1;
        }
        return mituAsja;
    }

    public String omanikuNimi() {
        return Nimi;
    }

    public void rebene() {
        System.out.println("Kott on katki läinud!");
    }
}
