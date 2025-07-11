package p14_Inheritance;

public class B extends A{
	int b = 60;

	B(){
		super(); // no arg. con. of super class 
		//per defined ins.
	}
	
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a); //Why?
	}

}
