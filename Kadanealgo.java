public class Kadanealgo {
    /*
     * Find the subarray with the largest sum, and return its sum.
     */
    public static void main(String[] args) {
        int arr[] = { 4, -2, -3, 4, -1, -2, 1, 5, -3 };
        int max_ending_here = 0;
        int start = 0, s = 0, end = 0;
        int maxsofar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];
            if (max_ending_here > maxsofar) {
                maxsofar = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("MAXIMUMSUM " + maxsofar + " from " + start + " to " + end);

    }
}
