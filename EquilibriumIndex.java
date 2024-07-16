public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 2, 3, 4 };
        int sum = 0, leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (sum == leftsum) {
                System.out.println(i + " Is an equilibrium index");
                break;
            }
            leftsum += arr[i];
        }

    }
}
