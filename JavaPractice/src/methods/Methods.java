package methods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean gameOver = false;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		calculateScore(gameOver, score, levelCompleted, bonus);

	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
	{
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score is:" + finalScore);
			return finalScore;
		}
		else
		{
			System.out.println("game is in progress and your score is " + score);
			return score;
		}
	}

}
