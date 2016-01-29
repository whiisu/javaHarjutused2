package Proovieksam;

/**
 * Siin failis kasutatakse objekti Foor, aga Foor klassi ei eksisteeri. Sinu �lesanne
 * on see luua. Pane t�hele, et mitte �kski objekti muutuja ei tohi olla
 * k�ttesaadav objektist v�ljaspoolt.
 *
 * K�esolevat klassi ei tohi muuta! Arvad, et ei j�� vahele? :)
 */
public class Oop3 {
    public static void main(String[] args) {

        String fooriNimetus = "S�le-Paldiski SR3A";
        Foor foor = new Foor(fooriNimetus);

        foor.syytaTuli("punane");
        foor.syytaTuli("kollane");
        foor.syytaTuli("roheline");
        foor.kustutaTuli("punane");
        foor.kustutaTuli("kollane");

        System.out.println("Fooril peaks p�lema ainult punane, tegelt p�leb: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on " + foor.votaNimetus());

        foor.hakkeridSaidKontrolli(); // Paanika!

        System.out.println("Fooris p�levad tuled: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on: " + foor.votaNimetus());
    }
}
