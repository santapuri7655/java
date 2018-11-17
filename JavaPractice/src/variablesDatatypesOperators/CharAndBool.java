package variablesDatatypesOperators;

public class CharAndBool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myFirstVar = 20d;
		double mySecondVar = 80d;
		double result = myFirstVar + mySecondVar;
		double multiply = result * 25;
		double rem = multiply %40;
		
		System.out.println(rem);
		
		if (rem <= 20) {
			System.out.println("Total was over the limit");
		}

	}

}
