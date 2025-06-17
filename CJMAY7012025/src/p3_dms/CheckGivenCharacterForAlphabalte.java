package p3_dms;
class CheckGivenCharacterForAlphabalte 
{
	public static void main(String[] args) 
	{
		char ch = '&';
		
		if (ch>=65 && ch<=90  || ch>=97 && ch<=122)
		{
			System.out.println(ch+" is an Alphabate..!");
		}
		else
		{
			System.out.println(ch+" is not an Alphabate..!");
		}
	}
}
