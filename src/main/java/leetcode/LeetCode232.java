package leetcode;

import java.util.Stack;

/**
 * @ClassName LeetCode232
 * @Description LeetCode232
 * @Author xiaohuang
 * @Date 5/9/2023 10:50 AM
 * @Version 1.0
 */
class MyQueue {
    public Stack<Integer> stk1 = new Stack<>();
    public Stack<Integer> stk2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        while(!stk1.isEmpty())
        {
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        while(!stk2.isEmpty())
        {
            stk1.push(stk2.pop());
        }
    }

    public int pop() {
        if(!stk1.isEmpty())
        {
            return stk1.pop();
        }
        return -1;
    }

    public int peek() {
        if(!stk1.isEmpty())
        {
            return stk1.peek();
        }
        return -1;
    }

    public boolean empty() {
        return stk1.isEmpty();
    }
}

public class LeetCode232 {

}
