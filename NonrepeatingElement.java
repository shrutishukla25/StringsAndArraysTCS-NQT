public class NonrepeatingElement {
    // Only non repeating element from the array where all other elements repeats
    // only twice
    /*
     * XOR WORKING if input bits are the same, then the output will be false(0) else
     * true(1).
     */
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
        // USING XOR OPERATOR
        int a = 1;
        for (int i = 1; i < arr.length; i++) {
            a ^= arr[i];
        }
        System.out.println(a);
        // ALSO BE DONE USING HASHMAP
    }
}
// if array is like int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 5 };
// USE HASHMAP INSTEAD
/*
 * Only non repeating element from the array where all other elements repeats
 * more than twice
 * /*
 * public static void main(String[] args) {
 * int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 5 };
 * HashMap<Integer, Integer> map = new HashMap<>();
 * for (int a : arr) {
 * map.put(a, map.getOrDefault(a, 0) + 1);
 * }
 * for (Map.Entry<Integer, Integer> e : map.entrySet()) {
 * if (e.getValue() == 1) {
 * System.out.println(e.getKey() +
 * " is the only non repeating element present");
 * }
 * }
 * }
 */