//WRITE A PROGRAM TO FIND A WORD IN A GIVEN STRING WHICH HAS THE HIGHEST NUMBER OF REPEATED LETTERS
/*
 * Time complexity: O(n^2)
Reason: Outer Loop is used to traverse the Left pointer. Updating frequency array,
 traversing right pointer, updating curr_maximumword are part of the inner loop.
Space complexity: O(1)
 */

class Xstring8 {
    static String HighestRepeatedLetters(String str) {
        int len = str.length();
        int maximumword = 0;
        int curr_maximumword = 0;
        String result = "";
        for (int left = 0; left < len;) {

            int right = left + 1;
            while (right < len && str.charAt(right) != ' ') {
                right++;
            }

            int frequency[] = new int[26];
            curr_maximumword = 0;

            for (int index = left; index < right; index++) {
                frequency[str.charAt(index) - 'a']++;
            }
            for (int index = 0; index < 26; index++) {
                if (frequency[index] > 1) {
                    curr_maximumword++;
                }
            }

            if (curr_maximumword > maximumword) {
                maximumword = curr_maximumword;
                result = "";
                for (int j = left; j < right; j++) {
                    result += str.charAt(j);
                }

            }

            left = right + 1;
        }

        if (result.equals("")) {
            return "-1";
        } else {

            System.out.print("Word with highest number of repeated letters : ");
            return result;
        }
    }

    public static void main(String args[]) {
        String str = "aaaaabbbb googleeey";
        str = str.toLowerCase();
        // String str = "shruti shukla"; // -1 will print in this case
        System.out.println(HighestRepeatedLetters(str));
    }
}
