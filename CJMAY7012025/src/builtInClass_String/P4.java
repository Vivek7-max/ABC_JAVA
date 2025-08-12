package builtInClass_String;

public class P4 {
	public static void main(String[] args) {
		String s1 = new String(); //To Create Empty String
		System.out.println(s1);
		System.out.println("Hi");
		
		String s2 = new String("Hello"); //To Create the string & initialize it
		System.out.println(s2);//Hello
		
		char[] c = {'S','A','R','T','H','A','K'}; //To Convert Char [] to String
		String s3 = new String(c);
		System.out.println(s3); //SARTHAK
		
	
	}
}
