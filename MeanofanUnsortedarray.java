public class MeanofanUnsortedarray {
    /*
     * Mean of an array = (sum of all elements) / (number of elements)
     * Time Complexity to find mean: O(N)
     */
    public static void main(String[] args) {
        int arr[] = { 4, 6, 2, 1, 8, 0, 9, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        /*
         * Double :It provides a way to work with numbers that have a decimal point and
         * need a
         * high degree of precision
         */// we can also directly assign sum variable as a double
        System.out.println(((double) (int) (sum / arr.length)));

    }
}
/*
 * public static double mean(double sum, int n) {
 * double result = sum / n;
 * return result;
 * // If you divide an integer by a double the output will be always double.
 * // If you divide a double by an integer the output will be always double.
 * 
 * }
 * 
 * public static void main(String args[]) {
 * int arr[] = { 4, 6, 2, 1, 8, 0, 9, 3 };
 * double sum = 0;
 * for (int i = 0; i < arr.length; i++) {
 * sum += arr[i];
 * }
 * System.out.println(mean(sum, arr.length));
 * }
 */
