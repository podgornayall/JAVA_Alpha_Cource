package work74;

import java.util.Arrays;
import java.util.Scanner;

public class Task74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int size = scan.nextInt();
        int[][] myMatrix = createMatrix(size);
        printMatrix(myMatrix);
        System.out.println("Транспонированная матрица:");
        transpositionMatrix(myMatrix);
        printMatrix(myMatrix);
    }
    public static void transpositionMatrix(int[][] matrix) {
        int value;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                value = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = value;
            }
        }

    }
    public  static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        int number = 1 ;
        for (int i = 0; i < size; i++){
            for (int j = 0; j <size; j++) {
                matrix[i][j] = (int)(Math.random() * 50);;
            }
        }
        return  matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] val: matrix
        ) {
            System.out.println(Arrays.toString(val));
        }
    }
}
