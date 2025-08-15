package builtInClass_String;

public class P20 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(3);
		System.out.println(sb); //EmptyString
		System.out.println(sb.length()); //0
		System.out.println(sb.capacity()); //3
		
		sb.append("Vivek");
		System.out.println(sb); //Vivek
		System.out.println(sb.length()); //5
		System.out.println(sb.capacity()); //(3+1)*2 => 8
		
		
	}
}
