package String_Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String a = scn.next();
       boolean res = checkPalindrome(a);
        System.out.println(res);
    }
    public static boolean checkPalindrome(String a) {
        String s = a.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
