public class Program {
	public static void main(String[] args) 
  {
    Chair round = new Chair(4,"white");

    round.breakLeg();
    
    House old = new House(5,"Kentron");
    
    old.Donation();

    People alot = new People(10,"Group");

    alot.spreadLove();
  }

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return factorial(n - 1) * n;
	}
}