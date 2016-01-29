package Proovieksam;

/**
 * Siin failis kasutatakse objekti Kassa, aga Kassa klassi ei eksisteeri. Sinu �lesanne
 * on see luua. Pane t�hele, et mitte �kski objekti muutuja ei tohi olla
 * k�ttesaadav objektist v�ljaspoolt.
 *
 * K�esolevat klassi ei tohi muuta - mitte �htegi t�hem�rki! Arvad, et ei j�� vahele? :)
 */
public class Objektorienteeritus1 {
    public static void main(String[] args) {

        String kassapidaja = "Laine";
        Kassa kassa = new Kassa(kassapidaja);

        kassa.lisaToode("Piim");
        kassa.lisaToode("Sai");
        kassa.lisaToode("Lillkapsas");
        kassa.lisaToode("Lamuu j��tis");
        kassa.lisaToode("Kanepik�psis");
        kassa.eemaldaToode("Piim");
        kassa.eemaldaToode("Sai");
        kassa.lisaToode("Leib");

        System.out.println("Klient ostis j�rgmised tooted: " + kassa.votaTooted());
        System.out.println("Tooteid on kokku: " + kassa.votaToodeteArv());
        System.out.println("Kassapidaja nimi on " + kassa.votaKassapidajaNimi());

        kassa.kliendilPoleRaha(); // Mis n��d saab?

        System.out.println("Klient ostis j�rgmised tooted: " + kassa.votaTooted());
        System.out.println("Tooteid on kokku: " + kassa.votaToodeteArv());
    }
}
