package behavioral.iterator_pattern;

public class Traversal {
	
	public void inOrderTraversal(Node node) {
    	if(node.leftChild != null) {
    		inOrderTraversal(node.leftChild);
    	}
    	System.out.print(node.data+" ");
    	if(node.rightChild != null) {
    		inOrderTraversal(node.rightChild);
    	}
    }
    
    public void preOrderTraversal(Node node) {
    	System.out.print(node.data+" ");
    	if(node.leftChild != null) {
    		preOrderTraversal(node.leftChild);
    	}
    	if(node.rightChild != null) {
    		preOrderTraversal(node.rightChild);
    	}
    }
    
    public void postOrderTraversal(Node node) {
    	if(node.leftChild != null) {
    		postOrderTraversal(node.leftChild);
    	}
    	if(node.rightChild != null) {
    		postOrderTraversal(node.rightChild);
    	}
    	System.out.print(node.data+" ");
    }
}
