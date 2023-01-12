package cloning;

public class DeepCloning {
   public static void main(String[] args) throws CloneNotSupportedException {
	  Bike b = new Bike(1663, "Grey");
	  Employee e = new Employee(329, "Komal",b);
	  System.out.println("Before clone : "+e);
	  Employee e2 = (Employee)e.clone();
	  e.getB().setNo(555);
	  System.out.println("after clone : "+e2);
	  
	  System.out.println(e2.getId()==e.getId());
}
}

class Employee implements Cloneable {
	int id;
	String name;
	Bike b;
	Employee(){
		super();
	}
	Employee(int id, String name,Bike b){
		this.id=id;
		this.name=name;
		this.b=b;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Bike getB() {
		return b;
	}
	public void setB(Bike b) {
		this.b=b;
	}
	public String toString() {
		return "id "+id+" "+"name "+name+ " "+"bike "+b;
	}
	public Object clone() throws CloneNotSupportedException {
		
		Employee e2 = (Employee)super.clone();
		e2.setB((Bike)e2.getB().clone());
		return e2;
		
	}
}

class Bike implements Cloneable{
	int no;
	String color;
	
	Bike(){
		super();
	}
	Bike(int no,String color){
		this.no=no;
		this.color=color;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no=no;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return "no "+no+ " "+"color "+color;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
