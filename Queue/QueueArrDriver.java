class QueueArrDriver{
	public static void main(String[] args){
		QueueUsingArr q = new QueueUsingArr();
		q.isEmpty();
		q.enqueue(14);
		q.enqueue(27);
		q.enqueue(31);
		q.enqueue(19);
		q.dequeue();
	}
}
