package inheritance;

public class Parent {
	public void Displat() {
		System.out.println("I am a method from Parent class");
	}

}
class Child extends Parent{
	public void print() {
		System.out.println("I am a method from child class");
	}
}
