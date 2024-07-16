import java.util.*;

public class RECUSRIONPrintAllSubsequences {
    // A Contigous Non Contigous sequence which follows the order
    public static void function(int index, List<Integer> l, int arr[]) {
        if (index == arr.length) {
            System.out.println(l);
        } else {
            function(index + 1, l, arr);
            l.add(arr[index]);
            function(index + 1, l, arr);
            l.remove(l.size() - 1);

        }
        return;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2 };
        // Subsequences = Contigous Subsequences=3,1,2,{3 1},{1 2},{3 1 2} non
        // contigous= {3 2} and {} Total 8 Subsequences
        // 2 3, 2 1 etc can not be subsequences cause they doesnt follow the order
        int index = 0;
        List<Integer> l = new ArrayList<>();
        function(index, l, arr);
    }
}
