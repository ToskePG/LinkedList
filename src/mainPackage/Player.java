package mainPackage;

public class Player {
	
	private String username;
	private String password;
	private int level;
	private int damageLevel;
	
	
	public Player(String username, String password, int level, int damageLevel) {
		this.username = username;
		this.password = password;
		this.level = level;
		this.damageLevel = damageLevel;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getDamageLevel() {
		return damageLevel;
	}


	public void setDamageLevel(int damageLevel) {
		this.damageLevel = damageLevel;
	}


	@Override
	public String toString() {
		return "Player [username=" + username + ", password=" + password + ", level=" + level + ", damageLevel="
				+ damageLevel + "]";
	}
	
}
