package Proovieksam;

import java.util.ArrayList;

/**
 * Created by Kaia on 28.01.2016.
 */
public class Kassa {

    String Nimi;
    ArrayList<String> ostukorv = new ArrayList<>();

    public Kassa(String kassapidaja){
        Nimi = kassapidaja;
    }

    public ArrayList lisaToode(String toode) {
        ostukorv.add(toode);
        return ostukorv;
    }

    public void eemaldaToode(String toode) {
        if(ostukorv.contains(toode)){
            ostukorv.remove(toode);
        }
    }

    public String votaTooted() {
        String ostuNimekiri = " ";
        for (int i = 0; i < ostukorv.size(); i++) {
            ostuNimekiri += ostukorv.get(i);
            ostuNimekiri += " ";
        }
        return ostuNimekiri;
    }

    public int votaToodeteArv() {
        int tooteidKokku = ostukorv.size();
        return tooteidKokku;
    }

    public String votaKassapidajaNimi() {
        return Nimi;
    }

    public void kliendilPoleRaha() {
        System.out.println("Raha otsas!");
    }
}
