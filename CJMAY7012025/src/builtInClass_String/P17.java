package builtInClass_String;

public class P17 {
	public static void main(String[] args) {
		String s = "All the Best";

		//output = Best the All
		
		String[] sArr = s.split(" ");
		
		String ans = "";
		
		for(int i=0; i<sArr.length; i++) {
			ans = sArr[i]+ans+" ";
		}
		
		System.out.println(ans);
		
	}
}
