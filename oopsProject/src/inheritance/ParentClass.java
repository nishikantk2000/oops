package inheritance;

public class ParentClass {
   public void display() {
	   System.out.println("i Am display method of parent class");
   }
}
class FirstChild extends ParentClass{
	public void firstchildMethod() {
		   System.out.println("i Am firstchildMethod method of parent class");
	   }
}
class SecoundChild extends ParentClass{
	public void secoundchildmethod() {
		   System.out.println("i Am SecoundChild method of Secoundchild class");
	   }
}