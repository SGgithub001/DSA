package Stack;

import java.util.Stack;

public class PreGreatestElement {
    public static void main(String[] args) {
        int[] nums = new int[]{
                3,9,4,0,2
        };
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = -1;
        }
        for(int i = nums.length - 1; i >= 0; i--){
            while(true){
                if(stack.isEmpty()){
                    stack.push(i);
                    break;
                }
                int idx = stack.peek();
                if(nums[i] > nums[idx]){
                    res[idx] = nums[i];
                    stack.pop();
                } else{
                    stack.push(i);
                    break;
                }
            }
        }
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
