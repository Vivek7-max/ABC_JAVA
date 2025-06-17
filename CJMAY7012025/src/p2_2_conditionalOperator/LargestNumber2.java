package p2_2_conditionalOperator;
class LargestNumber2 //WAJP to find largest of two number using conditional operator 
{
	public static void main(String[] args) 
	{
		byte num1 = 50;
		byte num2 = 70; 
		String result = num1>num2 ? num1+" is largest" : num2+" is largest";
		System.out.println(result);
	}
}
