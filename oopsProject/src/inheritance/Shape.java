package inheritance;

public class Shape {
	public void display() {
		System.out.println("Inside display method of shape class");
		
	}

}
class Rectangle extends Shape{
	public void area() {
		System.out.println("Inside area method of Rectangle class");
	}
}
class Cube extends Rectangle{
	public void valume() {
		System.out.println("Inside Valume method of Cube class");
	}
}