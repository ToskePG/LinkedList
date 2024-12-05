package mainPackage;

public class Test {

	public static void main(String[] args) {
		
		/*LinkedList l1 = new LinkedList();
		
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
		System.out.println("-------------------"); */
		
		
		Stack playerStack = new Stack();
		
		Player p1 = new Player("user1", "pass1", 10, 10);
		Player p2 = new Player("user2", "pass2", 20, 20);
		Player p3 = new Player("user3", "pass3", 30, 30);
		
		playerStack.displayStack();
		playerStack.pop();
		System.out.println("----------------------------");
		
		playerStack.push(p1);
		playerStack.displayStack();
		System.out.println("----------------------------");
		
		playerStack.pop();
		playerStack.displayStack();
		System.out.println("----------------------------");
		
		playerStack.push(p1);
		playerStack.push(p2);
		playerStack.push(p3);
		playerStack.displayStack();
		System.out.println("----------------------------");
		
		playerStack.pop();
		playerStack.displayStack();
		System.out.println("----------------------------");
		
		
		playerStack.peek();
		System.out.println("----------------------------");

	}

}
