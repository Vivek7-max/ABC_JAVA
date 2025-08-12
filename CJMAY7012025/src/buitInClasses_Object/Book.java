package buitInClasses_Object;

import java.util.Objects;

public class Book {
	String name;
	String writer;
	double price;
	
	public Book(String name, String writer, double price) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	
	public Book(){
		
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Book temp = (Book) obj ;
		return this.name==temp.name &&
			   this.writer==temp.writer &&
			   this.price == temp.price;
	}
	
	public int hashCode() {
		int a = name.hashCode();
		a = a+ writer.hashCode();
		a = a + (int) price;
		return a;
	}
	
	
	
}
