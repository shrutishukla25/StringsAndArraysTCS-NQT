public class AddanElementtoanarray {
    // At start
    /*
     * public static void main(String[] args) {
     * int arr[] = { 1, 2, 3, 4 };
     * int value = 6;
     * int arr1[] = new int[arr.length + 1];
     * for (int i = 1, j = 0; i < arr1.length; i++, j++) {
     * arr1[i] = arr[j];
     * }
     * arr1[0] = value;
     * for (int a : arr1) {
     * System.out.print(a + " ");
     * }
     * }
     */
    // At last
    /*
     * public static void main(String[] args) {
     * int arr[] = { 1, 2, 3, 4 };
     * int value = 6;
     * int arr1[] = new int[arr.length + 1];
     * for (int i = 0; i < arr.length; i++) {
     * arr1[i] = arr[i];
     * }
     * arr1[arr.length] = value;
     * for (int a : arr1) {
     * System.out.print(a + " ");
     * }
     * 
     * }
     */

    // AT position
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 6, 7 };
        int pos = 5;
        int value = 9;
        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = value;
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
