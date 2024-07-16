import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        // In binary Search array must be sorted
        int arr[] = { 2, 2, 4, 3, 59, 8, 67, 7 };
        int search = 59;
        Arrays.sort(arr);
        // 2,2,3,4,7,8,59,67
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] == search) {
                System.out.println("Item found at " + mid);
                break;
            }
            if (arr[mid] > search) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Element not found");
        }
    }
}
