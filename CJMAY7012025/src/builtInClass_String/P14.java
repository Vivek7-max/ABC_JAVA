package builtInClass_String;

public class P14 {
	public static void main(String[] args) {
		String s = "Vivek";
		
		//output - keviV
		
		String ans = "";
		
		for(int i = 0; i<s.length(); i++) {
			ans = s.charAt(i) + ans;
			//'V'+"" => "V"
			//'i'+"V" => "iV"
			//'v'+"iV"=> "viV"
			//'e'+"viV" => "eviV"
			//'k'+"eviV"=> "keviV"
		}
		
		System.out.println(ans);
		
	}
}
