package p10_constructor;

public class X {
	int a;
	String b;
	boolean c;
	char d;
	
	X(int a){
		//pre defined ins
		this.a = a;
	}
	
	X(int a, String b, boolean c){
		this(a);//this call statement
		this.b = b;
		this.c = c;
		
	}
	
	X(int a, String b, boolean c, char d){
		this(a,b,c);
		this.d = d;
	}
	
	public void details() {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
	}
	
}
