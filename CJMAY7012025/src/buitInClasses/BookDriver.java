package buitInClasses;

public class BookDriver {
	public static void main(String[] args) {
		Book b1 = new Book("Success is in your hand","Shiv Khera",225);
		System.out.println(b1); //toString()
		
		Book b2 = new Book("Success is in your hand","Shiv Khera",225);
		System.out.println(b2);
		
		Book b3 = new Book("Art of wining(The Chanakya Way)","Radhakrishnan Pillai",295);
		System.out.println(b3);
		
		System.out.println(b1.equals(b2)); //true
		
		System.out.println(b1.hashCode()); //10
		System.out.println(b2.hashCode()); //10
		
//		System.out.println(b1.hashCode() == b2.hashCode()); //true
	}
}
