package School;

public class Teacher extends Person {
	private String schoolSubject;
	
	public Teacher(String lastname, String firstname, String schoolSubject) {
		super(lastname,firstname);
		this.schoolSubject = schoolSubject;
	}
	
	@Override
	public String toString() {
		return super.toString() + "("+ schoolSubject+")";
	}
}
