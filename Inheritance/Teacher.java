package School;

public class Teacher extends Person {
	private String schoolSubject;
	
	public Teacher(String lastname, String firstname, String schoolSubject) {
		super(lastname,firstname);
		this.schoolSubject = schoolSubject;
	}
	public void setSchoolSubject(String subject){
        this.schoolSubject = subject;
    }
    public String getSchoolSubject(){
        return this.schoolSubject;
    }
	@Override
	public String toString() {
		return super.toString() + "("+ schoolSubject+")";
	}
}
