package leetcode;

import java.util.Stack;

/**
 * @ClassName LeetCode150
 * @Description LeetCode150
 * @Author xiaohuang
 * @Date 5/9/2023 3:57 PM
 * @Version 1.0
 */
public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numS = new Stack<>();
        for(String t:tokens){
            if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")){
                int b=numS.pop();
                int a=numS.pop();
                numS.push(call(a,b,t));
            }
            else{
                numS.push(Integer.parseInt(t));
            }
        }
        return numS.pop();

    }

    private int call(int a,int b,String c){
        if(c.equals("+")){
            return a + b;
        }else if(c.equals("-")){
            return a - b;
        }else if(c.equals("*")){
            return a * b;
        }else{
            return a / b;
        }
    }
}
