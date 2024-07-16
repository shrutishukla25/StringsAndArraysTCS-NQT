//FIND THE POSITION OF A SUBSTRING WITHIN A STRING
//TC=O(n) SC=O(1)
public class Xstring5 {
    public static void main(String[] args) {
        String s = "Hello World World";
        String pattern = "World";
        System.out.println(s.indexOf(pattern));// TC=O(N) indexOf() method
        System.out.println(s.lastIndexOf("World"));
        System.out.println(s.indexOf("az"));
    }
}
/*
 * //TC=O(n^2) SC=O(1)
 * public class practice {
 * public static int idxsubstringWithinString(String s, String pattern) {
 * for (int i = 0; i < s.length(); i++) {
 * int temp = i;
 * int j = 0;
 * for (j = 0; j < pattern.length(); j++) {
 * if (s.charAt(temp) != pattern.charAt(j)) {
 * break;
 * }
 * temp++;
 * }
 * if (j == pattern.length()) {
 * return i;
 * }
 * }
 * return -1;
 * 
 * }
 * 
 * public static void main(String[] args) {
 * String s = "Hello World";
 * String pattern = "World";
 * System.out.println(idxsubstringWithinString(s, pattern));
 * }
 * }
 * 
 */
