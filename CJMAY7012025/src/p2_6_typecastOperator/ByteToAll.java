package p2_6_typecastOperator;

class ByteToAll
{
	public static void main(String[] args) 
	{
		byte a = 65;
		System.out.println("byte a = "+a);
		
		short b = a; //Widening (1 byte to 2 bytes)
		System.out.println("short = "+b); //65
		
		int c = a;  //Widening (1 byte to 4 bytes)
		System.out.println("int = "+c); //65
		
		long d = a; //widening (1 bytes to 8 bytes)
		System.out.println("long = "+d); //65
		
		float e = a; //widening (1 bytes to 4 bytes)
		System.out.println("float = "+e); //65.0
		
		double f = a; //widening (1 bytes to 8 bytes)
		System.out.println("double = "+f); //65.0
		
		char ch = (char)a; // Different case - (1 byte to 2 bytes) -ve values are not allowed
		System.out.println("char = "+ch); //A
	}
}
