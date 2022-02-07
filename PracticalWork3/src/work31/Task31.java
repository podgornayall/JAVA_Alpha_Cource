package work31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        int kg;
        int g;
        float weightKg;
        final float lbG=0.4536F;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите вес в фунтах: ");
        float weightLb = scan.nextFloat();
        weightKg = weightLb * lbG;
        kg = (int) weightKg;
        g = (int) ((weightKg-kg) * 1000);
        System.out.println("Вес " + kg + "кг " + g + "г");
    }
}
