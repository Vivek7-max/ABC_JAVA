package a1_array;
//find presence of element => Linear search
public class P12_LinearSearch {
	public static void main(String[] args) {
		int[] a = {21,78,45,29,21};
		
		int search = 29;
		
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			if(search == a[i]) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(search+" is present in the array");
		}else {
			System.out.println(search+" is not present in the array");
		}
	}
}
