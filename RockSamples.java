import java.util.*;

public class RockSamples {
    // TIME COMPLEXITY=O(n*m)
    // SPACE COMPLEXITY=O(range.length)
    public static void main(String[] args) {
        int arr[] = { 345, 604, 321, 433, 704, 470, 808, 718, 517, 811 };
        int ranges[][] = { { 300, 380 }, { 400, 700 } };
        ArrayList<Integer> a = new ArrayList<>();
        // int l = 0, h = 0;
        for (int i = 0; i < ranges.length; i++) {
            int count = 0;
            int l = ranges[i][0];
            int h = ranges[i][1];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= l && arr[j] <= h) {
                    count += 1;
                }
            }
            a.add(count);

        }
        System.out.println(a);
    }
}
