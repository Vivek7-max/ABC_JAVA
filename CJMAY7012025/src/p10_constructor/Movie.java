package p10_constructor;

public class Movie {
	String mName;
	String mActor;
	String mActress;
	double mRatings;
	
	public Movie(String mName, String mActor, String mActress, double mRatings) {
		this.mName = mName;
		this.mActor = mActor;
		this.mActress = mActress;
		this.mRatings = mRatings;
	}
	
	public Movie(String mName, String mActor, double mRatings) {
		this.mName = mName;
		this.mActor = mActor;
		this.mRatings = mRatings;
	}
	
	Movie(){}

	public void display() {
		System.out.println("MOVIE DETAILS: ");
		System.out.println("Movie Name: "+mName);
		System.out.println("Movie Actor: "+mActor);
		System.out.println("Movie Actress: "+mActress);
		System.out.println("Movie Rating: "+mRatings);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
}
