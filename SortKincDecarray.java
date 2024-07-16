import java.util.*;

//First half is arranged in increasing order and other in decreasing order
public class SortKincDecarray {
    public static void main(String[] args) {
        int arr[] = { 8, 7, 1, 6, 5, 9 };
        // 1 5 6 9 8 7{would be the answer}
        // first half in ascending order and second half in descending order
        Arrays.sort(arr);
        // 1 5 6 7 8 9
        int start = arr.length / 2;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}