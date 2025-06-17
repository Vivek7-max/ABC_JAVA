package p2_6_typecastOperator;

class CharToAll 
{
	public static void main(String[] args) 
	{
		char a = 'A';
		System.out.println("char a = "+a);
		
		byte b = (byte) a; //Narrowing (2 byte to 1 byte)
		System.out.println("byte = "+b);
		
		short c = (short)a; //different case (2 bytes to 2 bytes) range of char is only +ve values
		System.out.println("short = "+c);
		
		int d = a;  //Widening (2 byte to 4 bytes)
		System.out.println("int = "+d);
		
		long e = a;  //Widening (2 byte to 8 bytes)
		System.out.println("int = "+e);
		
		float f =a; //Widening (2 bytes to 4 bytes)
		System.out.println("float = "+f);
		
		double g = a; //Widening case (2 bytes to 8 bytes)
		System.out.println("double = "+g);
		
	}
}
