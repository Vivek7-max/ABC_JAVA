package p10_constructor;

public class MovieMaker {

	public static void main(String[] args) {
		Movie m1 = new Movie("Lucky Baskhar", "Dulqur Salman", "Meenashi", 4.5);
		m1.display();

		Movie m2 = new Movie("JAVA-The Success Story", "SonOfArunBharati", 5);
		m2.display();

		Movie m3 = new Movie();
		m3.display();
	}

}
