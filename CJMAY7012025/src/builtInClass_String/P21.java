package builtInClass_String;

public class P21 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println(sb); //Hello
		System.out.println(sb.length()); //2
		System.out.println(sb.capacity()); //(No. of Character in main string+Default cap)
		
		
		
	}
}
