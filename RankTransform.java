import java.util.Arrays;
import java.util.HashMap;

//SC=O(N+N)
// TC=O(N*logN)
//index in place of i
//if map does not contain then only push it
public class RankTransform {
    public static void main(String[] args) {
        int arr[] = { 100, 5, 70, 70, 2 };
        int newarr[] = Arrays.copyOfRange(arr, 0, arr.length);
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(newarr);
        int index = 1;
        for (int a : newarr) {
            if (!map.containsKey(a)) {
                map.put(a, index);
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = map.get(arr[i]);
        }
        System.out.println("After transforming an array to its rank");
        for (int a : newarr) {
            System.out.print(a + " ");
        }
    }
}
/*
 * import java.util.*;
 * 
 * //index in place of i
 * //if map does not contain then only push it
 * //O(N^2)
 * //O(N) SC for hashset instead of newarr just print
 * public class s {
 * 
 * public static void main(String[] args) {
 * int arr[] = { 20, 15, 26, 2, 98, 6 };
 * int newarr[] = new int[arr.length];
 * for (int i = 0; i < arr.length; i++) {
 * HashSet<Integer> hs = new HashSet<>();
 * for (int j = 0; j < arr.length; j++) {
 * if (arr[j] < arr[i]) {
 * hs.add(arr[j]);
 * }
 * }
 * newarr[i] = hs.size() + 1;
 * }
 * System.out.println("After transforming an array to its rank");
 * for (int a : newarr) {
 * System.out.print(a + " ");
 * }
 * }
 * }
 */