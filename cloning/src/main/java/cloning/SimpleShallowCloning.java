package cloning;

public class SimpleShallowCloning implements Cloneable {

	int roll;
	String name;
	 
	SimpleShallowCloning(){
		super();
	}
	SimpleShallowCloning(int roll, String name){
		this.roll=roll;
		this.name=name;
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
	@Override
	public String toString() {
		return "SimpleShallowCloning [roll=" + roll + ", name=" + name + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SimpleShallowCloning s = new SimpleShallowCloning(10,"ram");
		System.out.println("original : "+s);
		
		SimpleShallowCloning s2 = (SimpleShallowCloning) s.clone();
		System.out.println("After cloning : "+s2);
		s2.setName("Sham");
		System.out.println(s);
		System.out.println(s2);
	}
	
}
