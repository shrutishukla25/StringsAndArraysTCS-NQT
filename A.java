import java.util.*;

public class A {
    public static void main(String args[]) {
        String s1 = "occurrence";
        String s2 = "car";
        StringBuilder sb = new StringBuilder("");
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>(26);
        for (int i = 0; i < s2.length(); i++) {
            if (!mp.containsKey(s2.charAt(i))) {
                mp.put(s2.charAt(i), 1);
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!mp.containsKey(s1.charAt(i))) {
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
}