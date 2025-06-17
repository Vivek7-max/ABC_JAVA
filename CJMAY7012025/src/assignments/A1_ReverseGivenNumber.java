package assignments;

public class A1_ReverseGivenNumber {

	public static void main(String[] args) {
		
		int num = 125; //12 //1 //0
		
		int rev = 0; //0 //5 //52 //521
		
		while(num>0) {
			int rem = num % 10; 
			
			rev = rev * 10 + rem ; 
			
			num = num / 10; 
		}
		
		System.out.println(rev);
		
	}

}

//num = 45  => 54
//num = 125 => 521
 