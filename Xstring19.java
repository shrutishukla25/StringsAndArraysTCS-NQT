//IF PALINDROME OR NOT
// // O(N/2)

public class Xstring19 {
    static void isPalindrome(String s, int start, int end) {
        if (s.length() == 0 || s.length() == 1) {
            System.out.println("palindrome");
            return;
        }
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                System.out.println("Not palindrome");
                // if we dont return it will goto infinite loop
                return;
            }
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        String s = "abba";
        int start = 0;
        int end = s.length() - 1;
        isPalindrome(s, start, end);
    }
}
