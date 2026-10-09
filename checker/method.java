package checker;

public class method {
    public boolean Checked(int[] array, int items) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == items) {
                return true;
            }
        }

        return false;
    }

    public int[] def(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                count++;
            }
        }
        int[] arr2 = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; j++) {
            if (arr[i] != number) {
                arr2[j] = arr[i];
                j++;
            }

        }
        return arr2;
    }
}