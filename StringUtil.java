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

    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println(reverse(s1));
        System.out.println(explode(s1));
        System.out.println(sortString(s1));


    }
}