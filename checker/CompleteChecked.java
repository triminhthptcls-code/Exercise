package checker;

import java.util.Arrays;

public class CompleteChecked {
    public static void main(String[] args) {
        method st1 = new method();
        boolean avar = st1.Checked(new int[] { 15, 14, 15, 1, 5, 34, 23, 35 }, 35);
        System.out.println(avar);
        int[] arr3 = st1.def(new int[] { 12, 24, 124, 24, 12, 124 }, 12);
        System.out.println(Arrays.toString(arr3));

    }

}
