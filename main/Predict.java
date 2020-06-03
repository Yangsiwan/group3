package main;

import java.util.*;

public class Predict {
	public static void pd(String[] args) {
		Match game = new Match();
		Scanner key = new Scanner(System.in);
		
		//Game description
		while(true) {
			int start;
			int correct = 0, wrong = 0;
			try {
				System.out.println("Welcome to Hiddink Field!!!");
				Thread.sleep(1000);
				System.out.println("\rRight now we have Handong Futsal League.");
				Thread.sleep(1000);
				System.out.println("\rYou will watch three matches.");
				Thread.sleep(1000);
				System.out.println("You need to predict which team will win the match!");
				Thread.sleep(1000);
				System.out.println("You can pass this stage, if your prediction corrects more than 2!");
				Thread.sleep(1000);
				System.out.println("Trust your gut!");
				Thread.sleep(1000);
				System.out.println("If you are ready, press 1.");
				Thread.sleep(1000);
				System.out.println("If you want to go other places, press 0.");

			}
			catch(InterruptedException e) {
				return ;
			}
			
			//Get users' opinion.
			System.out.print("Your Choice: ");
			start = key.nextInt();
			
			//If users choose 0, quit game.
			if(start == 0) break;
			
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
			
			//Shows users scores.
			System.out.println("\nResult");
			System.out.println("Correct: " + correct + " Wrong: " + wrong);
			
			//If users correct more than two games, pass the stage.
			if(correct > 1) {
				System.out.println("You pass this stage!");
				break;
			}
			else {
				System.out.println("You don't pass this stage...");
				break;
			}
		}
		System.out.println("BYE!");
	}
}

