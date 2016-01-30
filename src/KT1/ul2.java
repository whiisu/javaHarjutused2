package KT1;

/**
 * Created by Kaia on 6.12.2015.
 * Koostage Java-meetod, mis teeb kindlaks, kas etteantud täisarv n kuulub lõiku 1 kuni 100 (otspunktid kaasa arvatud).
 Write a method in Java to check whether a given integer n belongs to the closed interval from 1 to 100.
 public static boolean kuulub_1_100 (int n)
 */
public class ul2 {
    //public class Answer {

        public static boolean main(String[] args) {
            int n = 50;
            boolean vastus = kuulub_1_100(n);
            return vastus;
            //System.out.println (vastus);
            // YOUR TESTS HERE
        }

        public static boolean kuulub_1_100 (int n) {
            boolean kuulub_1_100 = (n >= 1 && n <= 100);
            return kuulub_1_100;  // TODO!!! YOUR PROGRAM HERE
        }

    //}
}
