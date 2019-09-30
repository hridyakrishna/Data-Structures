class StackUsingArray{
	int top;
	int a[] = new int[100];
	public boolean isEmpty(){
		if(top<0){
			return true;
		}
		else{
			return false;
		}
	}
	void push(int key){
		if(top >= 100){
			System.out.println("Stack Overfllow");
		}
		else{
			a[++top] = key;
		}
	}
	void pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
		}
		else{
			int key = a[top--];
		}
	}
	void peakElement(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
			int key = a[top];
			System.out.println(key);
		}
	}
}
			
			
