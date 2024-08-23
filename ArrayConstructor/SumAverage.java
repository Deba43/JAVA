package ArrayConstructor;

public class SumAverage {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 5, 9, 4, 1 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        double avg = sum / arr.length;
        System.out.println(avg);
    }

}
