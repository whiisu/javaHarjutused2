package Proovieksam;

import java.util.ArrayList;

/**
 * Created by Kaia on 29.01.2016.
 */
public class Laev2 {
    String Nimi;
    ArrayList<String> reisijad = new ArrayList<>();

    public Laev2 (String laevaNimi){
        Nimi = laevaNimi;
    }

    public ArrayList lisaReisija(String reisija) {
        reisijad.add(reisija);
        return reisijad;
    }
    public void eemaldaReisija(String reisija) {
        if (reisijad.contains(reisija)){
            reisijad.remove(reisija);
        }
    }
    public String votaReisijad() {
        String reisijateNimekiri = " ";
        for (int i = 0; i < reisijad.size(); i++) {
            reisijateNimekiri += reisijad.get(i);
            reisijateNimekiri += " ";
        }
        return reisijateNimekiri;
    }
    public int reisijateArv() {
        return reisijad.size();
    }
    public String misNimi() {
        return Nimi;
    }
    public void kalaHammustasKummipaatiAugu() {
        System.out.println("SOS, upume!");
    }
}
