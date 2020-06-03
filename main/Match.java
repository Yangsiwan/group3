package main;

import java.util.*;

public class Match {
	Scanner key = new Scanner(System.in);
	Random ran = new Random();
	int team1 = 0, team2 = 0;
	String check = null;
	String predict = null;
	
	//Game 1 method
	boolean Game1() {
		System.out.println("\n[Game 1]\n");
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
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("경기초반부터 Vision이 몰아붙이고 있습니다.");
				Thread.sleep(1000);
				System.out.println("오늘따라 Vision선수들 컨디션이 아주 좋아보여요.");
				Thread.sleep(1000);
				System.out.println("아 말씀드리는 순간 기회를 만들었어요!");
				Thread.sleep(1000);
				System.out.println("빈공간... 일대일 찬스입니다!");
				Thread.sleep(1000);
				System.out.println("슛!!!");
				Thread.sleep(1000);
				System.out.println("골!!! 골이에요!!! Vision이 득점에 성공합니다!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("경기 종료됩니다! 이변은 일어나지 않았습니다.");
				Thread.sleep(500);
				System.out.println("Vision: " + team1 + " Bethel: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("결국 Vision이 승리를 가져가네요.\n.\n.\n.");
		}
		
		//when team2 wins.
		if (team1 < team2) {
			check = "Bethel";
			try {
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("경기초반부터 Vision이 몰아붙이고 있습니다.");
				Thread.sleep(1000);
				System.out.println("양팀의 전력차이가 꽤 있거든요. Bethel에게는 쉽지 않은 경기입니다.");
				Thread.sleep(1000);
				System.out.println("아 말씀드리는 순간 기회를 만들었어요!");
				Thread.sleep(1000);
				System.out.println("빈공간... 일대일 찬스입니다!");
				Thread.sleep(1000);
				System.out.println("슛!!!");
				Thread.sleep(1000);
				System.out.println("골!!! 골이에요!!! Bethel 득점에 성공합니다!");
				Thread.sleep(1000);
				System.out.println("이게 풋살이거든요. 공은 둥글기 때문에 끝까지 가봐야 아는 겁니다.");
				Thread.sleep(1000);
				System.out.println("Bethel 선수들 오늘따라 날라다니네요!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("경기 종료됩니다! 기적이 일어났습니다!");
				Thread.sleep(500);
				System.out.println("Vision: " + team1 + " Bethel: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("Bethel에서 승리를 가져가네요.\n.\n.\n.");
		}
		
		//If users' input and team's name are same.
		if(predict.equals(check)) {
			System.out.println("Your prediction is correct!");
			return true;
		}
		else {
			System.out.println("Your prediction is wrong...");
			return false;
		}
	}
		
	boolean Game2() {
		System.out.println("\n[Game 2]\n");
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
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("양팀 비슷한 경기력을 가지고 있습니다. 누가이길지 전혀 모르겠습니다.");
				Thread.sleep(1000);
				System.out.println("양팀모두 최선을 다해서 뛰고 있습니다.");
				Thread.sleep(1000);
				System.out.println("아 말씀드리는 순간 코너킥 준비하고 있습니다.");
				Thread.sleep(1000);
				System.out.println("올렸어요.");
				Thread.sleep(1000);
				System.out.println("헤딩!!!");
				Thread.sleep(1000);
				System.out.println("골!!! 골이에요!!! Lothem 득점에 성공합니다!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("경기 종료됩니다! 양팀모두 최고의 경기력이었습니다!");
				Thread.sleep(500);
				System.out.println("Lothem: " + team1 + " Creation: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("결국 Lothem이 승리를 가져가네요.\n.\n.\n.");
		}
		
		if (team1 < team2) {
			check = "Creation";
			try {
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("양팀 비슷한 경기력을 가지고 있습니다. 누가이길지 전혀 모르겠습니다.");
				Thread.sleep(1000);
				System.out.println("양팀모두 최선을 다해서 뛰고 있습니다.");
				Thread.sleep(1000);
				System.out.println("아 말씀드리는 순간 코너킥 준비하고 있습니다.");
				Thread.sleep(1000);
				System.out.println("올렸어요.");
				Thread.sleep(1000);
				System.out.println("헤딩!!!");
				Thread.sleep(1000);
				System.out.println("골!!! 골이에요!!! Lothem 득점에 성공합니다!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("경기 종료됩니다! 양팀모두 최고의 경기력이었습니다!");
				Thread.sleep(500);
				System.out.println("Lothem: " + team1 + " Creation: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("Creaion 에서 승리를 가져가네요.\n.\n.\n.");
		}
		
		if(predict.equals(check)) {
			System.out.println("Your prediction is correct!");
			return true;
		}
		else {
			System.out.println("Your prediction is wrong...");
			return false;
		}
	}
	
	boolean Game3() {
		System.out.println("\n[Game 3]\n");
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
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("양팀 비슷한 경기력을 가지고 있습니다. 누가이길지 전혀 모르겠습니다.");
				Thread.sleep(1000);
				System.out.println("양팀모두 최선을 다해서 뛰고 있습니다.");
				Thread.sleep(1000);
				System.out.println("아 말씀드리는 순간 코너킥 준비하고 있습니다.");
				Thread.sleep(1000);
				System.out.println("올렸어요.");
				Thread.sleep(1000);
				System.out.println("헤딩!!!");
				Thread.sleep(1000);
				System.out.println("골!!! 골이에요!!! Grace 득점에 성공합니다!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("경기 종료됩니다! 양팀모두 최고의 경기력이었습니다!");
				Thread.sleep(500);
				System.out.println("Grace: " + team1 + " International: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("결국 Grace이 승리를 가져가네요.\n.\n.\n.");
		}
		
		if (team1 < team2) {
			check = "International";
			try {
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("양팀 비슷한 경기력을 가지고 있습니다. 누가이길지 전혀 모르겠습니다.");
				Thread.sleep(1000);
				System.out.println("양팀모두 최선을 다해서 뛰고 있습니다.");
				Thread.sleep(1000);
				System.out.println("아 말씀드리는 순간 코너킥 준비하고 있습니다.");
				Thread.sleep(1000);
				System.out.println("올렸어요.");
				Thread.sleep(1000);
				System.out.println("헤딩!!!");
				Thread.sleep(1000);
				System.out.println("골!!! 골이에요!!! International 득점에 성공합니다!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("경기 종료됩니다! 양팀모두 최고의 경기력이었습니다!");
				Thread.sleep(500);
				System.out.println("Grace: " + team1 + " International: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("International 에서 승리를 가져가네요.\n.\n.\n.");
		}
		
		if(predict.equals(check)) {
			System.out.println("Your prediction is correct!");
			return true;
		}
		else {
			System.out.println("Your prediction is wrong...");
			return false;
		}
	
	}
}
