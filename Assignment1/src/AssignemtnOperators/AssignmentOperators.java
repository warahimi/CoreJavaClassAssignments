package AssignemtnOperators;

public class AssignmentOperators
{
		private int a = 100;
		private int b = 20;
		
		//+=
		public void plusEqual()
		{
		a += b;
		System.out.println("a += b : " +a);
		}
		
		//-=
		public void minusEqual()
		{
		a -= b;
		System.out.println("a -= b : " +a);
		}
		
		// /=
		public void divisionEqual()
		{
		a /= b;
		System.out.println("a /= b : " +a);
		}
		
		//*=
		public void multiplyEqual()
		{
		a *= b;
		System.out.println("a *= b : " +a);
		}
		
		//%=
		public void modEqual()
		{
		a %= b;
		System.out.println("a %= b : " +a);
		}
		
		//  //=
		public void Equal()
		{
		a = b;
		System.out.println("a = b : " +a);
		}
	 
	//Getter and Setter 
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
