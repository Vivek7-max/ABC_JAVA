package builtInClass_String;

public class P9 {
	public static void main(String[] args) {
//		int[] a = {10,20,30,70};
//		System.out.println(a[-1]); //ArrayIndexOutOfBoundsException
		
		String s = "hi";
//		System.out.println(s.charAt(3)); //StringIndexOutOfBoundsException
		
//		System.out.println(s.charAt(-1));
		System.out.println(s.charAt(s.length()-1)); //i
		
	}
}
