package String_Questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = scn.next();
        String res = removeDuplicate(s);
        System.out.println("After removing duplicates : " + res);
    }
    public static String removeDuplicate(String s){
        StringBuilder ans = new StringBuilder();
        Set<Character> c = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!c.contains(ch)){
                ans.append(ch);
                c.add(ch);
            }
        }
        return ans.toString();
    }
}
