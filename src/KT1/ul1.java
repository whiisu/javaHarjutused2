package KT1;

/**
 * Created by Kaia on 6.12.2015.
 * Koostage Java-meetod, mis leiab kahe etteantud reaalarvu summa kuubi.
 Write a method in Java to find the cube of the sum of two given real numbers.
 public static double summaKuup (double a, double b)
 */
public class ul1 {
    //public class Answer {

        public static double main(String[] args) {
            double a = 5;
            double b = -5;
            double vastus = summaKuup(a, b);
            return vastus;
        }

        public static double summaKuup (double a, double b) {
            double summa = a + b;
            double summaKuup = summa*summa*summa;
            return summaKuup;
        }

    //}
}
