package Proovieksam;

import java.util.ArrayList;

/**
 * Created by Kaia on 29.01.2016.
 */
public class Foor {
    String Nimi;
    ArrayList<String> foorivarvid = new ArrayList<>();

    public Foor (String fooriNimetus){
        Nimi = fooriNimetus;
    }

    public void syytaTuli(String varv) {
        foorivarvid.add(varv);
    }
    public void kustutaTuli(String varv) {
        foorivarvid.remove(varv);
    }

    public String misTuledPolevad() {
        String misPolevad = " ";
        for (int i = 0; i < foorivarvid.size(); i++) {
            misPolevad = misPolevad + foorivarvid.get(i);
        }
        return misPolevad;
    }
    public String votaNimetus() {
        return Nimi;
    }
    public void hakkeridSaidKontrolli() {
        System.out.println("Foor on rikkis, kasuta parema käe reeglit!");
    }
}
