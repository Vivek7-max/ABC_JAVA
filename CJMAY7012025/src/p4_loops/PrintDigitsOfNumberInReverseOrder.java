package p4_loops;

public class PrintDigitsOfNumberInReverseOrder {

	public static void main(String[] args) {
		int num = 125; //12 //1 //0
		
		while(num>0) {
			System.out.println(num%10); //5 //2 //1
			num = num / 10; 
		}

	}

}

//num = 125;
//5
//2
//1

//num = 45;
//5
//4