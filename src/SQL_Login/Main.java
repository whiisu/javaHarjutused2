package SQL_Login;

/**
 * Created by Kaia on 25.12.2015.
 */

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Tere. Sinu k�es on n�ide andmebaaside �lesehitusest Javas, kasutades SQLite'i. Tegu on v�ga lihtsa andmebaasi
 * s�steemiga, mida v�id projektis kasutada.
 *
 * ENNE KUI SAAD ALUSTADA OMA PROJEKTIGA pean sqlite.jar'i alla laadima (https://bitbucket.org/xerial/sqlite-jdbc/downloads),
 * oma projekti tooma (soovitan /lib/ kausta) ja aktiveerima - klikkides .jar failile parema klikiga ja valides "Add as Library".
 * Muide, vahel mingil veidral p�hjusel peab uuesti "Add as Library.." k�sku k�ivitama.
 *
 * Edasi vaata Andmenaas.java kuidas seda aska kasutada. K�esolevas programmis on kaks akent: LoginScreen ja UserDetails. Ehk
 * kasutaja saab esiteks registreerida v�i sisse logida ja siis oma andmeid muuta.
 *
 * T�htis on andmebaaside kohta teada seda, et piltlikult k�ituvad SQL_Login andmebaasi andmed kui exceli tabelid. Enne kui
 * midagi p�rida v�i muuta saad pead andmebaasiga �henduse looma. P�rast andmebaasi kasutamist pead �henduse ka sulgema - muidu
 * kulutad asjatult arvuti ressursse.
 */

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        new LoginScreen(); //k�ivitame login akna
    }
}
