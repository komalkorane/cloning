package immutable;

public final class Student {

	private final String name;
	private final int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public static void main(String[] args) {
		Student s1 = new Student("Koaml", 10);
		
		System.out.println(s1);
	}
}
