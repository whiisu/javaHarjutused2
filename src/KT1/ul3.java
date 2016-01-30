package KT1;

import java.util.stream.IntStream;

/**
 * Created by Kaia on 6.12.2015.
 * Koostage Java-meetod, mis leiab etteantud massiivi m positiivsete elementide summa.
 Write a method in Java to find the sum of positive elements of a given array m.
 public static int posSumma (int[] m)
 */
public class ul3 {


    //public class Answer {

        public static int main(String[] args) {
            int[] m = {5, 8, 4, 0, 27};
            int vastus = posSumma(m);
            return vastus;
            //System.out.println (vastus);
            // YOUR TESTS HERE
        }

        public static int posSumma (int[] m) {
            int posSumma = IntStream.of(m).sum();
            return posSumma;

        }

   // }


}
