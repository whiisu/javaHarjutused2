package Proovieksam;

/**
 * Siin failis kasutatakse objekti Laev, aga Laev klassi ei eksisteeri. Sinu �lesanne
 * on see luua. Pane t�hele, et mitte �kski objekti muutuja ei tohi olla
 * k�ttesaadav objektist v�ljaspoolt.
 *
 * K�esolevat klassi ei tohi muuta! Arvad, et ei j�� vahele? :)
 */
public class Oop2 {
    public static void main(String[] args) {

        String laevaNimi = "Laineraidur";
        Laev2 raidur = new Laev2(laevaNimi);

        raidur.lisaReisija("Teet Kalluste");
        raidur.lisaReisija("Peeter Kaan");
        raidur.lisaReisija("Maire Kaunaste");
        raidur.eemaldaReisija("Peeter Kaan");

        System.out.println("Pardal on j�rgmised isikud: " + raidur.votaReisijad());
        System.out.println("Pardal on nii mitu inimest: " + raidur.reisijateArv());
        System.out.println("Laeva nimi on " + raidur.misNimi());

        raidur.kalaHammustasKummipaatiAugu(); // Paanika!! mis n��d saab?

        System.out.println("Pardal on j�rgmised isikud: " + raidur.votaReisijad());
        System.out.println("Pardal on nii mitu inimest: " + raidur.reisijateArv());
        System.out.println("Laeva nimi on " + raidur.misNimi());
    }
}
