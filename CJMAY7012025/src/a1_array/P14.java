package a1_array;

import java.util.Arrays;

public class P14 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		Arrays.sort(a);
		int low = 0; //0
		int high = a.length-1; //4
		int search = 10; //70
		int count = 0; 
		while(low<=high) { 
			int mid = (low+high) / 2; 
			if(search == a[mid]) { 
				count++;
				break;
			}
			else if(search < a[mid]) {
				high = mid -1; 
			}
			else {
				low = mid+1; 
			}
		}
		if(count>0) {
			System.out.println(search+" is present");
		}else {
			System.out.println(search+" is not present");
		}

	}

}
