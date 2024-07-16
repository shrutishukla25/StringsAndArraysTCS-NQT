//import java.util.*;

public class practice {
    public static void main(String[] args) {
        String s = "*)(&%$)geks";

        for (int i = 0; i < s.length(); i++) {
            s = s.replaceAll("[^a-zA-z]", "");
            // s=s.replaceAll("[^a-zA-z]","");
        }
        System.out.println(s);
    }
}
