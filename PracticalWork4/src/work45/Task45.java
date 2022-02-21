package work45;

public class Task45 {
    public static void main(String[] args) {
        int i = 0, j ;
        do {
            j = 1;
            System.out.print((i == 0) ? "*|" : i + "|");
            do {
                System.out.printf("%3d", (i == 0) ? j : i*j);
            } while (++j <10);
            System.out.println();
            if (i == 0) {
                System.out.print("-|");
                System.out.println("---------------------------");

            }
        } while (++i < 10);
    }
}
