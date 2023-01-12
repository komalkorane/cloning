package immutable;

public class ExamStudent {

	String name;
	int roll;
	public ExamStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExamStudent(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "ExamStudent [name=" + name + ", roll=" + roll + "]";
	}
	
	
}
