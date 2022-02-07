package work32;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        float amount, income;
        int month;
        final int PERCENT = 12;
        System.out.print("Введите сумму депозита: ");
        Scanner scan = new Scanner(System.in);
        amount = scan.nextFloat();
        System.out.print("Введите число месяцев: ");
        month = scan.nextInt();
        income = (int) (amount * month * PERCENT / 12);
        income /= 100;
        System.out.println("Доход: " + income);
    }
}
