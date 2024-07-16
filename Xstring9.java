//COUNT NUMBER OF WORDS IN A GIVEN STRING 
//O(N) 
public class Xstring9 {
    public static int noOfWords(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String p[] = s.split("\\s+");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + ",");
        }
        System.out.println();
        return p.length;
        /*
         * To split a string by space, use \\s+ .
         * It will split the string by single or multiple whitespace characters such as
         * space, tab, etc
         */
    }

    public static void main(String[] args) {
        String s = "a\nhjpfo";
        // String s = "I am a girl";
        System.out.println("No of words present are " + noOfWords(s));
    }

}
// or we could just simply use
/*
 * //O(N) O(1)
 * public static int noOfWords(String s) {
 * if (s.equals("")) {
 * return 0;
 * }
 * 
 * for (int i = 0; i < s.length(); i++) {
 * if (s.charAt(i) == ' ') {
 * spaces++;
 * }
 * }
 * return spaces+1;
 * //Also covers case of 1 word
 * }
 * 
 * 
 */