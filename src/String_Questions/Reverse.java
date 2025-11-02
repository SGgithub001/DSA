package String_Questions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = scn.next();
        reverseString(s);
    }
    public static void reverseString(String s){
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            ans = s.charAt(i) + ans;
        }
        System.out.println(ans);
    }
}
