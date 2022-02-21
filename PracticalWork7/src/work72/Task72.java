package work72;

import java.util.Arrays;

public class Task72 {
    public static void main(String[] args) {
//        int[] arrayNumber = {5, 8, 6, 9, 2, 9, 0, 15, 7};
        int[] arrayNumber={7,6,9,5,4,3};
        System.out.println(Arrays.toString(arrayNumber));
        int res = sumOddElementsArray(arrayNumber);
        System.out.print(res == -1 ? "С массивом что-то не то" : "сумма нечетных чисел = " + res);
    }
    public static int sumOddElementsArray(int[] array) {
        int res = 0;
        for (int val : array
             ) {
            if (val%2 == 1) {
                res += val;
            }
        }
        if (res == 0) {
            res = -1;
        };
        return res;
    }
}
