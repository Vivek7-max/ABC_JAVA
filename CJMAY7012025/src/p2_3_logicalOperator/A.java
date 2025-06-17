package p2_3_logicalOperator;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		
		System.out.println(4<50 && true); //true
	
		System.out.println(70==80 && true); //false
		
		System.out.println('z'<200 && 'A'==654); //false
	}
}
