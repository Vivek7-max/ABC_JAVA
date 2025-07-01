package p9_nonStaticInitializers;

public class P7 {
	{
		System.out.println("IIB:1");
	}
	public static void main(String[] args) {
		P7 obj =new P7();
		P7 obj1 =new P7();
	}
	{
		System.out.println("IIB:2");
	}
}
