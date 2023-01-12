package immutable;

public final class Exam {

	private final String sub;
	private final int marks;
	private final ExamStudent es;
	public Exam(String sub, int marks, ExamStudent es) {
		super();
		this.sub = sub;
		this.marks = marks;
		ExamStudent s = new ExamStudent(es.getName(), es.getRoll());
		this.es = s;
	}
	public String getSub() {
		return sub;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public ExamStudent getEs() {
		ExamStudent s = new ExamStudent(es.getName(), es.getRoll());
		return s;
	}
	
	@Override
	public String toString() {
		return "Exam [sub=" + sub + ", marks=" + marks + ", es=" + es + "]";
	}
	
	
	
	
}
