package work44;

public class Task44 {
    public static void main(String[] args) {
        int i = 1, j = 0;
        do {
            if ((i % 3 == 0) | (i % 4 == 0))  {
                j += 1;
                System.out.print(i + " ");
                if (j == 10) {
                    break;
                }
            }

        } while (++i < 301);
    }
}
