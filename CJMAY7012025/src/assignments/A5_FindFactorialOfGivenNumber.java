package assignments;

public class A5_FindFactorialOfGivenNumber {

	public static void main(String[] args) {
		
		int num = 7;
		int temp = num;
		int prod = 1; //3 //6 //6
		
		while(num>0){
			prod = prod * num;
			num--;
		}
		System.out.println("Factorial of "+temp+" is: "+prod);
	}

}
// num 3 => 3! => 3*2*1 => 6
//num 5 => 5! => 5*4*3*2*1 => 120