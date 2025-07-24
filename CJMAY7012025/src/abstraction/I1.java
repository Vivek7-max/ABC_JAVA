package abstraction;

public abstract interface I1 {
	
	
	int A = 60; //by default => public static final
	
	public static void main(String[] args) {
		System.out.println("Hi Sheela");
		System.out.println(A);
//		A = 61; //CTE - A is final
	}
	
	public void test() ; //by default => abstract
}
