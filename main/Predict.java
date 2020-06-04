package main;

import java.util.*;

public class Predict {
	public static void pd() {
		Match game = new Match();
		Scanner key = new Scanner(System.in);
		
		boolean choice = true;
		int correct = 0, wrong = 0;
		int start = 0;
		//Game description
		while(choice) {
			try {
				System.out.println("\nMove to Hiddink Field....\n");
				Thread.sleep(1000);
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
				System.out.println("If you want to go other places, press 0.");
			}
			catch(InterruptedException e) {
				return ;
			}
			//Get users' opinion.
			System.out.print("Your Choice: ");
			start = key.nextInt();
			
			//If users choose 0, quit game.
			if(start == 0) choice = false;
			
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
				choice = false;
			}
			
			if((correct == 0 && wrong == 0) || (correct == 3 && wrong == 0) || (correct == 2 && wrong == 1) || (correct == 1 && wrong == 2) || (correct == 0 && wrong == 3)) {
				choice = false;
			}
		}
		System.out.println("BYE!\n");
		
		if(start == 1) {
			//If users correct more than two games, pass the stage.
			if(correct > 1) {
				System.out.println("You pass this stage!\n");
			}
			else {
				System.out.println("You don't pass this stage...\n");
			}
		}
	}
}

