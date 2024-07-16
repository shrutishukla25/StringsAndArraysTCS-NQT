//FIND THE Length of LARGEST WORD IN A STRING
//TC=O(n^2)
//This code ive done on my own 
//optimised one is from geeks
public class Xstring11 {
    public static void main(String[] args) {
        String s = "teams microsoft microsofty";
        int curr_count = 0;
        int maxcount = 0;
        for (int i = 0; i < s.length();) {
            curr_count = 0;
            int j = i + 1;
            while (j < s.length() && s.charAt(j) != ' ') {
                curr_count++;
                j++;
            }
            if (curr_count + 1 > maxcount) {
                maxcount = curr_count + 1;
            }
            i = j + 1;
        }
        System.out.println(maxcount);
    }
}
/*
 * //TC=O(N) SC=O(1)
 * public class s {
 * public static void main(String[] args) {
 * String s = "Microsoft teams microsofty";
 * int count = 0;
 * int maxcount = 0;
 * for (int i = 0; i < s.length(); i++) {
 * if (s.charAt(i) != ' ') {
 * count++;
 * } else {
 * maxcount = Math.max(count, maxcount);
 * count = 0;
 * }
 * }
 * maxcount = Math.max(count, maxcount);
 * /*
 * We do max one more time to consider
 * last word as there won't be any space after last word.
 */
// System.out.println(maxcount);
// }
// }
