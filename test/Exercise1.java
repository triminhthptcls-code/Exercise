package test;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] st1 = { 1898, 3638, 29910, 82927, 8292838, 33334 };
        String[] st2 = { "Mouse", "Mice", "Casio", "Omega", "Dracula" };

        Arrays.sort(st1);
        Arrays.sort(st2);

        System.out.println(Arrays.toString(st1));
        System.out.println(Arrays.toString(st2));
        double sum = 0;
        for (int i = 0; i < st1.length; i++) {
            sum += st1[i];
        }
        System.out.println(sum);
        double avarage = sum / st1.length;
        System.out.println(avarage);
        // for (int i : st1) {
        // sum = sum + i;

        // }
        // System.out.println(sum);
    }

}
