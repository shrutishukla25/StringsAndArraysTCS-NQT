import java.util.*;

//index in place of i
//if map does not contain then only push it
//O(N^2)
//O(N) SC for hashset instead of newarr just print
public class s {

    public static void main(String[] args) {
        int arr[] = { 20, 15, 26, 2, 98, 6 };
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    hs.add(arr[j]);
                }
            }
            newarr[i] = hs.size() + 1;
        }
        System.out.println("After transforming an array to its rank");
        for (int a : newarr) {
            System.out.print(a + " ");
        }
    }
}