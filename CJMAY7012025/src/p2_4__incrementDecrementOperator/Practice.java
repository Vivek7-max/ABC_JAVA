package p2_4__incrementDecrementOperator;

class Practice 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = a-- + 20;
		int c = ++b - --a;
		int d = c + ++a;
		
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(--c);
		System.out.println(d--);
	}
}
