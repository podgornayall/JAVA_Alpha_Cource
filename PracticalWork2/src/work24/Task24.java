package work24;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int number=123, reverseNumber;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        number = scan.nextInt();
        reverseNumber=(number%10)*100+(number%100-number%10)+(number/100);
        System.out.println("number="+number+"; reverseNumber="+reverseNumber+"; "+number+" - "+reverseNumber+" = "+(number-reverseNumber));
    }
}
