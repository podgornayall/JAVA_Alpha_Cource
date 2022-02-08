package work45;

public class Task45 {
    public static void main(String[] args) {
        int i = 0, j = 1;
        do {
            System.out.print((i == 0) ? "*|" : i + "|");
            j = 1;
            do{
                System.out.printf("%3d", (i == 0) ? j : i * j);

            } while (j++ < 9);
            System.out.println();
            if (i == 0) {
                System.out.println("_____________________________");
            }
        } while (i++ < 9);
    }
}
