package buitInClasses;

public class P5 {
	int a ;
	P5(int a){
		this.a = a;
	}
	public static void main(String[] args) {
		P5 obj = new P5(10);
		System.out.println(obj); //address1
		P5 obj1 = new P5(20);
		System.out.println(obj1); //address2
		
		System.out.println(obj.equals(obj1)); //false
	}
}
