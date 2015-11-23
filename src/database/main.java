package database;

import java.util.Scanner;

/**
 * Created by Kaia on 22.11.2015.
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta kasutajanimi");
        String kasutajaNimi = sc.nextLine();
        System.out.println("Sisesta parool");
        String parool = sc.nextLine();

        Andmebaas andmebaas = new Andmebaas();
        //andmebaas.looTabel(); //mitte kasutada projektis! Saab kasutada ainult esimesel korral, viia see konstruktoris
        boolean kasutajaEksisteerib = andmebaas.kasKasutajaOlemas(kasutajaNimi);
        System.out.println(kasutajaEksisteerib);

        if (kasutajaEksisteerib){
            // idee poolest logi sisse või rega uus kasutaja
        }else {
            andmebaas.registreeri(kasutajaNimi, parool);

        }
        andmebaas.sulgeYhendus(); //sulgeb andmebaasi peale kasutamist

    }
}
