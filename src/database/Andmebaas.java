package database;

import java.sql.*;

/**
 * Created by Kaia on 22.11.2015.
 */
public class Andmebaas {
    // andmebaas on serverisolev eraldi programm
    // sql tuleb alla laadida ja database kausta lohistada
    // tuleb �hendus �ra defineerida
    Connection conn;

    public Andmebaas() {
        try { //peale alt+enter sisestamist forName-le
            Class.forName("org.sqlite.JDBC"); //�henduse loomine, forName v�ib errorit visata, surround with try-catch
            conn = DriverManager.getConnection("jdbc:sqlite:login2.db"); //loon �henduse, jdbc:sqlite: kohustuslik, login2.db loon ise
            // add catch
            System.out.println("Andmebaas on �hendatud");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void sulgeYhendus(){
        try {
            conn.close(); //try-catch sellele, close'le
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean kasKasutajaOlemas(String kasutajaNimi) {
        //String sql = "SELECT USERNAME FROM USER WHERE USERNAME = '" + kasutajaNimi + "'";  // * t�hendab et valib k�ik v�ljad User v�ljast
        String sql = String.format("SELECT USERNAME FROM USER WHERE USERNAME = '%s'", kasutajaNimi);

        boolean olemas = kaivitaKasutajaOlemasToiming(sql);
        return olemas;
    }

    private boolean kaivitaKasutajaOlemasToiming(String sql) {
        try {
            Statement stat = conn.createStatement(); ////
            ResultSet tulemus = stat.executeQuery(sql); // ta on eraldi s�steem v�ljade k�simiseks

            String username = tulemus.getString("USERNAME");
            //System.out.println(username); //kontrolliks

            tulemus.close();
            stat.close();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void looTabel() {
        try {
            java.sql.Statement stat = conn.createStatement(); //??? java.sql
            String sql = "CREATE TABLE USER(ID INT AUTO_INCREMENT, USERNAME TEXT, PASSWORD TEXT, FULLNAME TEXT, ADDRESS TEXT);";
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registreeri(String kasutajaNimi, String parool) { //LOON TABELI
        try {
            Statement stat = conn.createStatement();
            String sql = String.format("INSERT INTO USER (USERNAME, PASSWORD) VALUES ('%s', '%s')", kasutajaNimi, parool);
            //SUURED T�HED ON TAVA, MITTE KOHUSTUSLIK sql-s
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
