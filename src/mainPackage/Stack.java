package mainPackage;

public class Stack {

	private PlayerNode top;
	
	public Stack() {
		this.top = null;
	}
	
	public void push(Player data) {
		PlayerNode newPlayer = new PlayerNode(data);
		newPlayer.next = top;
		top = newPlayer;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public Player pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		Player poppedPlayer = top.data;
		top = top.next;
		return poppedPlayer;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack je prazan buurate moj. Nema se sto vidjet fratelo");
			return;
		}
		System.out.println(top.data.toString());
	}
	
	public void displayStack() {
		if(isEmpty()) {
			System.out.println("Stack je emptiii moj burateee");
			return;
		}
		PlayerNode temp = top;
		while(temp != null) {
			System.out.println(temp.data.toString());
			temp = temp.next;
		}
	}
	
	
}
