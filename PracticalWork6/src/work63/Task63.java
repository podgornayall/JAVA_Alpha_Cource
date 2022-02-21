package work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите фразу: ");
        String str = scan.nextLine();
        System.out.print("Введите номер слова: ");
        int n = scan.nextInt();
        int wordCount=1, pos = 0, increase;
        while ((increase = str.substring(pos).indexOf(" ")) != -1) {
            pos += increase+1;
            wordCount++;
        }
        if (n < 1 || n > wordCount || str.length() == 0) {
            System.out.print("Ошибка в данных");
        } else {
            System.out.print(getFirstCharacterOfWord(str, n));
        }
    }
    public static char getFirstCharacterOfWord(String str, int numberWord) {
        int i = 1;
        while (i < numberWord && str.indexOf(" ") > 0) {
            str = str.substring(str.indexOf(" ")+1);
            i++;
        }
        return str.charAt(0);
    }
}
