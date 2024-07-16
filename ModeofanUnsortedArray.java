public class ModeofanUnsortedArray {
    // TC=O(n^2)
    public static void main(String[] args) {
        // Mode of an array:number that appears most frequently in the set
        int arr[] = { 1, 2, 2, 2, 34, 5, 5, 6 };
        // Mode=2;
        int maxappeared = 0;
        int maxnum = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxappeared) {
                maxappeared = count;
                maxnum = arr[i];
            }
        }
        System.out.println("Mode is " + maxnum);
    }
}
