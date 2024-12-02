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
		
		l1.insertAtEnd(8);
		l1.displayList();
		System.out.println("-------------------");
		
		l1.deleteByValue(5);
		l1.displayList();
		System.out.println("-------------------");
		
		l1.deleteHead();
		l1.displayList();
		System.out.println("-------------------");
		
		l1.insertAtBeggining(7);
		l1.insertAtBeggining(5);
		l1.displayList();
		System.out.println("-------------------");
		
		l1.deleteByValue(8);
		l1.displayList();
		System.out.println("-------------------");
		
		l1.insertAtEnd(8);
		l1.deleteByValue(7);
		l1.displayList();
		System.out.println("-------------------");

	}

}
