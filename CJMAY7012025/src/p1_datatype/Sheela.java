package p1_datatype;
class Sheela 
{
	public static void main(String[] args) 
	{
		int totalAmount = 500; //Total Amount available with sheela
		
		int chocoPrice  = 10;  //Price of each chocolate
		
		int totalFriends = 5;  //Total number of friends
		
		int chocolatesPurch = totalAmount / chocoPrice;
			
		System.out.println("Total number of chocolates purchased: "+chocolatesPurch);
		
		int numOfChocoPerFriend = chocolatesPurch / totalFriends;
		
		System.out.println("Total number of chocolates per friend: "+numOfChocoPerFriend);
	}
}
