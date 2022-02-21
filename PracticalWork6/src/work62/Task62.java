package work62;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int digit = scan.nextInt();
        System.out.print(latestDigit(digit));
    }
    public  static String latestDigit(int number) {
        number = Math.abs(number);
        if (number < 10) {
            return  "Ошибка в данных";
        } else {
            int n =  number % 100;
            return new StringBuilder(String.valueOf(n)).reverse().toString();
        }
    }
}
