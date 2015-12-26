package SQL_Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Kaia on 26.12.2015.
 */
public class Andmebas {
    Connection conn = null;

    public Andmebas(){
        looYhendus();
        looTabel();
    }
    // Et andmebaasi kasutada peame sellega esiteks ühenduse looma
    private void looYhendus() {
        try {
            Class.forName("org.sqlite.JDBC");                           // Lae draiver sqlite.jar failist
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");  // loo ühendus andmebaasi failiga
        }catch (Exception e){                                           // püüa kinni võimalikud errorid
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Opened database successfully");             // lihtsalt meie enda jaoks teade
    }
    // Et andmebaasist kasu oleks, loome uue tabeli. See on nagu uus 'sheet' excelis.
    private void looTabel() {
        // Käsk ise on CREATE TABLE ja sulgude vahel on kõik tulbad, mida tahan, et tabel hoiaks.
        String sql = "CREATE TABLE IF NOT EXISTS USERS (ID INT AUTO_INCREMENT, USERNAME TEXT," + // jätkub järgmisel real
                "PASSWORD TEXT, FULLNAME TEXT, NUMBER INT, ADDRESS TEXT);";
        teostaAndmebaasiMuudatus(sql);
    }
    // Andmebaasi muudatused ei tagasta väärtusi (erinevalt päringutest) ja on lihtne eraldi meetodi tuua.
    private void teostaAndmebaasiMuudatus(String sql) {
        try {
            // Statement objekt on vajalik, et SQL_Login käsku käivitada
            java.sql.Statement stat = conn.createStatement(); //Statement sql
            stat.executeUpdate(sql);
            stat.close();           // Statement tuleb samuti kinni panna nagu ka Connection.
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


}
