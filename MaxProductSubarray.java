public class MaxProductSubarray {
    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        int result = arr[0];
        // IN CASE THERE EXISTS ONLY ONE ELEMENT IN AN ARRAY THE RESULT IS GONNA RETURN
        // AS IT IS
        for (int i = 0; i < arr.length; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        System.out.println(result);
    }
}