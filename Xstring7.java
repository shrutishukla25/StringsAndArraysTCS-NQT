//CHANGE CASE OF EACH CHARACTER IN STRING
//TC=O(N)
public class Xstring7 {
    public static void main(String[] args) {
        String s = "JavaScript";
        String x = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                x += Character.toLowerCase(ch);
            } else {
                x += Character.toUpperCase(ch);
            }
        }
        System.out.println(x);

    }
}
/*
 * //TC=O(N)
 * public class practice {
 * public static void main(String[] args) {
 * String s = "Java Script";
 * StringBuilder sb = new StringBuilder("");
 * for (int i = 0; i < s.length(); i++) {
 * char c = s.charAt(i);
 * int ascii = (int) (char) c;
 * if (ascii >= 97 && ascii <= 122) {
 * sb.append(Character.toUpperCase(c));
 * } else if (ascii >= 65 && ascii <= 90) {
 * sb.append(Character.toLowerCase(c));
 * } else if (c == ' ') {
 * sb.append(c);
 * }
 * }
 * System.out.println(sb.toString());
 * }
 * }
 */