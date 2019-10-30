import java.util.*;

public class BST {
	BSTNode root;
	
	public void insert(int key) {
		if(root==null)
			root=new BSTNode(key);
		else
			root.insert(key);
	}
	
	public boolean search(int key) {
		if(root==null)
			return false;
		else
			return root.search(key);
	}
	
	public void inorder() {
		if(root==null)
			return;
		else
			root.inorder();
	}
	
	public void preorder() {
		if(root==null)
			return;
		else
			root.preorder();
	}
	
	public void postorder() {
		if(root==null)
			return;
		else
			root.postorder();
	}
	
	public void levelorder() {
		ArrayDeque<BSTNode> deq = new ArrayDeque<BSTNode>();
		deq.addLast(root);
		
		while(!deq.isEmpty()) {
			BSTNode n=deq.removeFirst();
			System.out.print(n.data+" ");
			if(n.left!=null)
				deq.addLast(n.left);
			if(n.right!=null)
				deq.addLast(n.right);
		}
	}
	
	public void delete(int key) {
		if(root==null)
			return;
		else if(root.data!=key)
			root.delete(key);
		else {
			BSTNode dummy=new BSTNode(0);
			dummy.left=root;
			root=dummy;
			root.delete(key);
			root=root.left;
		}
	}
	
	public int height() {
		if(root==null)
			return 0;
		else
			return root.height();
	}
	
}

