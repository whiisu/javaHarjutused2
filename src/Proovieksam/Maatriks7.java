package Proovieksam;

/**
 * KerstiM, siksak
 */
public class Maatriks7 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            int m = i;
            while (m>18)
                m = m-18;

            if (m < 10) {
                for (int j = 0; j < 10; j++) {
                    if (j == m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            if (m > 9) {
                for (int j = 0; j < 10; j++) {
                    if (j == 18 - m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}
