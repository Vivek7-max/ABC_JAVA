package a1_array;

public class P16 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		
		int low = 0; //0
		int high = a.length-1; //4
		int search = 80; //70
		boolean flag = false; 
		
		for(;high>=low;) {
			int mid = (low+high) / 2; 
			if(search == a[mid]) { 
				flag = true;
				break;
			}
			else if(search < a[mid]) {
				high = mid -1; 
			}
			else {
				low = mid+1; 
			}
		}
		
		if(flag) {
			System.out.println(search+" is present");
		}else {
			System.out.println(search+" is not present");
		}

	}

}
