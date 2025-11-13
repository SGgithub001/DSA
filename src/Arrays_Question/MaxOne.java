package Arrays_Question;

import java.util.Scanner;

public class MaxOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (0s and 1s): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);

        scn.close();
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(max,count);
    }
}
