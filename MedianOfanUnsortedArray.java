import java.util.*;

/*
 * Time Complexity to find median: O(N Log N)(cause we are sorting array first)
 */
public class MedianOfanUnsortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 7, 6, 5, 4, 1 };
        Arrays.sort(arr);
        // After sorting // 1 1 2 4 5 6 7 8
        if (arr.length % 2 != 0) {
            System.out.println(arr[arr.length / 2]);
        } else {
            System.out.println((double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2);
            // or System.out.println((arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0)
        }
    }
}
/*
 * public static double median(int arr[]) {
 * double result;
 * Arrays.sort(arr);
 * if (arr.length % 2 != 0) {
 * result = (double) (int) arr[arr.length / 2];
 * } else {
 * int a = arr[arr.length / 2];
 * int b = arr[arr.length / 2 - 1];
 * result = (a + b) / 2.0;
 * }
 * return result;
 * }
 * 
 * public static void main(String args[]) {
 * int arr[] = { 1, 2, 8, 7, 6, 5, 4 };
 * System.out.println(median(arr));
 * }
 */
