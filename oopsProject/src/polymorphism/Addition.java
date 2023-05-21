package polymorphism;

public class Addition {
	static void add(int a,int b) {
			System.out.println("Integer Addition and Result = "+ (a+b));

	}
    static void add(double a,double b) {
		System.out.println("double Addition and Result = "+ (a+b) );

    }
    static void add(double a,double b,double c) {
		System.out.println("Three Paramiter,double Addition and Result = "+ (a+b+c));

    }
}
