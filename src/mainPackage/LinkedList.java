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
	
	public boolean isEmpty() {
		return head == null;
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
	
	public boolean insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return true;
		}
		Node temp = head;
		while(temp != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	
}
