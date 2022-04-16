package ArrayList;

import java.util.Stack;

public class LStack {
    public static void main(String[] args) {
        Stack<String> s= new Stack();
        s.push("cat");
        s.push("Car");
        s.push("Lion");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}
