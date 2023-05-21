package encapsulation;

public class EncapsulationExample{

	public static void main(String[] args) {
		StudentDetails Details = new StudentDetails();
		Details.setStudentName("Nishikant");
		Details.setStudentAge("23");
		Details.setStudentID(9124);
		
		System.out.println("Name :" + Details.getStudentName()+" "+ "Age :"+ Details.getStudentAge() +" "+ "StdID :"+Details.getStudentID());
	}

}
