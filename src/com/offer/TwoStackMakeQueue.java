package com.offer;

import java.util.Stack;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author mzvast
 *
 */
public class TwoStackMakeQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
		if(stack2.size() == 0){
			while(stack1.size() !=0){
				int temp = stack1.pop();
				stack2.push(temp);
			}
		}
		return stack2.pop();    
    }
	public static void main(String[] args) {
		TwoStackMakeQueue t = new TwoStackMakeQueue();
		t.push(1);
		t.push(2);
		t.push(3);
		System.out.println(t.pop());
		System.out.println(t.pop());
		System.out.println(t.pop());
		t.push(4);
		System.out.println(t.pop());
	}

}
