package work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        System.out.print(convertDecimalToBinary(number));

    }
    public static String convertDecimalToBinary(int  number) {
        String str = new String();
        while (number != 0) {
            str = String.valueOf(number%2) + str;
            number /= 2;
        }
        return str;
    }
}
