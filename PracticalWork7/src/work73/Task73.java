package work73;

import java.util.Arrays;
import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int size = scan.nextInt();
        int[][] myMatrix = createMatrix(size);
        printMatrix(myMatrix);
    }
    public  static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        int number = 1 ;
        for (int i = 0; i < size; i++){
            for (int j = 0; j <size; j++) {
                matrix[j][i] = number++;
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
