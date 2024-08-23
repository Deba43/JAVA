package ArrayConstructor;

public class Range {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 54, 43, 78 };

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int range = max - min;
        System.out.println("The range of array is " + range);
    }

}
