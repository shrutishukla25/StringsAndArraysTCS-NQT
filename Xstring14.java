
//PRINT ALL DUPLICATES IN THE INPUT STRING
import java.util.Arrays;

//BRUTE FORCE
public class Xstring14 {
    // TC=nearly O(n^2) for solving
    // SC=O(n)
    public static void main(String[] args) {
        String str = "abbcdeddl";
        int count;
        int freq[] = new int[str.length()];
        Arrays.fill(freq, -1);
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    freq[j] = 0;
                    count++;
                }
            }
            if (freq[i] != 0) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[i] > 1) {
                System.out.println(str.charAt(i) + ", count = " + freq[i]);
            }
        }

    }
}
/*
 * /OPTIMISEd
 * //In case if string contains only lowercase letters
 * //STRIVERS CODE
 * //Time Complexity: O(n), we traverse each character in the string,
 * and accessing the array takes only constant time (n is the length of the
 * string).
 * Space Complexity: O(1), since the string has only characters from ‘a’ to ‘z’,
 * the maximum size of the array is 26.
 * 
 * class Solution {
 * public static void main(String[] args) {
 * String str = "sinstriiintng";
 * 
 * int[] counts = new int[26];
 * 
 * for (int i = 0; i < str.length(); i++)
 * counts[str.charAt(i) - 'a']++;
 * 
 * for (int i = 0; i < 26; i++)
 * if (counts[i] > 1)
 * System.out.println((char)(i + 'a') + " - " + counts[i]);
 * }
 * }
 */

/*
 * //BETTER
 * /*
 * public class practice {
 * public static void main(String[] args) {
 * String str = "abbbcdeddl";
 * HashMap<Character, Integer> map = new HashMap<Character, Integer>(26);
 * for (int i = 0; i < str.length(); i++) {
 * map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
 * }
 * for (Map.Entry<Character, Integer> e : map.entrySet()) {
 * if (e.getValue() > 1) {
 * System.out.println(e.getKey() + ", count = " + e.getValue());
 * }
 * }
 * }
 * }
 * /*
 * Time Complexity: O(n log(n)), since accessing HashMap takes log(n)
 * time and we access the map for each character in the string (total of n
 * characters).
 * 
 * Space Complexity: O(1), since the string has only characters from ‘a’ to ‘z’,
 * the size of the HashMap doesn’t exceed 26, irrespective of how big the input
 * string is.
 */
