
//CHECK IF two STRINGS ARE ANAGRAM Of each other
import java.util.*;

public class Xstring17 {
    public static void main(String[] args) {
        String s1 = "honor";
        String s2 = "rnoh";
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("are anagrams");
        } else {
            System.out.println("are not");
        }
    }
}
/*
 * class Solution
 * {
 * //Function is to check whether two strings are anagram of each other or not.
 * public static boolean isAnagram(String a,String b)
 * { if(a.length()!=b.length()){
 * return false;
 * }
 * HashMap<Character,Integer> map=new HashMap<>();
 * for(int i=0;i<a.length();i++){
 * map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
 * }
 * for(int i=0;i<b.length();i++){
 * if(map.containsKey(b.charAt(i))){
 * map.put(b.charAt(i),map.get(b.charAt(i))-1);
 * if(map.get(b.charAt(i))==0){
 * map.remove(b.charAt(i));
 * 
 * }
 * }else{
 * return false;
 * }
 * }
 * return true;
 * }
 * }
 */
/*
 * //Optimised
 * public class practice {
 * public static boolean checkAnagrams(String s1, String s2) {
 * if (s1.length() != s2.length()) {
 * return false;
 * }
 * int count[] = new int[26];
 * for (int i = 0; i < s1.length(); i++) {
 * count[s1.charAt(i) - 'a']++;
 * }
 * for (int i = 0; i < s2.length(); i++) {
 * count[s2.charAt(i) - 'a']--;
 * }
 * for (int i = 0; i < 26; i++) {
 * if (count[i] != 0) {
 * return false;
 * }
 * }
 * return true;
 * }
 * 
 * public static void main(String[] args) {
 * String s1 = "Integer";
 * String s2 = "gereint";
 * s1 = s1.toLowerCase();
 * s2 = s2.toLowerCase();
 * System.out.println(checkAnagrams(s1, s2));
 * }
 * }
 */