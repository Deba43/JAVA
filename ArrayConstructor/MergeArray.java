package ArrayConstructor;

public class MergeArray {
    public static void main(String[] args) {
        int A[] = { 1, 3, 5, 7 };
        int B[] = { 2, 4, 6, 8 };
        int C[] = new int[A.length + B.length];

        System.out.println("Array before merging:");

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
            System.out.print(C[i] + " ");
        }

        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
            System.out.print(B[i] + " ");
        }
        System.out.println();
        selectionSort(C);
    }

    public static void selectionSort(int[] C) {
        for (int i = 0; i < C.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < C.length; j++) {
                if (C[j] < C[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = C[minIndex];
            C[minIndex] = C[i];
            C[i] = temp;
        }

        System.out.println("Array after sorting:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

    }

}
