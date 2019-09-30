class StackArrDriver{
	public static void main(String[] args){
		StackUsingArray st = new StackUsingArray();
		st.isEmpty();
		st.push(14);
		st.push(25);
		st.push(18);
		st.push(40);
		st.pop();
		st.pop();
		st.peakElement();
	}
}
