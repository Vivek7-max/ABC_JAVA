package p2_6_typecastOperator;

class ShortToAll 
{
	public static void main(String[] args) 
	{
		short a = 65;
		System.out.println("short a = "+a);
		
		byte b = (byte) a; //Narrowing (2 byte to 1 byte)
		System.out.println("byte = "+b);//65
		
		int c = a;  //Widening (2 byte to 4 bytes)
		System.out.println("int = "+c); //65
		
		long d = a; //widening (2 bytes to 8 bytes)
		System.out.println("long = "+d); //65
		
		float e = a; //widening (2 bytes to 4 bytes)
		System.out.println("float = "+e); //65.0
		
		double f = a; //widening (2 bytes to 8 bytes)
		System.out.println("double = "+f); //65.0
		
		char ch = (char)a; // different case - (2 bytes to 2 bytes) -ve values are not allowed
		System.out.println("char = "+ch);
		
	}
}
