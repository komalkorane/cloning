package cloning;

public class Student1 implements Cloneable{
	
	String name;
	int roll;
	Address1 ad1;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, int roll, Address1 ad1) {
		super();
		this.name = name;
		this.roll = roll;
		this.ad1 = ad1;
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
	public Address1 getAd1() {
		return ad1;
	}
	public void setAd1(Address1 ad1) {
		this.ad1 = ad1;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", roll=" + roll + ", ad1=" + ad1 + "]";
	}
	protected Object clone() {
		
		Address1 add = new Address1(ad1.getCity(), ad1.getPincode());
		Student1 s = new Student1(name, roll, add);
		return s;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address1 ad1 = new Address1("Gargoti", 416209);
		Student1 s1 = new Student1("Swarup", 23, ad1);
		Student1 s2 = (Student1)s1.clone();
		System.out.println("Before clone : "+s1);
		System.out.println("Before clone : "+s2);
		s1.ad1.setCity("Kop");
		System.out.println("After clone : "+s1);
		System.out.println("After clone : "+s2);
		
	}
}
class Address1{
	
	String city;
	int pincode;
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address1(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address1 [city=" + city + ", pincode=" + pincode + "]";
	}
	
}