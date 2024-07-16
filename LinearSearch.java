public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 9 };
        int val = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
    }
}
