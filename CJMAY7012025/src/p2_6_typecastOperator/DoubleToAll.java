package p2_6_typecastOperator;

class DoubleToAll 
{
	public static void main(String[] args) 
	{
		double a = 65;
		System.out.println("double a = "+a);
		
		byte b = (byte) a; //Narrowing (8 byte to 1 byte)
		System.out.println("byte = "+b);
		
		short c =(short) a; //Narrowing (8 bytes to 2 bytes)
		System.out.println("short = "+c);
		
		int d = (int)a;  //Narrowing (8 byte to 4 bytes)
		System.out.println("int = "+d);
		
		float e = (float)a; //Narrowing (8 bytes to 4 bytes)
		System.out.println("float = "+e);
		
		long f = (long)a; //different case (8 bytes to 8 bytes) long has no capacity to store the decimals
		System.out.println("long = "+f);
		
		char ch = (char)a; //Narrowing - (8 bytes to 2 bytes)
		System.out.println("char = "+ch);
	}
}
