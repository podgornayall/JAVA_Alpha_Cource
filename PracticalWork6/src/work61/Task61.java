package work61;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        double a, b, c, s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину 1-й стороны треугольника: ");
        a = scan.nextDouble();
        System.out.print("Введите длину 2-й стороны треугольника: ");
        b = scan.nextDouble();
        System.out.print("Введите длину 3-й стороны треугольника: ");
        c = scan.nextDouble();
        s = areaTriangle(a, b, c);
        System.out.print((s < 0) ? "Ошибка в данных" : "S = " + s);
    }

    public static double areaTriangle(double a, double b, double c) {
        double square, p;
        if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
            square = -1;
        } else {
            p = (a + b + c) / 2;
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return square;
    }
}


