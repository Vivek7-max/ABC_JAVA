package p10_constructor;

public class P4 {
	
	P4(){
		//Pre defined ins.
		System.out.println("Sheela");
	}
	
	int a = 10;
	{
		System.out.println("IIB:1");
	}
	public static void main(String[] args) {
		System.out.println("Main Begin");
		new P4();
		System.out.println("Main End");
	}
	
	{
		System.out.println("IIB:2");
	}
}
