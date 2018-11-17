package methods;

public class displayHighScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int playerScore = 2000;
		String playerName = "Rick";
		
		int position = displayHighScorePosition(playerName, playerScore);
		System.out.println(playerName + " managed to get into position " + position);
	
	}
	
	public static int displayHighScorePosition(String playerName, int playerScore) {
		
		if (playerScore > 1000) {
			System.out.println(playerName + " score is greater than 1000");
			return 1;
		}
		else if (playerScore > 500 && playerScore < 1000) {
			System.out.println(playerName +" Score is greater than 500 but less than 1000");
			return 2;
		}
		else if (playerScore > 100 && playerScore < 500) {
			System.out.println(playerName + " Score is greater than 100 and less than 500");
			return 3;
		}
		else {
			System.out.println("All the other cases");
			return 4;
		}
		
		
	}

}
