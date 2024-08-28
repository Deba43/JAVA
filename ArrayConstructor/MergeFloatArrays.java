package ArrayConstructor;

public class MergeFloatArrays {
    public static void main(String[] args) {

        float arr1[] = { 1.3f, 2.4f, 3.6f };
        float arr2[] = { 4.3f, 5.4f, 6.6f };

        float arr3[] = new float[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];

        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[j + arr1.length] = arr2[j];

        }
        System.out.print("Merged Array:");
        for (float value : arr3) {
            System.out.print(value + " ");
        }
    }

}
