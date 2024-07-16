import java.util.*;

/*//Brute force
 * Time complexity :  O(n*n) + O(n) 
 * -> O(n*n) for updating boolean array
 * -> O(n) for the printing of non-duplicates

Space complexity: O(n)
-> O(n) marking array 
 */
public class removeduplicatesfromUnsortedarray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 9, 3, 1, 3, 9 };
        int mark[] = new int[arr.length];
        Arrays.fill(mark, -1);
        for (int i = 0; i < arr.length; i++) {
            if (mark[i] != 0) {
                mark[i] = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        mark[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (mark[i] == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
/*
 * //Optimised
 * //Time Complexity =O(n) + O(n) = O(2n)
 * Reason:Iteration in array , searching hash table
 * // space complexity=O(n)
 * 
 * 
 * 
 * public static void main(String[] args) {
 * int arr[] = { 2, 3, 1, 9, 3, 1, 3, 9 };
 * HashMap<Integer, Integer> map = new HashMap<>();
 * for (int a : arr) {
 * if (!map.containsKey(a)) {
 * System.out.print(a + " ");
 * map.put(a, 1);
 * }
 * }
 * }
 */