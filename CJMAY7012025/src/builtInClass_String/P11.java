package builtInClass_String;

public class P11 {

	public static void main(String[] args) {
		String s = "Vivek";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.concat(" Sheela"));
		
		System.out.println(s.contains("ive"));
		System.out.println(s.indexOf('z')); //2
		
		System.out.println(s.substring(1,3));
	}

}
