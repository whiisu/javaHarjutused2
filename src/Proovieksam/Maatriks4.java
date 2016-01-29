package Proovieksam;

/**
 * mmuttlik
 */
public class Maatriks4 {
    private static char[][] laud = new char[10][10];
    private static int[] laevad = {3, 3, 3};

    public static void main(String[] args) {
        genereeriLaud();
        lisaLaevad();
        n2itaLauda();
    }

    private static void n2itaLauda() {
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud[0].length; j++) {
                System.out.print(" " + laud[i][j]);
            }
            System.out.println(" ");
        }
    }

    private static void genereeriLaud() {
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud[0].length; j++) {
                laud[i][j] = '.';
            }
        }
    }

    private static void lisaLaevad() {
        for (int laev : laevad) {
            boolean lisatud = false;
            while (!lisatud) {
                int x = (int) (laud.length * Math.random());
                int y = (int) (laud[0].length * Math.random());
                boolean vertikaal = ((int) (10 * Math.random())) % 2 == 0;

                if (vertikaal) {
                    // Otsib vertikaalset vaba ruumi.
                    boolean kasOnRuumi = true;
                    for (int i = 0; i < laev; i++) {
                        if (y + i >= laud[0].length) {
                            kasOnRuumi = false;
                            break;
                        }
                        if (laud[x][y + i] != '.') {
                            kasOnRuumi = false;
                            break;
                        }
                    }
                    if (!kasOnRuumi) {
                        // Ei ole ruumi, jätka loopi.
                        continue;
                    }
                    for (int i = 0; i < laev; i++) {
                        laud[x][y + i] = 'O';
                    }
                    lisatud = true;
                } else {
                    // Otsib horisontaalset vaba ruumi.
                    boolean kasOnRuumi = true;
                    for (int i = 0; i < laev; i++) {
                        if (x + i >= laud.length) {
                            kasOnRuumi = false;
                            break;
                        }
                        if (laud[x + i][y] != '.') {
                            kasOnRuumi = false;
                            break;
                        }
                    }
                    if (!kasOnRuumi) {
                        // Ei ole ruumi, jätka loopi.
                        continue;
                    }
                    for (int i = 0; i < laev; i++) {
                        laud[x + i][y] = 'O';
                    }
                    lisatud = true;
                }
            }
        }
    }
}
