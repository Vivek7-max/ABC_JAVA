package p2_6_typecastOperator;

class IntToAll 
{
	public static void main(String[] args) 
	{
		int a = 65;
		System.out.println("int a = "+a);
		
		byte b = (byte) a; //Narrowing (4 byte to 1 byte)
		System.out.println("byte = "+b);
		
		short c = (short)a;  //Narrowing (4 byte to 2 bytes)
		System.out.println("short = "+c);
		
		long d = a; //Widening (4 bytes to 8 bytes)
		System.out.println("long = "+d);
		
		float e = a; //different case (4 bytes to 4 bytes) float has capacity to store decimals as well
		System.out.println("float = "+e); //65.0
		
		double f = a; //widening (4 bytes to 8 bytes)
		System.out.println("double = "+f);
		
		char ch = (char) a; //Narrowing (4 byte to 2 bytes)
		System.out.println("char = "+ch);
	}
}
