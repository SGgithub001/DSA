package String_Questions;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words));
    }
    public static String longestCommonPrefix(String[] s) {
        if (s == null || s.length == 0) {
            return "";
        }
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length - 1];
        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
}
