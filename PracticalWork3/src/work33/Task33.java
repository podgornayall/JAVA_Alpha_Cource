package work33;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        float price;
        int percentFall = 13;
        int percentGrowth = 7;
        System.out.print("Введите первоначальную стоимость шкафа на распродаже: ");
        Scanner scan = new Scanner(System.in);
        price = scan.nextFloat();
        price = (int) (price * (100 - percentFall));
        price /= 100;
        price = (int) (price * (100 + percentGrowth));
        price /= 100;
        System.out.println("Стоимость шкафа после переоценки: " + price);
    }
}
