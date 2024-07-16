public class SymmetricPairs {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 8, 6 }, { 2, 1 }, { 3, 2 }, { 4, 9 }, { 2, 3 } };
        int n = 6;// Num of rows
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][0] == arr[j][1] && arr[j][0] == arr[i][1]) {
                    System.out.println(arr[i][0] + " " + arr[i][1]);
                    break;
                }
            }
        }
    }
}
