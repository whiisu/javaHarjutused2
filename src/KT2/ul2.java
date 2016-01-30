package KT2;

/**
 * Asendamine: antud lõigus s kõik tühikud märgiga '-'
 * Created by Kaia on 14.12.2015.
 */
public class ul2 {
    public static void main(String[] args) {
        String s = "Tere TUDENG, tore ARVUTI sul!";
        String t = asenda(s);
        System.out.println(s + ">" + t );
    }

    public static String asenda(String s) {
        String asenda = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i)))
                asenda += '-';
            else
                asenda += s.charAt(i);
        }
        return asenda;
    }
}
