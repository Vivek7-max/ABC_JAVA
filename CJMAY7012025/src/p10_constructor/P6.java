package p10_constructor;
public class P6 {
	static int a = test(); 
	boolean b = print(); 
	static{
		System.out.println("From SIB-1");
	}
	public static void main(String[] args) {
		System.out.println("Main Begin");
		P6 obj = new P6();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println("Main End");
	}
	public static int test() {
		System.out.println("Test Begin");
		System.out.println("Test End");
		return 30;
	}
	public boolean print() {
		System.out.println("Print Begin");
		System.out.println("Print End");
		return true;
	}
	P6(){
		//pre defined ins.
		System.out.println("Constructor of A");
	}
	{
		System.out.println("From IIB-1");
	}
}