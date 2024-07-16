//Remove Duplicates from Sorted Array 

//import java.util.HashSet;
//DONE IN LEETCODE
//Yes, ArrayList is an ordered collection and it maintains the insertion order.
/*HashSet does not maintain the order of insertion,When elements get from the HashSet due to hashing the order they inserted is not maintained while retrieval
We can achieve the given task using LinkedHashSet.*/
// HashMap does not maintain the order of insertion,
/*A Stack and a Queue also maintain the order in constant time but you have to retrieve the data in the same order 
and it removes the item once you do.*/

//optimised
//TC=O(N) SC=O(1)
public class RemoveDuplicatesFromSortedARr {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        // Original array nums becomes={1,2,3,4,5,5}
        // so now the length is gonna be i+1 we will print till the length(i+1)
        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 3, 3, 4, 5 };
        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
/*
 * //Brute force
 * //TC=O((NlogN)+N)
 * //SC=O(N)
 * public class s {
 * public static int removeDuplicates(int[] nums) {
 * // USIng Linked HashSet
 * HashSet<Integer> hs = new LinkedHashSet<>();
 * for (int a : nums) {
 * hs.add(a);
 * }
 * int index = 0;
 * for (int a : hs) {
 * nums[index++] = a;
 * }
 * return index;
 * }
 * 
 * public static void main(String[] args) {
 * int nums[] = { 1, 2, 3, 3, 4, 5 };
 * int k = removeDuplicates(nums);
 * for (int i = 0; i < k; i++) {
 * System.out.print(nums[i] + " ");
 * }
 * }
 * }
 */