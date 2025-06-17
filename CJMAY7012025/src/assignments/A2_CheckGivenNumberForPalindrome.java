package assignments;

public class A2_CheckGivenNumberForPalindrome {

	public static void main(String[] args) {
		
		int num = 518 ; //12 //1 //0
		int temp = num;
		int rev = 0; //12 //121
		
		while(num>0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if(temp == rev) {
			System.out.println(temp+ " is Palindrome Number");
		}else {
			System.out.println(temp+" is not Palindrome");
		}

	}

}
// num = 121 => rev = 121 => num==rev => Palindrome Number
// num = 1441 => rev = 1441 => num==rev => Palindrome Number
// num = 55