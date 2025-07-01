package p10_constructor;

public class P5 {
	P5(){
		//pre defined ins
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Begin");
		new P5();
		System.out.println("Main End");

	}
	
	{
		int a = 20;
	}
	
	{
		System.out.println("Bye");
	}

}
