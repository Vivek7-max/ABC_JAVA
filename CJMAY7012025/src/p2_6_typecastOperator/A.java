package p2_6_typecastOperator;
class A 
{
	public static void main(String[] args) 
	{
		short a = 10; //  0 0 0 0 0 0  0 1 0 1 0
		
		byte b = (byte) a;   
		
		System.out.println(b);
		
	}
}
