
// PROGRAM TO SORT CHARACTERS IN A STRING
/* import java.util.*;
* public class Xstring10 {
* // Time Complexity: O(n * log n)
* // Space Complexity: O(n) in Java (because of character array)
* public static void main(String[] args) {
* String s = "zyxwvuts";
* char a[] = s.toCharArray();
* Arrays.sort(a);
* for (int i = 0; i < a.length; i++) {
* System.out.print(a[i] + " ");
* }
* }
* }
*/
public class Xstring10 {
    // TC=O(n^2)
    // SC=O(n)
    public static void main(String[] args) {
        String s = "zyxwvuts";
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int ascii = a[i];
            for (int j = i + 1; j < a.length; j++) {
                int ascii2 = a[j];
                if (ascii > ascii2) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (char p : a) {
            System.out.print(p);
        }
    }
}