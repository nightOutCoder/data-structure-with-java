package Basics.Maths;

import java.util.Scanner;

/*
 * Input -> 468
 * Output -> 4 + 6 + 8 -> 18
*/
public class SumOfDigit {
    public static void main(String a[]) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }
            System.out.println(sum);
        }
    }
}
