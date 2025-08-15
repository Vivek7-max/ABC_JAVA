package builtInClass_String;

public class P18 {
	public static void main(String[] args) {
		String s = "All the Best";

		//output = Best the All
		//output = llA eht tseB

		
		String[] sArr = s.split(" ");
		
		String ans = "";
		
		for(int i=sArr.length-1; i>=0; i--) {
			ans =ans+sArr[i]+" ";
		}
		
		System.out.println(ans);
	}
}
