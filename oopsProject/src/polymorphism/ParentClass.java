package polymorphism;

public class ParentClass {
	public void displayInfo() {
		System.out.println(" I am from ParentClass");
	}

}
class Child extends ParentClass{
	public void displayInfo() {
		System.out.println(" I am from Child Class");
	
	}
}