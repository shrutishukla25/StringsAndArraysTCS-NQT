//SUM OF ALL NUMBERS IN A STRING
//TC=O(n)
public class Xstring23 {
    public static void main(String[] args) {
        String s = "ab5c2d4ef12s";
        String tempsum = "0";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                tempsum += c;
            } else {
                sum += Integer.parseInt(tempsum);
                tempsum = "0";
            }
        }
        sum += Integer.parseInt(tempsum);
        System.out.println(sum);
    }
}
