public class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
	
	BSTNode(int d) {
		data = d;
	}
	
	public void insert(int key) {
		if(key<data && left==null)
			left=new BSTNode(key);
		else if(key<data && left!=null)
			left.insert(key);
		else if(key>data && right==null)
			right=new BSTNode(key);
		else
			right.insert(key);
	}
	
	public boolean search(int key) {
		if(key==data)
			return true;
		else if(key<data && left!=null)
			return left.search(key);
		else if(key>data && right!=null)
			return right.search(key);
		else
			return false;
	}
	
	public void inorder() {
		if(left!=null)
			left.inorder();
		System.out.print(" "+data);
		if(right!=null)
			right.inorder();
	}
	
	public void preorder() {
		System.out.print(" "+data);
		if(left!=null)
			left.preorder();
		if(right!=null)
			right.preorder(); 
	}
	
	public void postorder() {
		if(left!=null)
			left.postorder();
		if(right!=null)
			right.postorder(); 
		System.out.print(" "+data);
	}
	
	public boolean isleaf() {
		if(left==null && right==null)
			return true;
		else
			return false;
	}
	
	public boolean hasOnlyLeft() {
		if(left!=null && right==null)
			return true;
		else 
			return false;
	}
	
	public boolean hasOnlyRight() {
		if(left==null && right!=null)
			return true;
		else
			return false;
	}
	
	public void delete(int key) {
		if(left!=null && left.data==key) {
			if(left.isleaf())
				left=null;
			else if(left.hasOnlyLeft())
				left=left.left;
			else if(left.hasOnlyRight())
				left=left.right;
			else {
				if(left.left.isleaf() || left.left.hasOnlyLeft()) {
					left.data=left.left.data;
					left.left=left.left.left;
				}
				else {
					BSTNode predPar = left.left;
					BSTNode pred = predPar.right;
					
					while(pred.right!=null) {
						predPar=pred;
						pred=pred.right;
					}
					
					left.data=pred.data;
					predPar.right=pred.left;
				}
			}
		}
		else if(right!=null && right.data==key) {
			if(right.isleaf())
				right=null;
			else if(right.hasOnlyRight())
				right=right.right;
			else if(right.hasOnlyLeft())
				right=right.left;
			else {
				if(right.right.isleaf() || right.right.hasOnlyLeft()) {
					right.data=right.left.data;
					right.left=right.left.left;
				}
				else {
					BSTNode predPar = right.left;
					BSTNode pred = predPar.right;
					
					while(pred.left!=null) {
						predPar=pred;
						pred=pred.right;
					}
					
					right.data=pred.data;
					predPar.right=pred.left;
				}
			}
		}
		else if(key<data && left!=null)
			left.delete(key);
		else if(key>data && right!=null)
			right.delete(key);
	}
	
	public int height() {
		if(isleaf())
			return 0;
		else if(hasOnlyLeft())
			return left.height()+1;
		else if(hasOnlyRight())
			return right.height()+1;
		else
			return (max(left.height(),right.height())+1);
	}	
	
	public int max(int a, int b) {
		if(a>=b)
			return a;
		else
			return b;
	}
		
}

