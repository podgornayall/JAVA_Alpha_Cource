package com.alfa.work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        System.out.print("Введите фразу: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println();
        int i = 0, strLength = str.length();
        while ((i < strLength)) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.print(str.charAt(i));
                i++;
            }
        };
    }
}
