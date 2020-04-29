package AssignemtnOperators;

public class MainClass {

	public static void main(String[] args) {
		AssignmentOperators obj = new AssignmentOperators();
		System.out.println("a = "+obj.getA());
		System.out.println("b = "+obj.getB());
		System.out.println("-----------------");
		obj.plusEqual();
		obj.minusEqual();
		obj.multiplyEqual();
		obj.modEqual();
		obj.divisionEqual();
		obj.Equal();
		
		System.out.println("-----------------");
		RelationalOperators ro = new RelationalOperators(10, 20);
		ro.compare();
		
		TernaryOperator tr = new TernaryOperator();
		System.out.println(tr.c);

	}

}
