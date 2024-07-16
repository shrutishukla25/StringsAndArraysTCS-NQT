public class Stringpalindrome {
    public boolean palindromeOrNot(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Stringpalindrome m = new Stringpalindrome();
        String s = "Aba";
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(m.palindromeOrNot(s));

    }
}
