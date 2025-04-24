package DSA.In.Java;

import java.util.Stack;

public class DSA_Stack {
    Stack<Integer> stack = new Stack<>();

    public Stack<Integer> getStack() {
        return stack;
    }

    public void setStack(Integer n) {
        this.stack.push(n);
    }

    public static void main(String[] args) {
        DSA_Stack s = new DSA_Stack();
        s.setStack(1);
        s.setStack(2);
        s.setStack(3);
        s.setStack(4);
        s.setStack(5);

        System.out.println(s.getStack().pop());
        System.out.println(s.getStack().peek());
        System.out.println(s.getStack().pop());
        System.out.println(s.getStack().pop());
        System.out.println(s.getStack().peek());
        //5 4 4 3 2

    }
}
