package Stack;
import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> list;
    public MyStack(){
        list = new ArrayList<Integer>();
    }
    public int top(){
        return list.get(list.size() - 1);
    }
    public void push(int a){
        list.add(a);
    }
    public boolean isEmpty(){
        return list.size() == 0;
    }
    public boolean pop(){
        if(isEmpty()){
            return false;
        }
        list.remove(list.size() - 1);
        return true;
    }
    public int size(){
        return list.size();
    }
}

