//Remove characters from the first string which are present in the second string
//DONE BY ME 100% CORRECT
//TC=O(m*n)
//SC=O(m)
public class Xstring13 {
    static String removeChars(String string1, String string2) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < string1.length(); i++) {
            int temp = 0;
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                sb.append(string1.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String string1 = "occurrence";
        String string2 = "car";
        System.out.println(
                "After removing characters from the first string which are present in the second string resulted string would be "
                        + "\n" + removeChars(string1, string2));
    }
}
// STRIVERS CODE
/*
 * import java.util.*;
 * 
 * //TC=O(n)
 * //Space Complexity: O(n) for HashMap in Java
 * public class s {
 * public static String removeChars(String string1, String string2) {
 * String result = "";
 * HashMap<Character, Integer> map = new HashMap<>();
 * for (int i = 0; i < string2.length(); i++) {
 * map.put(string2.charAt(i), map.getOrDefault(string2.charAt(i), 0) + 1);
 * }
 * /*
 * If the key is not present in the map, get() returns null.
 * The get() method returns the value almost instantly, even if the map contains
 * 100 million key/value pairs.
 */

/*
 * for (int i = 0; i < string1.length(); i++) {
 * if (map.get(string1.charAt(i)) == null) {
 * result += string1.charAt(i);
 * }
 * }
 * return result;
 * }
 * 
 * public static void main(String[] args) {
 * String string1 = "abcdef";
 * String string2 = "cefz";
 * System.out.println(
 * "After removing characters from the first string which are present in the second string resulted string would be "
 * + "\n" + removeChars(string1, string2));
 * }
 * }
 */