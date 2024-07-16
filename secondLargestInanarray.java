import java.util.HashSet;
import java.util.Set;

//TC=O(N)'//SC=O(N)'
public class secondLargestInanarray {
    public static void secondlargest(int arr[]) {
        if (arr.length < 2) {
            // Less than 2 here will cover both conditions for null array and array with
            // only 1 element
            System.out.println("Array has less than 2 elements its an Invalid Input");
            return;
        }
        Set<Integer> hs = new HashSet<>();
        for (int a : arr) {
            hs.add(a);
        }
        if (hs.size() == 1) {
            System.out.println("No such element");
            // In case of 99999
            return;
        }
        int largest = Integer.MIN_VALUE;
        // -2147483648 Smallest negative Integer
        // -1 is biggest negative integer
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("Second Largest is " + second_largest);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 6, 7, 9, 8, 0 };
        secondlargest(arr);

    }
}
/*
 * // TC=O(2n) SC=O(1)
 * public static void secondlargest(int arr[]) {
 * if (arr.length < 2) {
 * System.out.println("Array has less than 2 elements");
 * return;
 * }
 * int largest = Integer.MIN_VALUE;
 * int second_largest = Integer.MIN_VALUE;
 * for (int a : arr) {
 * largest = Math.max(largest, a);
 * }
 * for (int a : arr) {
 * if (a != largest) {
 * second_largest = Math.max(a, second_largest);
 * }
 * }
 * if (second_largest == Integer.MIN_VALUE) {
 * System.out.println("No such element");
 * } else {
 * System.out.println("Second Largest Element present here is " +
 * second_largest);
 * }
 * }
 * 
 */
/*
 * OPTIMISED APPROACH //TC=O(N) SC=O(1)
 * public static void secondlargest(int arr[]) {
 * if (arr.length < 2) {
 * System.out.println("Array has less than 2 elements");
 * return;
 * }
 * int largest = Integer.MIN_VALUE;
 * int second_largest = Integer.MIN_VALUE;
 * for (int a : arr) {
 * if (a > largest) {
 * second_largest = largest;
 * largest = a;
 * } else if (a > second_largest && a != largest) {
 * second_largest = a;
 * }
 * }
 * if (second_largest == Integer.MIN_VALUE) {
 * System.out.println("No such element");
 * } else {
 * System.out.println("Second Largest Element present here is " +
 * second_largest);
 * }
 * }
 */
