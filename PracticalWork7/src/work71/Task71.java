package work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scan.nextInt();
        int[] myArray = createArray(size);
        System.out.print(Arrays.toString(myArray));
    }
    public static int[] createArray(int size) {
        int[] arrayNumbers = new int[size];
        int number = 2;
        for(int i = 0; i<size; i++) {
            arrayNumbers[i] = number;
            number += 2;
        }
        return arrayNumbers;
    }
}
