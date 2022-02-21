package work65;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("height: ");
        int height = scan.nextInt();
        printPyramid(height);
    }
    public  static void printPyramid(int  height) {
        int i = 1, j;
        String str1 = new String(), str2 = new String();
        while (i <= height) {
            j = 1;
            str1 = new String("         ").substring(0,height-i);
            str2 = "";
            while (j < i) {
                str1 =str1 + String.valueOf(j);
                str2 = String.valueOf(j) + str2;
                j++;
            }
            System.out.println(str1 + String.valueOf(i) + str2);
            i++;
        }
    }
}
