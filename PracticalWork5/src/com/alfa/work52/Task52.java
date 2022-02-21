package com.alfa.work52;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        System.out.print("Введите фразу из трех слов: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String shortStr = String.valueOf(str.charAt(0)) +
                str.charAt(str.indexOf(' ') +1 ) +
                str.charAt(str.lastIndexOf(' ')+1);
        System.out.print(shortStr);
    }
}
