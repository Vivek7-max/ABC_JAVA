package assignments;

public class A4_FindXPowerN {

	public static void main(String[] args) {
		// 2 power 3
		
		int base = 2; //2
		
		int index = 3; //3
		
		int prod = 1; //1 //2 //4 //8
		
		int count = 1; //1 //2 //3 //4
		
		while(count<=index) { //1<=3 //2<=3 //3<=3 //4<=3
			prod = prod * base; //1*2 //2*2 //4*2
			count++;
		}
		
		System.out.println(prod); //8
		 
	}

}
