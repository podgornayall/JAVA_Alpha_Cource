package com.alfa.work51;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        System.out.println(str.substring(str.length()/2));
    }
}
