import java.util.*;

/*
Time Complexity: O(M + N + N log N); O(M+N) for traversing over both the array for hashing & retrieval. O(N log N) for sorting the remaining array of A1[].
Auxiliary Space: O(N), Space for storing frequency of A1[] of size N.
 */
public class SortanArrayacctoAnother {
    public static void main(String[] args) {
        int arr1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 6, 8, 8 };
        int arr2[] = { 2, 1, 8, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr1) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int ans[] = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                for (int j = 0; j < map.get(arr2[i]); j++) {
                    ans[index++] = arr2[i];
                }
            }
            map.remove(arr2[i]);

        }
        int idx = index;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            for (int j = 0; j < e.getValue(); j++) {
                ans[index++] = e.getKey();
            }
        }
        Arrays.sort(ans, idx, arr1.length);
        // Last index exclusive
        System.out.println("Sorted array is ");
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
