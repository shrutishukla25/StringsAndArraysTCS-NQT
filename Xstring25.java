
//CALCULATE FREQUENCY OF CHARACTERS IN STRING
import java.util.*;

public class Xstring25 {
    public static void main(String args[]) {
        String s = "language";
        int freq[] = new int[s.length()];
        Arrays.fill(freq, -1);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count = count + 1;
                    freq[j] = 0;
                }
            }
            if (freq[i] != 0) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[i] != 0) {
                System.out.println(s.charAt(i) + " " + freq[i]);
            }
        }
    }
}
