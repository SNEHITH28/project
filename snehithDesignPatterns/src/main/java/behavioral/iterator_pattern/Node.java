package behavioral.iterator_pattern;

public class Node {
	public int data;
	public Node leftChild;
	public Node rightChild;

	Node(int data){
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
}
