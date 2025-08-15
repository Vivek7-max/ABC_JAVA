package builtInClass_String;

public class P19 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		//To Create Empty String
		System.out.println(s);
		System.out.println("String length: "+s.length());
		System.out.println("String Capacity: "+s.capacity()); //16
		s = s.append("V");
		System.out.println(s); //V
		System.out.println(s.length()); //1
		System.out.println(s.capacity()); //16
		
		s = s.append("123456789012345");
		System.out.println(s);//V123456789012345
		System.out.println(s.length()); //16
		System.out.println(s.capacity()); //16
		
		s = s.append("6");
		System.out.println(s);//V1234567890123456
		System.out.println(s.length()); //17
		System.out.println(s.capacity()); //34
		//(previousCapacity+1)*2
		
		s = s.append("V12345678901234567");
		System.out.println(s.length()); //35
		System.out.println(s.capacity()); //70
		
		//append(String s)
		
//		String s1 = "Vivek";
//		s1 = s1+"Sheela";
//		System.out.println(s1);
		
		
		
	}
}
