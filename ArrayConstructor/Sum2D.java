package ArrayConstructor;

public class Sum2D {
    public static void main(String[] args) {
        int arr[][] = { { 2, 3, 5, 6 },
                { 4, 5, 8, 7, 0 },
                { 8, 9, 2 }

        };
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];

            }
        }
        System.out.println(sum);

    }

}
