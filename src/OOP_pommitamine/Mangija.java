package OOP_pommitamine;

import java.util.Scanner;

/**
 * Created by Kaia on 21.11.2015.
 */
public class Mangija {
    private Scanner sc = new Scanner(System.in);

    public int[] kysiLasuKoordinaadid() {
        System.out.println("Kysi m2ngu koordinaadid formaadis xxx-yyy");
        String[] sisestus = sc.nextLine().split("-");
        int x = Integer.parseInt(sisestus[0]);
        int y = Integer.parseInt(sisestus[1]);
        return new int[]{x, y};

    }
    public void pihtas() {
        System.out.println("Pihtas!");
    }

    public void moodas() {
        System.out.println("M88das!");
    }

    public void gameover() {
        System.out.println("Game Over!");
    }
}
