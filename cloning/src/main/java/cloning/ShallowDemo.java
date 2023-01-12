package cloning;

public class ShallowDemo implements Cloneable {

	String name;
	double percent;
	MarkList list;
	public ShallowDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShallowDemo(String name, double percent, MarkList list) {
		super();
		this.name = name;
		this.percent = percent;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public MarkList getList() {
		return list;
	}
	public void setList(MarkList list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "ShallowDemo [name=" + name + ", percent=" + percent + ", list=" + list + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		MarkList list = new MarkList("Maths", 90);
		ShallowDemo sd = new ShallowDemo("Komal", 90, list);
		ShallowDemo sd1 = (ShallowDemo)sd.clone();
		System.out.println("Before clone : "+sd);
		System.out.println("Before clone : "+sd1);
		sd.list.setSub("Statistics");
		System.out.println("After clone : "+sd);
		System.out.println("After clone : "+sd1);
	}
	
	
}
class MarkList{
	
	String sub;
	int marks;
	public MarkList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarkList(String sub, int marks) {
		super();
		this.sub = sub;
		this.marks = marks;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "MarkList [sub=" + sub + ", marks=" + marks + "]";
	}
	
}