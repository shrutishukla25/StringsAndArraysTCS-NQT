public class arrayrotation {
    // REVERSE REVERSE REVERSE
    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // LEFT ROTATE AN ARRAY BY D POSITIONS
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;
        System.out.println("ARRAY BEFORE ROTATION");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println("ARRAY AFTER ROTATION");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * public class A {
 * // TC=O(N)
 * public static void main(String args[]) {
 * int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
 * int d = 3;
 * int newarr[] = new int[arr.length];
 * // rotate by 3 positions
 * int j = 0;
 * int i = 0;
 * for (i = d, j = 0; i < arr.length; i++, j++) {
 * newarr[j] = arr[i];
 * }
 * System.out.println(j);
 * for (i = 0; i < d; i++) {
 * newarr[j] = arr[i];
 * j++;
 * }
 * for (int a : newarr) {
 * System.out.print(a + " ");
 * }
 * }
 * }
 */