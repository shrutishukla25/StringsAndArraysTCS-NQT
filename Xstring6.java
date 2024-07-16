
//CONCATENATE 1 STRING TO ANOTHER
public class Xstring6 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        // 1stway
        s1 = s1 + s2;
        System.out.println(s1);

        // 2nd way
        /*
         * The append() function is used to concatenate a string to another.
         * This function works on string objects itself.
         */
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);

        // 3rd way
        /*
         * In concat() function, a new string is made first which is a time-costly
         * operation.
         * Therefore we can use the append() function of StringBuilder Class, which
         * doesn’t make
         * a new array(internal implementation of string) rather expands the already
         * given array to save time.
         */
        s1 = s1.concat(s2);
        System.out.println(s1);
        s1 = s1.concat(s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1);

    }

}/*
  * public class Stringbuilders {
  * public static void main(String[] args) {
  * StringBuilder sb = new StringBuilder("Coco");
  * // String sb= Coco with type string builder
  * sb.setCharAt(0, 'P');
  * System.out.println(sb);
  * System.out.println(sb.insert(0, 'i'));
  * System.out.println(sb.delete(3, 4));
  * sb.append("l");
  * sb.append("l");
  * System.out.println(sb);
  * }
  * }
  */
