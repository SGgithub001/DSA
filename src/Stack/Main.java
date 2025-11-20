package Stack;

public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }
}
