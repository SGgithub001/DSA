package String_Questions;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = scn.next();
        printAllString(s);
    }
    public static void printAllString(String s){
        int n = s.length();
        for(int startIndex = 0; startIndex < n; startIndex++){
            for(int endIndex = startIndex + 1; endIndex <= n; endIndex++){
                System.out.println(s.substring(startIndex,endIndex));
            }
        }
    }
}
