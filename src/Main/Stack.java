package Main;

import java.util.ArrayList;

/**
 * Created by Artur on 17.04.2015.
 */
public class Stack<T> {
    ArrayList<T> stack = null;
    public Stack(){
      stack = new ArrayList<T>();
    }
    public void push(T element){
        stack.add(element);
    }
    public T pop(){
        T temp;
        temp = stack.get(size()-1);
        stack.remove(size() - 1);
        return temp;
    }
    public int size(){
        return stack.size();
    }
}

