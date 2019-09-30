public class QueueUsingArr{
	private int front,rear,size;
	private int Q[];
	
	QueueUsingArr(int s){
		front = rear = 0;
		size = s;
		int Q[] = new int[size];
	}
	QueueUsingArr(){
	}
	boolean isEmpty(){
		if(front == -1 && rear == -1){
			return true;
		}
		else{
			return false;
		}
	}	
	void enqueue(int key){
		if(rear == size-1){
			System.out.println("Queue is full");
		}
		else if(isEmpty()){
			front = rear = 0;
			Q[rear] = key;
		}
		else{
			rear = rear+1;
			Q[rear] = key;
		}
	}
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else if(front == rear){
			front = rear = -1;
		}
		else{
			front = front + 1;
		}
	}
}
			
		
	
