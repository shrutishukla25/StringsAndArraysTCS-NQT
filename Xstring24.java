//CAPITALIZE FIRST AND LAST CHARACTER OF EACH WORD 
//TC=O(N)
//SC=O(N)
public class Xstring24 {
    public static String capitalizeFirstAndLast(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 || i == s.length() - 1) {
                sb.setCharAt(i, Character.toUpperCase(c));
            } else if (c == ' ') {
                sb.setCharAt(i - 1, Character.toUpperCase(s.charAt(i - 1)));
                sb.setCharAt(i + 1, Character.toUpperCase(s.charAt(i + 1)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Thankyou universe for everything";
        System.out.println(capitalizeFirstAndLast(s));
    }
}
