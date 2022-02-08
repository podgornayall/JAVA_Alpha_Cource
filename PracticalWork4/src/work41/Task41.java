package work41;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        int value1, value2, value3, maxValue;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение первой переменной: ");
        value1 = scan.nextInt();
        System.out.print("Введите значение второй переменной: ");
        value2 = scan.nextInt();
        System.out.print("Введите значение третьей переменной: ");
        value3 = scan.nextInt();
        maxValue = value1;
        if (value2 > maxValue) {
            maxValue = value2;
        }
        if (value3 > maxValue) {
            maxValue = value3;
        }
        System.out.println("max(" + value1 + "; " + value2 + "; " + value3 + ") = " + maxValue);
    }
}
