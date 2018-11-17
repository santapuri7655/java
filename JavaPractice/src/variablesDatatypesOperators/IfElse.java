package variablesDatatypesOperators;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameOver = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		
		if (score < 10000 && score > 1000)
		{
			System.out.println("Your score was less than 10000 but greater than 1000");
		} 
		else if (score < 1000)
		{
			System.out.println("your score is less than 1000");
		}
		else
		{
			System.out.println("you got here");
		}
		
		if (gameOver) 
		{
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your score is: "+ finalScore);
		}

	}

}
