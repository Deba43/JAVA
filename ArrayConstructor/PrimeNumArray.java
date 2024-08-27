package ArrayConstructor;

public class PrimeNumArray {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 45, 35, 17, 87, 61 };
        int ans = prime(arr);
        System.out.println("Number of prime numbers in the array: " + ans);
    }

    static int prime(int arr[]) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
