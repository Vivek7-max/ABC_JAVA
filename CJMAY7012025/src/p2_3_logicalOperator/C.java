package p2_3_logicalOperator;
class C 
{
	public static void main(String[] args) 
	{
		System.out.println(!true); //false
		System.out.println(!false); //true
		System.out.println(!(10<5)); //true
		System.out.println(!(10==11 && 40<1)); //true
	}
}
