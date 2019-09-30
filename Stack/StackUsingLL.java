import java.io.*;
import java.util.*;
class StackUsingLL {
	
	private class Node{	
		int data;
		Node next;
	}
	Node top;
	
	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		else{
			return false;
		}
	}
	void push(int key){
		Node temp = new Node();
		temp.data = key;
		temp.next = top;
		top = temp;			
	}
	void pop(){
		if(isEmpty()){
			System.out.println("Stack underflow");
		}
		else{
			top = top.next;	
		}
	}
	void peakElement(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println(top.data);
		}
	}
}	
	

