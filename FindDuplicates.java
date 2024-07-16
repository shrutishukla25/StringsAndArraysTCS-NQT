import java.util.*;

/*
 * public class FindDuplicates {
 * public static void main(String[] args) {
 * int a[] = { 1, 2, 2, 2, 2, 3 };
 * HashSet<Integer> hs = new HashSet<>();
 * for (int i : a) {
 * if (hs.add(i) == false) {
 * System.out.print(i + " ");
 * }
 * }
 * 
 * }
 * }
 */
// It can ALSO be done USING MAP{LEETCODE}
// do using arraylist return empty list if any element is not found)
/*
 * public class FindDuplicates {
 * public static void main(String[] args) {
 * int arr[] = { 1, 2, 2, 2, 2, 3, 3, 4, 5, 5 };
 * HashMap<Integer, Integer> map = new HashMap<>();
 * for (int a : arr) {
 * map.put(a, map.getOrDefault(a, 0) + 1);
 * }
 * for (Map.Entry<Integer, Integer> e : map.entrySet()) {
 * if (e.getValue() > 1) {
 * System.out.print(e.getKey() + " ");
 * }
 * }
 * }
 * }
 */
//O(N^2){TC} 
//O(N) {SC}
public class FindDuplicates {
    public static ArrayList<Integer> findTheDuplicates(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        boolean ifPresent = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (al.contains(arr[i])) {
                        break;
                    } else {
                        al.add(arr[i]);
                        ifPresent = true;
                        break;
                    }
                }
            }
        }
        if (ifPresent == true) {
            return al;
        } else {
            al.add(-1);
            return al;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 5 };
        ArrayList<Integer> al = findTheDuplicates(arr);
        for (int a : al) {
            System.out.print(a + " ");
        }
    }
}