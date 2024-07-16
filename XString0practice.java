public class XString0practice {

    // trim and lastindexOf method use

    // 1- trim method removes all the whitespaces from the starting and ending of
    // string.
    public static void main(String args[]) {
        String s = "      She is a nice girl      ";

        /*
         * for example here if we print this string thr output will be
         * ----"     She is a nice girl           "
         */
        System.out.println(s);
        // And if we use trim method herein the output will be ----"She is a nice girl"
        System.out.println(s.trim());
        // lets run code and check!

        /*
         * 2- now next method is lastIndexOf searches the string and returns the index
         * of the last occurrence of the specified substring..
         */
        System.out.println(s.lastIndexOf("girl"));
        /* here the last occurence word girl made is at index 20 */

        // NEXT CONCEPT----
        String p = "A nicE lady amanda";
        System.out.println(p.substring(p.lastIndexOf(' ') + 1));
        // It will print last word amanda.
        System.out.println(p.substring(2, 6));
        // it will print nicE

    }

}
