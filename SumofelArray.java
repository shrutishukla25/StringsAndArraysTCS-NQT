// TC =O(n)
// SC=O(1)
/*
 * public class SumofelArray {
 * public static void main(String[] args) {
 * int arr[] = { 1, 2, 3, 4 };
 * int sum = 0;
 * for (int i = 0; i < arr.length; i++) {
 * sum += arr[i];
 * }
 * System.out.println(sum);
 * }
 * }
 */
// Using recursion
//TC=O(n);
//SC=O(n)
public class SumofelArray {
    public static int sumusingrec(int i, int sum) {
        int arr[] = { 1, 2, 3, 4 };

        if (i == arr.length) {
            return sum;
        }
        if (i < arr.length) {
            sum += arr[i];
            return sumusingrec(i + 1, sum);
        }
        return 0;
    }

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.println(sumusingrec(i, sum));
    }
}