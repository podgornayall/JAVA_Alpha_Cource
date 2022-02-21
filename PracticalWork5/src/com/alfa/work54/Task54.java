package com.alfa.work54;

import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        System.out.print("Введите слово1: ");
        Scanner sc = new Scanner(System.in);
        String myStr1 = sc.nextLine();
        System.out.println();
        System.out.print("Введите слово2: ");
        String myStr2 = sc.nextLine();
        char ch;
        String str = "";
        int i = 0, str1Length = myStr1.length();
        while (i < str1Length) {
            ch = myStr1.charAt(i);
            if ((myStr2.indexOf(ch) == -1) & (str.indexOf(ch) == -1)) {
                str = str + String.valueOf(ch);
            }
            i++;
        }
        System.out.print(str);
    }
}
