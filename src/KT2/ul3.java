package KT2;

import java.util.Arrays;

/**
 * Sportlast hindab n>2 kohtunikku. Eemalda madalaim ja kõrgeim hinne ning siis arvuta aritmeetiline keskmine.
 * Created by Kaia on 14.12.2015.
 */
public class ul3 {
    public static void main(String[] args) {
        System.out.println(result(new double[] {0., 2.0, 3., 1., 4.}));
        //System.out.println(result2(new double[] {5., 2., 0., 1., 4., 3.}));
    }

    /*private static double result2(double[] marks2) { //sorteerimine
        double[] temp2 = new double[marks2.length];
        for (int i = 0; i < marks2.length; i++) {
            temp2[i] = marks2 [i];
        }
        boolean sorted = true;
        double temp;
        while (sorted){
            sorted = false;
            for (int i = 0; i < temp2.length-1; i++) {
                if (temp2[i] > temp2 [i+1]){
                    temp = temp2[i];
                    temp2[i] = temp2 [i + 1];
                    temp2 [i + 1] = temp;
                    sorted = true;
                }

            }
        }
        return temp;
    }*/

    public static double result(double[] marks) {
        double[] temp = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            temp[i] = marks [i];
        }
        Arrays.sort(temp);
        double sum = 0;
        double vastus = 0;
        for (int i = 0; i < temp.length-1; i++) {
            sum += temp[i];
        }
        vastus = sum/(temp.length-2);
        return vastus; //keskmine hinne
    }
}
