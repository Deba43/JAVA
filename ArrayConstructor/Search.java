package ArrayConstructor;

public class Search {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 5, 9, 4, 1 };
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                System.out.println("The array found at index " + i);
        }

    }

}
