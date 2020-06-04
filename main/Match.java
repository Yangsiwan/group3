package main;

import java.util.*;

public class Match {
	Scanner key = new Scanner(System.in);
	Random ran = new Random();
	int team1 = 0, team2 = 0;
	String check = null;
	String predict = null;
	String output;

	//Game 1 method
	boolean Game1() {
		System.out.println("\n[Match 1]\n");
		System.out.println("Vision vs Bethel");
		System.out.println("----------------------------");
		System.out.println("| Status | Vision | Bethel |");
		System.out.println("----------------------------");
		System.out.println("|  F  W  |   98   |   75   |");
		System.out.println("|  M  F  |   92   |   85   |");
		System.out.println("|  D  F  |   95   |   79   |");
		System.out.println("----------------------------");
		System.out.println("|  TOTAL |   95   |   80   |");
		System.out.println("----------------------------");
		System.out.println("Which team you think will win?");
		
		//It continues to ask the right answers.
		while(true) {
			System.out.print("Team name: ");
			predict = key.next();
			if(!predict.equals("Vision") && !predict.equals("Bethel"))
				System.out.println("Wrong name!");
			else break;
		}
		
		//It generates random numbers based on teams' abilities.
		while(true) {
			team1 = ran.nextInt(7); //generates random number between 0~6
			team2 = ran.nextInt(1); //generates random number between 0~1
			//checks if it draws.
			if(team1 != team2) break;
		}
		
		//When team1 wins.
		if(team1 > team2) {
			check = "Vision";
			try {
				System.out.println("\nMatch has begun!");
				Thread.sleep(800);
				System.out.println("Vision has been pushing us since the beginning of the game.");
				Thread.sleep(800);
				System.out.println("Vision players look very good today.");
				Thread.sleep(800);
				System.out.println("Oh, they have made a chance!");
				Thread.sleep(800);
				System.out.println("Free space... one-on-one chance!");
				Thread.sleep(800);
				System.out.println("shoot!!!");
				Thread.sleep(800);
				System.out.println("Goal!!! Goal!!! Vision scores!");
				Thread.sleep(800);
				System.out.println("Matching");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(700);
				System.out.println("....");
				Thread.sleep(700);
				System.out.println("The game is over! Nothing unusual happened.");
				Thread.sleep(500);
				System.out.println("Vision: " + team1 + " Bethel: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return false ;
			}
			System.out.println("Vision finally wins.\n.\n.\n.");
		}
		
		//when team2 wins.
		if (team1 < team2) {
			check = "Bethel";
			try {
				System.out.println("\nMatch has begun!");
				Thread.sleep(800);
				System.out.println("Vision has been pushing us since the beginning of the game.");
				Thread.sleep(800);
				System.out.println("There's a big difference between the two teams. It's not an easy game for Bethel.");
				Thread.sleep(800);
				System.out.println("Oh, they have made a chance!");
				Thread.sleep(800);
				System.out.println("Free space... one-on-one chance!\r\n");
				Thread.sleep(800);
				System.out.println("shoot!!!");
				Thread.sleep(800);
				System.out.println("Goal!!! Goal!!! Bethel have scored!");
				Thread.sleep(800);
				System.out.println("This is futsal. The ball is round, so you have to go all the way to find out.");
				Thread.sleep(800);
				System.out.println("Bethel players are flying around today!");
				Thread.sleep(800);
				System.out.println("Matching");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("The game is over! A miracle has happened!");
				Thread.sleep(500);
				System.out.println("Vision: " + team1 + " Bethel: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return false ;
			}
			System.out.println("Bethel is taking the victory.\n.\n.\n.");
		}
		
		//If users' input and team's name are same.
		if(predict.equals(check)) {
			System.out.println("Your prediction is correct!\n");
			return true;
		}
		else {
			System.out.println("Your prediction is wrong...\n");
			return false;
		}
	}
		
	boolean Game2() {
		System.out.println("\n[Match 2]\n");
		System.out.println("Lothem vs Creation");
		System.out.println("----------------------------");
		System.out.println("| Status | Lothem |Creation|");
		System.out.println("----------------------------");
		System.out.println("|  F  W  |   90   |   85   |");
		System.out.println("|  M  F  |   80   |   85   |");
		System.out.println("|  D  F  |   94   |   85   |");
		System.out.println("----------------------------");
		System.out.println("|  TOTAL |   88   |   85   |");
		System.out.println("----------------------------");
		System.out.println("Which team you think will win?");
		while(true) {
			System.out.print("Team name: ");
			predict = key.next();
			if(!predict.equals("Lothem") && !predict.equals("Creation"))
				System.out.println("Wrong name!");
			else break;
		}
		
		while(true) {
			team1 = ran.nextInt(5); //generates random number between 0~4
			team2 = ran.nextInt(3); //generates random number between 0~2
			if(team1 != team2) break;
		}
		
		if(team1 > team2) {
			check = "Lothem";
			try {
				System.out.println("\nMatch has begun!");
				Thread.sleep(800);
				System.out.println("Both teams have similar performance. I have no idea who will win.");
				Thread.sleep(800);
				System.out.println("Both teams are doing their best.");
				Thread.sleep(800);
				System.out.println("They are getting ready for corner kick.");
				Thread.sleep(800);
				System.out.println("Cross.");
				Thread.sleep(800);
				System.out.println("Header!!!");
				Thread.sleep(800);
				System.out.println("Goal!!! Goal!!! Lothem scores successfully!");
				Thread.sleep(800);
				System.out.println("Matching");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("Match is over. It was the best game ever.");
				Thread.sleep(500);
				System.out.println("Lothem: " + team1 + " Creation: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return false ;
			}
			System.out.println("Lothem finally wins.\n.\n.\n.");
		}
		
		if (team1 < team2) {
			check = "Creation";
			try {
				System.out.println("\nMatch has begun!");
				Thread.sleep(800);
				System.out.println("Both teams have similar performance. I have no idea who will win.");
				Thread.sleep(800);
				System.out.println("Both teams are doing their best.");
				Thread.sleep(800);
				System.out.println("They are getting ready for corner kick.");
				Thread.sleep(800);
				System.out.println("Cross.");
				Thread.sleep(800);
				System.out.println("Header!!!");
				Thread.sleep(800);
				System.out.println("Goal!!! Goal!!! Creation scores successfully!");
				Thread.sleep(800);
				System.out.println("Matching");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("Match is over. It was the best game ever.");
				Thread.sleep(500);
				System.out.println("Lothem: " + team1 + " Creation: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return false ;
			}
			System.out.println("Creaion finally wins.\n.\n.\n.");
		}
		
		if(predict.equals(check)) {
			System.out.println("Your prediction is correct!\n");
			return true;
		}
		else {
			System.out.println("Your prediction is wrong...\n");
			return false;
		}
	}
	
	boolean Game3() {
		System.out.println("\n[Match 3]\n");
		System.out.println("Grace vs International");
		System.out.println("----------------------------");
		System.out.println("| Status | Grace  |  Int.  |");
		System.out.println("----------------------------");
		System.out.println("|  F  W  |   99   |   88   |");
		System.out.println("|  M  F  |   80   |   89   |");
		System.out.println("|  D  F  |   82   |   93   |");
		System.out.println("----------------------------");
		System.out.println("|  TOTAL |   87   |   90   |");
		System.out.println("----------------------------");
		System.out.println("Which team you think will win?");
		while(true) {
			System.out.print("Team name: ");
			predict = key.next();
			if(!predict.equals("Grace") && !predict.equals("International"))
				System.out.println("Wrong name!");
			else break;
		}
		
		while(true) {
			team1 = ran.nextInt(4); //generates random number between 0~3
			team2 = ran.nextInt(6); //generates random number between 0~5
			if(team1 != team2) break;
		}
		
		if(team1 > team2) {
			check = "Grace";
			try {
				System.out.println("\nMatch has begun!");
				Thread.sleep(800);
				System.out.println("Both teams have similar performance. I have no idea who will win.");
				Thread.sleep(800);
				System.out.println("Both teams are doing their best.");
				Thread.sleep(800);
				System.out.println("They are getting ready for corner kick.");
				Thread.sleep(800);
				System.out.println("Oops, there is an foul.");
				Thread.sleep(800);
				System.out.println("They Grace is preparing penalty kick.");
				Thread.sleep(800);
				System.out.println("Shoot!");
				Thread.sleep(800);
				System.out.println("Goal!!! Goal!!! Grace scores successfully!");
				Thread.sleep(800);
				System.out.println("Matching");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("Match is over. It was the best game ever.");
				Thread.sleep(500);
				System.out.println("Grace: " + team1 + " International: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return false ;
			}
			System.out.println("Grace finally wins.\n.\n.\n.");
		}
		
		if (team1 < team2) {
			check = "International";
			try {
				System.out.println("\nMatch has begun!");
				Thread.sleep(800);
				System.out.println("Both teams have similar performance. I have no idea who will win.");
				Thread.sleep(800);
				System.out.println("Both teams are doing their best.");
				Thread.sleep(800);
				System.out.println("They are getting ready for corner kick.");
				Thread.sleep(800);
				System.out.println("Oops, there is an foul.");
				Thread.sleep(800);
				System.out.println("They International is preparing penalty kick.");
				Thread.sleep(800);
				System.out.println("Shoot!");
				Thread.sleep(800);
				System.out.println("Goal!!! Goal!!! International scores successfully!");
				Thread.sleep(800);
				System.out.println("Matching");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("....");
				Thread.sleep(800);
				System.out.println("Match is over. It was the best game ever.");
				Thread.sleep(500);
				System.out.println("Grace: " + team1 + " International: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return false ;
			}
			System.out.println("International finally wins.\n.\n.\n.");
		}
		if(predict.equals(check)) {
			System.out.println("Your prediction is correct!\n");
			return true;
		}
		else {
			System.out.println("Your prediction is wrong...\n");
			return false;
		}
	
	}
}
