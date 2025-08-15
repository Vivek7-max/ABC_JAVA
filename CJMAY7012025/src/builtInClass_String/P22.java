package builtInClass_String;

public class P22 {
	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = s1;
		s1 = s1 + "Vivek";
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		StringBuilder sb1 = new StringBuilder("Hi");
		StringBuilder sb2 = sb1;
		sb1.append("Vivek");
		System.out.println(sb1); //HiVivek
		System.out.println(sb2); //HiVivek
	}
}
