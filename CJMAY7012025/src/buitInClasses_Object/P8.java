package buitInClasses_Object;

public class P8 {
	int a;
	int b;
	public P8(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public P8() {}
	@Override
	public String toString() {
		return "P8 [a=" + a + ", b=" + b + "]";
	};
	
	public boolean equals(Object o) {
		P8 temp = (P8) o;
		return this.a==temp.a && this.b==temp.b;
	}
	
	public int hashCode() {
		int hc = 0;
		hc = a;
		hc = a+b;
		hc = a+b+1;
		return hc;
	}
}
