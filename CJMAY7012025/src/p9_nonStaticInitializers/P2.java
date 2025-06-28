package p9_nonStaticInitializers;

public class P2 {
	int a = test(); //90
	
	public static void main(String[] args) {
		System.out.println("Main Begin"); //MB
		P2 obj = new P2();
		System.out.println(obj.a); //90
		obj.test();
		System.out.println("Main End");
	}
	
	public int test() {
		System.out.println("TB"); //TB
		System.out.println(a); //0
		System.out.println("TE"); //TE
		return 90;
	}

}
