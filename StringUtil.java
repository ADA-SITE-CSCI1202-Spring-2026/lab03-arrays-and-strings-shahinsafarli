package Java.week05;

import java.util.Arrays;

public class StringUtil {

    public static String reverse(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();

    }

    public static String explode(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.subSequence(0, i+1));
        }
        
        return sb.toString();
    }

    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        else {

            char [] arr1 = s1.toCharArray();
            char [] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }
    }

    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println(reverse(s1));
        System.out.println(explode(s1));
        System.out.println(sortString(s1));
        System.out.println(isAnagram("map", "pam"));


    }
}