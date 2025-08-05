package a1_array;

public class P19 {
	public static void main(String[] args) {
		String s [] = {"Vivek", "Sheela", "Meena", "Teena"};
		
		//linear search
		
		String search = "Katreena";
		
		boolean flag = false;
		
		for(int i=0; i<s.length; i++) {
			if(search == s[i]) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(search+" is present");
		}else {
			System.out.println(search+" is not present");
		}
		
	}
}
