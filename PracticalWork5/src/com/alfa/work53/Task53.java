package com.alfa.work53;

import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        System.out.print("Введите фразу из нескольких слов: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = str.substring(str.lastIndexOf(' ') + 1) +
                str.substring(str.indexOf(' '), str.lastIndexOf(' ') + 1) +
                str.substring(0,str.indexOf(' ') );
        System.out.print(newStr);
    }
}
