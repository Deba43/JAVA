package ArrayConstructor;

public class CountNonZero {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 5, 9, 4, 1 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }
        System.out.println(count);

    }

}
