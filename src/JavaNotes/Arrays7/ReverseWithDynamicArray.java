package JavaNotes.Arrays7;

import java.util.Scanner;

/**
 * Reads a list of non-zero numbers from the user, then prints
 * out the input numbers in the reverse of the order in which
 * the were entered.  There is no limit on the number of inputs.
 */
public class ReverseWithDynamicArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynamicArrayOfInt list;
        list = new DynamicArrayOfInt();
        System.out.println("Enter some non-zero integers.  Enter 0 to end.");
        while (true) {
            System.out.print("? ");
            int number = scanner.nextInt();
            if (number == 0)
                break;
            list.add(number);
        }
        System.out.println();
        System.out.println("Your numbers in reverse are:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("%10d%n", list.get(i));
        }
    }

}