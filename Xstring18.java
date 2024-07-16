public class Xstring18 {
    // TC=O(n^2)
    // Sc=O(1)
    public static void allUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(s.charAt(i));

            }
        }

    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        allUniqChar(s);
    }
}
/*
 * String s = "aabccde";
 * int freq[] = new int[26];
 * for (int i = 0; i < s.length(); i++) {
 * freq[s.charAt(i) - 'a']++;
 * }
 * for (int i = 0; i < 26; i++) {
 * if (freq[i] == 1) {
 * int ascii = 'a' + i;
 * char c = (char) (int) ascii;
 * System.out.print(c + " ");
 * }
 * }
 */
