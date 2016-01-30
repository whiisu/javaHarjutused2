package KT1;

/**
 * Created by Kaia on 6.12.2015.
 * Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu, mis on rangelt
 * suuremad kõigi elementide aritmeetilisest keskmisest (aritmeetiline keskmine = summa / elementide_arv).
 Write a method in Java to find the number of elements strictly greater than arithmetic mean of all elements of a given
 array of real numbers d (arithmetic mean = sum_of_elements / number_of_elements).
 public static int keskmisestParemaid (double[] d)
 */
public class ul4 {

    //public class Answer {

        public static int main(String[] args) {
            double[] d = new double[]{2, 5, 78, 8.6};
            int vastus = keskmisestParemaid(d);
           return vastus;
            // YOUR TESTS HERE
        }

        public static int keskmisestParemaid (double[] d) {
            int kesmisestParemaid = 0;
            double summa;
            double keskmine;
            summa = 0;
            for (int i = 0; i < d. length ; i++) {
                summa = d[i] + summa;
            }
            keskmine = summa/d.length;
            for (int i = 0; i < d.length ; i++) {
                if (d[i] > keskmine){
                    kesmisestParemaid++;
                }
            }
            return kesmisestParemaid;  // YOUR PROGRAM HERE
        }

    //}


}
