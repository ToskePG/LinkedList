package mainPackage;

public class Test {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.displayList();
		System.out.println("-------------------");
		
		l1.insertAtBeggining(5);
		l1.displayList();
		System.out.println("-------------------");
		
		l1.insertAtEnd(7);
		l1.displayList();
		System.out.println("-------------------");

	}

}
