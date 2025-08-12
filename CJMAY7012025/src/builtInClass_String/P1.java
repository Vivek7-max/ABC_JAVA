package builtInClass_String;

public class P1 {
	public static void main(String[] args) {
		String s = "Hello";
		int hash = System.identityHashCode(s);
		System.out.println(hash);
		System.out.println(Integer.toHexString(hash));
	}
}
