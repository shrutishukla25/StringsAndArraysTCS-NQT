//REMOVE CHARACTERS FROM A STRING EXCEPT ALPHABET
/*'' Keep on iterating the given string
If there is any lowercase or uppercase alphabet then add it to the resultant string
Don't include any other remaining characters (even whitespaces) into the resultant string.
Return the resultant string
 */
public class Xstring21 {
    public static String removeExceptAlphabet(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // s=s.replaceAll("[^a-zA-z]","");
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            }
        }
        if (sb.isEmpty()) {
            return "-1";
        } else {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String s = "$%^&*(((())))g";
        System.out.println(removeExceptAlphabet(s));
    }
}
