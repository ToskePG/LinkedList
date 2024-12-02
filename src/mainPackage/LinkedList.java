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
		if(isEmpty()) {
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
	
	// Brisanje cvora po vrijednosti
	public boolean deleteByValue(int data) {
		if(isEmpty()) {
			System.out.println("Lista je vec prazna");
			return false;
		}
		if(head.getData() == data) {
			head = head.getNext();
			// Obavezno! kad se elemenat izbrise iz liste, sledeci korak je izlazak funkcije! 
			return true;
		}
		Node temp = head;
		Node previousNode = null;
		while(temp != null && temp.getData() != data) {
			previousNode = temp;
			temp = temp.getNext();
		}
		if(temp == null) {
			System.out.println("Data vrijednost ne postoji u listi.");
			return false;
		}
		previousNode = temp.getNext();
		return true;
	}
	
	public boolean deleteHead() {
		if(isEmpty()) {
			System.out.println("Lista je prazna");
			return false;
		}
		head = head.getNext();
		return true;
	}
	
	// Display list
	public void displayList() {
		if(isEmpty()) {
			System.out.println("Lista je prazna");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData() + " -> ");
		}
		System.out.println("Null");
	}
	
}
