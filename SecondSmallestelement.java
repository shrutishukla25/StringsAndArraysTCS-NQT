//TC=O(N) SC=O(1)
public class SecondSmallestelement {
    public static void returnsecsmall(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array has less than 2 elements");
            return;
        }
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int third_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                third_smallest = second_smallest;
                second_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < second_smallest && arr[i] != smallest) {
                third_smallest = second_smallest;
                second_smallest = arr[i];
            } else {
                if (arr[i] < third_smallest && arr[i] != second_smallest && arr[i] != smallest) {
                    third_smallest = arr[i];
                }
            }
        }
        if (third_smallest == Integer.MAX_VALUE) {
            System.out.println("NO such element found");
        } else {
            System.out.println("third smallest here is " + third_smallest);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 0 };
        returnsecsmall(arr);
    }
}
// SECOND AND THIRD SMALLEST ELEMENTS
/*
 * // TC=O(3n) SC=O(1)
 * public static void secondsmallest(int arr[]) {
 * if (arr.length < 2) {
 * System.out.println("Array has less than 2 elements");
 * return;
 * }
 * int smallest = Integer.MAX_VALUE;
 * int second_smallest = Integer.MAX_VALUE;
 * for (int i = 0; i < arr.length; i++) {
 * smallest = Math.min(smallest, arr[i]);
 * }
 * for (int a : arr) {
 * if (a != smallest) {
 * second_smallest = Math.min(a, second_smallest);
 * }
 * }
 * int third_smallest = Integer.MAX_VALUE;
 * for (int a : arr) {
 * if (a != second_smallest && a != smallest) {
 * third_smallest = Math.min(a, third_smallest);
 * }
 * }
 * if (third_smallest == Integer.MAX_VALUE) {
 * System.out.println("NO such element found");
 * } else {
 * System.out.println("Third smallest here is " + third_smallest);
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int array[] = { 1, 2, 3, 1, 1 };
 * secondsmallest(array);
 * }
 * }
 */