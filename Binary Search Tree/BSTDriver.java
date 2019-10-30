public class BSTDriver {
	public static void main(String[] args) {
		BST b = new BST();
		b.insert(50);
        b.insert(20);
		b.insert(80);
        b.insert(10);
        b.insert(30);
        b.insert(5);
		b.insert(15);
		b.insert(25);
        b.insert(35);
        b.insert(70);
        b.insert(90);
        b.insert(65);
        b.insert(75);
        b.insert(85);
        b.insert(95);
        
        System.out.println(b.search(30));
        System.out.println(b.search(60));
        
        b.inorder();
        System.out.println();
        b.preorder();
        System.out.println();
        b.postorder();
        System.out.println();
        b.levelorder();
        System.out.println();   
        b.delete(20);
        b.inorder();
        System.out.println();
        
        System.out.println(b.height());
	}
}
