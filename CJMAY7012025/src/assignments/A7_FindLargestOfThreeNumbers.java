package assignments;

public class A7_FindLargestOfThreeNumbers {

	public static void main(String[] args) {
		int num1 = 500;
		int num2 = 40;
		int num3 = 330;
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is lagest");
		}else if (num2>num3 && num2>num1) {
			System.out.println(num2+" is lagest");
		}else {
			System.out.println(num3+" is lagest");
		}

	}

}
