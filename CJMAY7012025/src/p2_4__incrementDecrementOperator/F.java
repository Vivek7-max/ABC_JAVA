package p2_4__incrementDecrementOperator;

class F 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = a--; //b = 10 //a = 9
		
		System.out.println(a--); //9  //a=8
		
		System.out.println(b-- + a++); //10+8=> 18          (b=9, a=9)
		
		System.out.println(a); //9
		
		System.out.println(b); //9
		
	}
}
