package builtInClass_String;

public class P15 {
	public static void main(String[] args) {
		String s = "Vivek";
		
		String ans = "";
		
		for(int i =s.length()-1; i>=0; i--) {
			ans = ans + s.charAt(i);
			//"k"
			//"k"+'e' => "ke"
			System.out.println(ans);
		}
		System.out.println("Reversed String: ");
		System.out.println(ans);
		
	}
}
