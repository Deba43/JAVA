package ArrayConstructor;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 8, 9 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

}
