import java.util.*;

public class Predict {
	static boolean pass = true;
	private static int correct = 0;
	private static int start = 0;
	private static int damage = 0;
	private static int wrong = 0;
	private static int played = 0;
	
	public boolean pd() {
		Match game = new Match();
		Scanner key = new Scanner(System.in);


		//Game description
		while(pass) {
			try {
				System.out.println("\nMove to Hiddink Field....\n");
				Thread.sleep(1000);
				System.out.println("Hi, [" + Character.getName() + "]!");
				System.out.println("Welcome to Hiddink Field!!!");
				Thread.sleep(1000);
				System.out.println("Right now we have Handong Futsal League.");
				System.out.println("You will watch three matches.");
				System.out.println("You need to predict which team will win the match!");
				Thread.sleep(1000);
				System.out.println("You can pass this stage, if your prediction corrects more than 2!");
				System.out.println("Trust your gut!");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("If you are ready, press 1.");
				System.out.println("If you want to leave, press 0.");
			}
			catch(InterruptedException e) {
				return false;
			}
			while(true){
				//Get users' opinion.
				System.out.print("Your Choice: ");
				start = key.nextInt();
				
				if(start > 1 || start < 0){
					System.out.println("\nWrong input!");
				}
				if(start == 1 || start == 0)break;
			}

			//If users choose 0, quit game.
			if(start == 0){
				break;
			}
			//If users choose 1, It calls Game class
			if(start == 1) {
				System.out.println("Good Choice!");
				if(game.Game1()) correct++;
				else wrong++;
				if(game.Game2()) correct++;
				else wrong++;
				if(game.Game3()) correct++;
				else wrong++;
			}
			
			if(start == 1) {
				//Shows users scores.
				System.out.println("Result");
				System.out.println("Correct: " + correct + " Wrong: " + wrong);
				pass = false;
			}
			
			if((correct == 0 && wrong == 0) || (correct == 3 && wrong == 0) || (correct == 2 && wrong == 1) || (correct == 1 && wrong == 2) || (correct == 0 && wrong == 3)) {
				pass = false;
			}
		}

		if(start == 1 && correct > 1) {
			damage = 0;
			Character.growHp(-damage);
			return true;
		}
		else if(start == 1 && correct < 2){
			if(played == 0){
				damage = 5;
				Character.growHp(-damage);
				played++;
			}
			return false;
		}
		return false;
	}
}

