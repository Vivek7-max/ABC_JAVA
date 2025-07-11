package p14_Inheritance;

public class Sheela {
	Sheela(){
		//super();
		//pre defined
		System.out.println("No Arg. Constructor of Sheela");
	}
	
	Sheela(int a){
		this();
		System.out.println("Parameterised Constructor of Sheela");
	}
	
	int a = 30;
	
	{
		System.out.println("IIB of Sheela");
	}
	
}
