package p2_6_typecastOperator;

class LongToAll 
{
	public static void main(String[] args) 
	{
		long a = 65;
		System.out.println("long a = "+a);
		
		byte b = (byte) a; //Narrowing (8 byte to 1 byte)
		System.out.println("byte = "+b);
		
		short c =(short) a; //Narrowing (8 bytes to 2 bytes)
		System.out.println("short = "+c);
		
		int d = (int)a;  //Narrowing (8 byte to 4 bytes)
		System.out.println("int = "+d);
		
		float e = (float)a; //Narrowing (8 bytes to 4 bytes)
		System.out.println("float = "+e);
		
		double f = a; //different case (8 bytes to 8 bytes) double has capacity to store decimals as well
		System.out.println("double = "+f);
		
		char ch = (char)a; //Narrowing - (8 bytes to 2 bytes)
		System.out.println("char = "+ch);
	}
}
