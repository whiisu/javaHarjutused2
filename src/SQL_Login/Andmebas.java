package SQL_Login;

import java.sql.*;
import java.util.HashMap;

/**
 * Created by Kaia on 26.12.2015.
 */
public class Andmebas {
    Connection conn = null;

    // Constructor, ehk meetod mis k�ivitub kohe objekti v�lja kutsumisel
    public Andmebas(){
        looYhendus();
        looTabel();
    }
    // Et andmebaasi kasutada peame sellega esiteks �henduse looma
    private void looYhendus() {
        try {
            Class.forName("org.sqlite.JDBC");                           // Lae draiver sqlite.jar failist
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");  // loo �hendus andmebaasi failiga
        }catch (Exception e){                                           // p��a kinni v�imalikud errorid
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Opened database successfully");             // lihtsalt meie enda jaoks teade
    }
    // Et andmebaasist kasu oleks, loome uue tabeli. See on nagu uus 'sheet' excelis.
    private void looTabel() {
        // K�sk ise on CREATE TABLE ja sulgude vahel on k�ik tulbad, mida tahan, et tabel hoiaks.
        String sql = "CREATE TABLE IF NOT EXISTS USERS (ID INT AUTO_INCREMENT, USERNAME TEXT," + // j�tkub j�rgmisel real
                "PASSWORD TEXT, FULLNAME TEXT, NUMBER INT, ADDRESS TEXT);";
        teostaAndmebaasiMuudatus(sql);
    }
    // Andmebaasi muudatused ei tagasta v��rtusi (erinevalt p�ringutest) ja on lihtne eraldi meetodi tuua.
    private void teostaAndmebaasiMuudatus(String sql) {
        try {
            // Statement objekt on vajalik, et SQL_Login k�sku k�ivitada
            java.sql.Statement stat = conn.createStatement(); //Statement sql
            stat.executeUpdate(sql);
            stat.close();           // Statement tuleb samuti kinni panna nagu ka Connection.
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public boolean login(String username, String password) {
        try{
            Statement stat = conn.createStatement();
            // SELECT on nagu excelis hiirega "selekteeriks" mingeid kaste. SQLis t�hendab konkreetselt,
            // et milliste tulpade infot soovid k�tte saada. WHERE'ga k�sed v�lja v�tta ainult tingimustele vastavad v�ljad.
            String sql = "SELECT * FROM USERS WHERE USERNAME = '\" + username + \"' LIMIT 1;";
            // Kuna tegu on p�ringuga siis k�suks on executeQuery ja ta tagastab andme objekti ResultSet.
            ResultSet rs = stat.executeQuery(sql);
            // Kui Query andmeid ei tagastanud (p�ring ei toonud tulemusi) siis rs-i kasutada ei saa.
            // Seep�rast, kui kasutajat ei eksisteeri tuleb lihtsalt error ja "return" k�suni ei j�utagi.
            // Aga j�utakse l�pu "return false" k�suni k�ll.
            String dbPassword = rs.getString("PASSWORD");
            rs.close();
            stat.close();
            return  password.equals(dbPassword);
        } catch (SQLException e){
            e.printStackTrace();
            System.exit(0);
        }
        return false;
    }
    // Kui programmis avad ainult �hendusi ja �htegi ei sulge siis see kulutab arvuti (serveri) ressursse.
    // �sna kiiresti v�ib masina kokku jooksutada.
    public void sulgeYhendus() {
        try {
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("�hendus suletud");
    }

    public HashMap getUser(String kasutajanimi) {
        HashMap andmed = new HashMap();
        try {
            Statement stat = conn.createStatement();
            String sql = "SELECT * FROM USERS WHERE USERNAME = '\" + kasutajanimi + \"' LIMIT 1;";
            // LIMIT piirab tulemuste arvu.
            ResultSet rs = stat.executeQuery(sql);
            // Kui stat.executeQuery() toob tagasi t�hja tulemuse, siis rs'i kasutada ei saa.
            // Kui oleks mitu rida andmeid, peaks ts�kliga lahendama while (rs.next()) {}
            // Nopin k�sitsi andmed �helt realt v�lja
            andmed.put("username", rs.getString("username"));
            andmed.put("password", rs.getString("password"));
            andmed.put("fullname", rs.getString("fullname"));
            andmed.put("number", rs.getString("number"));
            andmed.put("address", rs.getString("address"));

            rs.close();
            stat.close();
            return andmed;
        }catch (SQLException e){
            e.printStackTrace();
            System.exit(0);
        }
        return andmed;
    }

    public void uuendaKasutajaAndmeid(HashMap<String, String> andmed) {
        String username = andmed.get("username");
        String password = andmed.get("password");
        String fullname = andmed.get("fullname");
        String number = andmed.get("number");
        String address = andmed.get("address");

        try {
            Statement stat = conn.createStatement();
            // Andmete uuendamise k�si on UPDATE. SET �tleb, et n��d tulevad need uued andmed sisse. WHERE �tleb mis ridu uuendada.
            String sql = String.format("UPDATE USERS SET USERNAME = '%s', PASSWORD = '%s', FULLNAME = '%s', NUMBER = '%s', " +
                    "ADDRESS = '%s' WHERE USERNAME = '%s';", username, password, fullname, number, address, username);
            stat.executeUpdate(sql);
            stat.close();
        }catch (SQLException e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    public void registreeriKasutaja(String username, String password) {
        // Andmete sisestamiseks on k�sk INSERT. Esimestes sulgudes on tulabad KUHU salvestada,
        // teistes sulgudes VALUES() on MIDA salvestada.
        String sql ="INSERT INTO USERS (USERNAME, PASSWORD) VALUES ('\"+username+\"','\"+password+\"')";
        teostaAndmebaasiMuudatus(sql);
    }
}
