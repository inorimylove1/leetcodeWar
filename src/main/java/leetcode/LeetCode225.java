package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LeetCode225
 * @Description LeetCode225
 * @Author xiaohuang
 * @Date 5/9/2023 3:03 PM
 * @Version 1.0
 */
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2= new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int pop = q1.remove();
        Queue<Integer> tmp = q1;
        q1=q2;
        q2=tmp;
        return pop;
    }

    public int top() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int pop = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> tmp = q1;
        q1=q2;
        q2=tmp;
        return pop;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
public class LeetCode225 {
}
