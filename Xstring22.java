//remove brackets from an algrbraic expressions
public class Xstring22 {
    public static void main(String[] args) {
        String s = "(a-(b+c)+r)";
        for (int i = 0; i < s.length(); i++) {
            s = s.replaceAll("[()]", "");
        }
        System.out.println(s);
        /*
         * StringBuilder sb = new StringBuilder("");
         * for (int i = 0; i < s.length(); i++) {
         * char c = s.charAt(i);
         * if (c != '(' && c != ')') {
         * sb.append(c);
         * }
         * }
         */
        // System.out.println(sb.toString());
    }
}
