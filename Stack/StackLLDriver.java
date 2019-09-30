class StackLLDriver{
	public static void main(String[] args){
		StackUsingLL st = new StackUsingLL();
		st.isEmpty();
		st.push(10);
		st.push(12);
		st.push(26);
		st.push(14);
		st.pop();
		st.peakElement();
	}
}
