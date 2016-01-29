package Proovieksam;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Kaia on 29.01.2016.
 */
public class Boonus2 {
    public static void main(String[] args) throws URISyntaxException {
        String url = "http://code.krister.ee/effective-programming-by-jeff-atwood-table-of-links/";
        String moraal = "Kui leiad, et saad ning tahad midagi paremaks teha, siis tee seda."; // kirjuta siia
        String moraal2 = "Everyone should try writing a little code, because it somehow sharpens the mind.";
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI(url));
        }catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println(moraal);
        System.out.println(moraal2);
    }
}
