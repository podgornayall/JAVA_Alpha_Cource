package work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = scan.nextInt();
        if (x == 1) {
            System.out.println("Один");
        } else if (x == 2) {
            System.out.println("Два");
        } else if (x == 3) {
            System.out.println("Три");
        } else if (x == 4) {
            System.out.println("Четыре");
        } else if (x == 5) {
            System.out.println("Пять");
        } else {
            switch (x) {
                case 6:
                    System.out.println("Шесть");
                    break;
                case 7:
                    System.out.println("Семь");
                    break;
                case 8:
                    System.out.println("Восемь");
                    break;
                case 9:
                    System.out.println("Девять");
                    break;
                default:
                    System.out.println("Другое");
            }
        }
    }
}
