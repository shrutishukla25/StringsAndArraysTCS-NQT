//Return maximum occuring charcter in a string
/*
 * Time Complexity: O(N) to iterate through an array of size N.

Space Complexity: O(1) because for any input string only a fixed-size array is being allocated.
 */

public class Xstring15 {
    public static void main(String[] args) {
        String line = "shrutishukla";

        int count[] = new int[256];
        int maxfreq = 0;
        char maxocc_char = 'a';
        for (int i = 0; i < line.length(); i++) {
            count[line.charAt(i)]++;
            if (count[line.charAt(i)] > maxfreq) {
                maxfreq = count[line.charAt(i)];
                maxocc_char = line.charAt(i);
            }
        }
        System.out.println(maxocc_char);

    }
}
/*
 * import java.util.*;
 * 
 * //TC=O(n)
 * //SC=O(n)
 * public class practice {
 * public static void main(String[] args) {
 * String s = "aainthekingssn";
 * int count = 0;
 * char max_char = 'a';
 * HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 * for (int i = 0; i < s.length(); i++) {
 * char c = s.charAt(i);
 * map.put(c, map.getOrDefault(c, 0) + 1);
 * 
 * if (map.get(c) > count) {
 * count = map.get(c);
 * max_char = c;
 * }
 * }
 * System.out.println("Maximum occuring character is " + max_char);
 * }
 * }
 * 
 */
