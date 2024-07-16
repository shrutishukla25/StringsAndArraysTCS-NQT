//CHANGE EVERY LETTER WITH NEXT LEXICOGRAPHIC ALPHABET
//DONE BY ME
public class Xstring12 {
    public static void main(String[] args) {
        String s = "ABCDEFZC";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'z') {
                result += 'a';
            } else if (s.charAt(i) == 'Z') {
                result += 'A';
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) < 'z') ||
                    (s.charAt(i) >= 'A' && s.charAt(i) < 'Z')) {
                int ascii = s.charAt(i) + 1;
                char c = (char) (int) ascii;
                result += c;
            }
        }
        System.out.println(result);
    }
}
/*
 * STRIVERS CODE
 * public class s {
 * /*
 * Time Complexity: O(n)
 * Space Complexity: O(n), for StringBuffer
 */
/*
 * public static void main(String[] args) {
 * String s = "abcdefgzZ";
 * StringBuffer sb = new StringBuffer();
 * for (int i = 0; i < s.length(); i++) {
 * int ascii = (int) s.charAt(i);
 * if (ascii == 122) {
 * sb.append((char) 97);
 * } else if (ascii == 90) {
 * sb.append((char) 65);
 * } else if ((ascii >= 65 && ascii < 90)
 * || (ascii >= 97 && ascii < 122)) {
 * int val = ascii + 1;
 * sb.append((char) val);
 * }
 * }
 * System.out.println(sb.toString());
 * }
 * }
 */