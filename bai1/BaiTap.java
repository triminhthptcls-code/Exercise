package bai1;

public class BaiTap {
    public boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public void printMultiplicationTable(int n) {
        for (int i = 1; i < 11; i++) {
            int m = n * i;
            System.out.println(n + " x " + i + " = " + m);
        }
    }
}
