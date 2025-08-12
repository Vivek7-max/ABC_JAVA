package buitInClasses_Object;

public class P6 {
	int a ;

	public P6(int a) {
		super();
		this.a = a;
	}
	public P6() {}
	
	public boolean equals(Object obj1) {
		P6 temp =(P6)obj1;
		return this.a==temp.a;
	}
	
}
