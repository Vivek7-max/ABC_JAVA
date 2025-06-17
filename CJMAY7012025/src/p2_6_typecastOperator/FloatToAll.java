package p2_6_typecastOperator;

class FloatToAll 
{
	public static void main(String[] args) 
	{
		float a = 65;
		System.out.println("float a = "+a);
		
		byte b = (byte) a; //Narrowing (4 byte to 1 byte)
		System.out.println("byte = "+b); 
		
		short c = (short)a;  //Narrowing (4 byte to 2 bytes)
		System.out.println("short = "+c);
		
		int d = (int)a; //different case (4 bytes to 4 bytes) int not holds capacity to store decimal values
		System.out.println("int = "+d);
		
		long e = (long)a; //different case (4 bytes to 8 bytes) long not holds capacity to store decimal values
		System.out.println("long = "+e); //65
		
		double f = a; //widening (4 bytes to 8 bytes)
		System.out.println("double = "+f); //65.0
		
		char ch = (char) a; //Narrowing (4 byte to 2 bytes)
		System.out.println("char = "+ch);
	}
}
