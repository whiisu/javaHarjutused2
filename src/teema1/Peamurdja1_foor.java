package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

import java.applet.Applet;

/**
 * Kasuta objekti Foor, et teha valgusfoori tsükkel 5 korda.
 * Foori kasutusjuhend: https://github.com/KristerV/javaHarjutused
 *
 * Abiks on "Naidis_KollaneVilkuja" klass, kus on juba kollane tuli vilkuma pandud.
 * Lisaks tuleb teada, et Foor on JavaFX programm. Tavalise programmiga
 * on kaks erinevust: klass peab laiendama (extends) teist klassi nimega
 * Application ja programm mitte ei alga main() meetodi seest, vaid
 * hoopis start() meetodi seest. Vaata Naidis_KollaneVilkuja näidet. Muide,
 * kui "extends Application" õigesse kohta ära kirjutad siis Intellij
 * pakub sulle, et kirjutab ise start() meetodi õigesti ära - proovi järgi.
 *
 * NB! Kui kirjutad new Foor(); siis IDE pakub sulle Foori importimise võimalust.
 * Kliki punase teksti peale ja vajuta alt+enter.
 */
public class Peamurdja1_foor extends Application
{
    public void start(Stage primaryStage) throws Exception
    {
        Foor foor = new Foor();
        int count = 5;

        for (int i = 0; i < count; i++)
        {
            blinkRed(foor);
            blinkYellow(foor);
            blinkGreen(foor);
            blinkYellow1(foor);
        }
    }

    private void blinkRed(Foor foor)
    {
        foor.vahetaPunast();
        foor.paus(5);
    }

    private void blinkYellow(Foor foor)
    {
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaKollast();
        foor.vahetaPunast();
    }

    private void blinkYellow1(Foor foor)
    {
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
    }

    private void blinkGreen(Foor foor)
    {

        foor.vahetaRohelist();
        foor.paus(2);
        foor.vahetaRohelist();

        int count = 0;
        while (count<6)
        {
            foor.paus(0.5);
            foor.vahetaRohelist();

            count++;
        }
    }
}