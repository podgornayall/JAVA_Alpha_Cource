package work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        int[] arr;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку из символов от 1 до 9:");
        String str = scan.nextLine();
        arr=countOfSequenceNumbers(str);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] countOfSequenceNumbers(String numbers) {
        int[] arr = new int[9];
        int j;
        for(int i = 0; i < numbers.length(); i++) {
            j = numbers.charAt(i) - '0' - 1;
            arr[j]++;
          }
        return arr;
    }
}
