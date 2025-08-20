package collection;

public class Book implements Comparable{
	String name;
	int id;
	double price;
	
	public Book(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	Book(){}

	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
	public int compareTo(Object o) {
		Book temp = (Book)o;
		if(this.price == temp.price) {
			return 0;
		}
		else if(this.price < temp.price) {
			return -1;	
		}else {
			return 1;
		}
	}
	
	
}
