package com.axelblaze.dsa.Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> st;//= new Stack<>();
    Stack<Integer> min; // = new Stack<>();

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        st.push(val);

        if(!min.isEmpty()) {
            if(val <= min.peek()) {
                min.push(val);
                return;
            }
        }
        if(min.isEmpty())
            min.push(val);
    }

    public void pop() {
        if(!st.isEmpty()) {
            int val = st.pop();
            if(!min.isEmpty()) {
                if(val == min.peek()) {
                    min.pop();
                }
            }
        }

    }

    public int top() {
        if(!st.isEmpty())
            return st.peek();
        return -1;
    }

    public int getMin() {
        if(!min.isEmpty())
            return min.peek();
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
