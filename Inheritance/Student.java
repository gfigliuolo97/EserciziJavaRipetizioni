package School;

public class Student extends Person{
	private int credits;
	public Student(String lastname, String firstname, int credits) {
		super(lastname,firstname);
		this.credits = credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	@Override
	public String toString() {
		return super.toString() + ":" + credits + "credits.";
	}
}
