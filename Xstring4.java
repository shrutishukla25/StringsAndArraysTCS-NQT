//COUNT NO OF VOWELS CONSONANTS AND SPACES IN STRING
public class Xstring4 {
    // To represent a single character or a space we use ' ';
    // To represent a string we use ""
    public static void main(String[] args) {
        String s = "India won the trophy";
        int consonants = 0, vowels = 0, spaces = 0;
        s = s.toLowerCase();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaces++;
            } else if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                consonants++;
            }
        }
        System.out.println(
                "No of vowels is " + vowels + " No of consonants is " + consonants + " No of spaces is " + spaces);

    }
}
