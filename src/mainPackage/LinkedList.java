package mainPackage;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	// Insert functions
	public boolean insertAtBeggining(int data) {
		Node newNode = new Node(data);
		// Novi node mora da pokazuje na trenutnu glavu.
		newNode.setNext(head);
		// Postavljamo novu glavu liste
		head = newNode;
		return true;
	}
	
	
	
}
