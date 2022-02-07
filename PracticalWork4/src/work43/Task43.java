package work43;

public class Task43 {
    public static void main(String[] args) {
        int i = 0, j;
        while (++i <=8) {
            j = i;
            do {
                System.out.print(j + " ");

            } while (--j > 0);
            System.out.println();
        } ;
    }
}
