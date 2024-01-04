package com.axelblaze.dsa.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int[] right = new int[heights.length];
        int[] left = new int[heights.length];
        int area = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            if(st.isEmpty())
                right[i] = heights.length;
            else
                right[i] = st.peek();
            st.push(i);
        }

        Stack<Integer> st1 = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!st1.isEmpty() && heights[st1.peek()]>=heights[i])
                st1.pop();
            if(st1.isEmpty())
                left[i] = -1;
            else
                left[i] = st1.peek();
            st1.push(i);
        }
        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = right[i]-left[i]-1;
            area = Math.max(area, (height*width));
        }
        return area;
    }
}
