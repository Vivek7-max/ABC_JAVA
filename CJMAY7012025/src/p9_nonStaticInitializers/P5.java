package p9_nonStaticInitializers;

public class P5 {
	
	{
		System.out.println("Instance Initialization Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Begin");
		new P5();
		System.out.println("Main End");
	}

}
