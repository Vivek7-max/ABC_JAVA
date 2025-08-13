package builtInClass_String;

public class P12  {
	public static void main(String[] args) {
		String s = "ABC";
		
		byte[] b = s.getBytes();
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}
}
