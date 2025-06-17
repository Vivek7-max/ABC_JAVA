package p2_4__incrementDecrementOperator;

class C 
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		int b = a++; //b = 10, a = 11
		
		System.out.println(a++); //11 //a=12
		
		System.out.println(b++); //10 //b=11
		
		System.out.println(a); //12
		System.out.println(b); //11
	}
}
