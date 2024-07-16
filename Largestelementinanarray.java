public class Largestelementinanarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = Math.max(arr[i], maximum);
            }
        }
        System.out.println(maximum);
    }
}
