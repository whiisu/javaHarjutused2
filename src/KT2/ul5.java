package KT2;

import java.util.Arrays;

/**
 * Created by Kaia on 9.01.2016.
 * m t‰isarvumaatriksi veerumaatriksinumbrite massiivi leidmiseks (massiivi j-ndas elemendiks on maatriksi j-nda veeru suurima elemendi v‰‰rtus)
 * m read vıivad olla eri v‰‰rtustega
 */
public class ul5 {
    public static void main(String[] args) {
        int[] res = veeruMaxid(new int[][]{{1,2,6}, {4,5,3}});
        System.out.println(Arrays.toString(res));
    }

    private static int[] veeruMaxid(int[][] m) {
        int pikim = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].length > pikim){
                pikim = m[i].length;
            }
        }
        int uusMassiiv[] = new int[pikim];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                uusMassiiv[j] = Math.max(m[i][j], uusMassiiv[j]);
            }
        }

        return uusMassiiv;
    }
}
