package metier;

public class Person {
	private String name;
	private boolean deceased;
	public Person() {
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public boolean isDeceased() {
		return this.deceased;
	}
	public void setDeceased(boolean deceased) {
		this.deceased = deceased;
	}
}
