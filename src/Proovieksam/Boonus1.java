package Proovieksam;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Leia netist omale mõni tarkvara teemaline blogi ja
 * hakka seda jälgima. Lisa link ka siia.
 */
public class Boonus1 {
    public static void main(String[] args) throws URISyntaxException {
        String url = "http://www.joelonsoftware.com/";
        String url2 = "http://blog.codinghorror.com/";
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI(url));
        }catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }
    }
}
