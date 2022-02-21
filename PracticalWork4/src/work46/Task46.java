package work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        int number, digit;
        int sumOf2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        number = scan.nextInt();
        if (number < 0) {
            number = -number;
        }
        do {
            digit = number % 10;
            sumOf2 += digit * digit;
            number /= 10;
            System.out.print(digit + "^2" + ((number == 0) ? " = " : " + "));

        } while (number > 0);
        System.out.println(sumOf2);

    }
}
