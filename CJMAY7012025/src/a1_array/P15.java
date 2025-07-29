package a1_array;

public class P15 {
	public static void main(String[] args) {
		int[] a  = {10,50,30,60};

		int search = 70;

		boolean flag = false;

		for(int i=0; i<a.length; i++) {
			if(search == a[i]) {
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
