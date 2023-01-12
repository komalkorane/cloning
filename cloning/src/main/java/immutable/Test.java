package immutable;

public class Test {

	
	public static void main(String[] args) {
		
		ExamStudent es = new ExamStudent("Harsh", 10);
		Exam e = new Exam("maths", 90, es);
		System.out.println("Before : "+e);
		e.getEs().setName("komal");
		System.out.println("After : "+e);
	}
}
