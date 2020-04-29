package AssignemtnOperators;

public class RelationalOperators {

	private int a, b;
	
	
	public void compare()
	{
		if (a == b)
		{
			System.out.println("a = b");
		}
		else if (a > b)
		{
			System.out.println("a > b");
		}
		else if (a < b)
		{
			System.out.println("a < b");
		}
		
	}
	
	
	
	//Constructor 
	public RelationalOperators(int a, int b) {
		this.a = a;
		this.b = b;
	}

	//Getters and Setters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	
}
