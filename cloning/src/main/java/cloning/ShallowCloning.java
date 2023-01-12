 package cloning;

public class ShallowCloning {
	
    public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address(1234,"Kolhapur");
		Student  s = new Student(10,"komal",add);
		System.out.println("before : "+s);
		Student s2= (Student)s.clone();
		s.getAdd().setCity("pune");
		System.out.println("After : "+s2);
		
		System.out.println(s.getAdd() == s2.getAdd());
	}
   
}

class Student implements Cloneable{
	
	int roll;
	String name;
	Address add;
	
	Student(){
		super();
	}
	Student(int roll, String name,Address add){
		this.roll=roll;
		this.name=name;
		this.add=add;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add=add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	public Object clone() throws CloneNotSupportedException{
		 return super.clone();
		 
	}
	
	
}

class Address implements Cloneable {
	
	int pin;
	String city;
	
	Address(){
		super();
	}
	Address(int pin, String city){
		this.pin=pin;
		this.city=city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}