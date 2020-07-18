package behavioral.iterator_pattern;

public class Tree {
	
	static Node root;   
    Tree(int key) 
    { 
        root = new Node(key); 
    } 
  
    Tree(){ 
        root = null; 
    } 
    
    
    public static void main(String[] args){
    	
        Traversal traversal = new Traversal();

        Tree.root = new Node(1); 
  
        Tree.root.leftChild = new Node(2); 
        Tree.root.rightChild = new Node(3); 
  
        Tree.root.leftChild.leftChild = new Node(4); 
        Tree.root.leftChild.rightChild = new Node(5); 
        
        Tree.root.rightChild.leftChild = new Node(6); 
        Tree.root.rightChild.rightChild = new Node(7); 
        
        System.out.println("InOrdered traversal");
        traversal.inOrderTraversal(root);
        System.out.println();
        
        System.out.println("PreOrdered traversal");
        traversal.preOrderTraversal(root);
        System.out.println();
        
        System.out.println("PostOrdered traversal");
        traversal.postOrderTraversal(root);
        
    } 
	
	
	
}
