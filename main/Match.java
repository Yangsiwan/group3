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
				System.out.println("����ʹݺ��� Vision�� ���ƺ��̰� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("���õ��� Vision������ ������� ���� ���ƺ�����.");
				Thread.sleep(1000);
				System.out.println("�� �����帮�� ���� ��ȸ�� ��������!");
				Thread.sleep(1000);
				System.out.println("�����... �ϴ��� �����Դϴ�!");
				Thread.sleep(1000);
				System.out.println("��!!!");
				Thread.sleep(1000);
				System.out.println("��!!! ���̿���!!! Vision�� ������ �����մϴ�!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("��� ����˴ϴ�! �̺��� �Ͼ�� �ʾҽ��ϴ�.");
				Thread.sleep(500);
				System.out.println("Vision: " + team1 + " Bethel: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("�ᱹ Vision�� �¸��� �������׿�.\n.\n.\n.");
		}
		
		//when team2 wins.
		if (team1 < team2) {
			check = "Bethel";
			try {
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("����ʹݺ��� Vision�� ���ƺ��̰� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("������ �������̰� �� �ְŵ��. Bethel���Դ� ���� ���� ����Դϴ�.");
				Thread.sleep(1000);
				System.out.println("�� �����帮�� ���� ��ȸ�� ��������!");
				Thread.sleep(1000);
				System.out.println("�����... �ϴ��� �����Դϴ�!");
				Thread.sleep(1000);
				System.out.println("��!!!");
				Thread.sleep(1000);
				System.out.println("��!!! ���̿���!!! Bethel ������ �����մϴ�!");
				Thread.sleep(1000);
				System.out.println("�̰� ǲ���̰ŵ��. ���� �ձ۱� ������ ������ ������ �ƴ� �̴ϴ�.");
				Thread.sleep(1000);
				System.out.println("Bethel ������ ���õ��� ����ٴϳ׿�!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("��� ����˴ϴ�! ������ �Ͼ���ϴ�!");
				Thread.sleep(500);
				System.out.println("Vision: " + team1 + " Bethel: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("Bethel���� �¸��� �������׿�.\n.\n.\n.");
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
				System.out.println("���� ����� ������ ������ �ֽ��ϴ�. �����̱��� ���� �𸣰ڽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("������� �ּ��� ���ؼ� �ٰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�� �����帮�� ���� �ڳ�ű �غ��ϰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�÷Ⱦ��.");
				Thread.sleep(1000);
				System.out.println("���!!!");
				Thread.sleep(1000);
				System.out.println("��!!! ���̿���!!! Lothem ������ �����մϴ�!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("��� ����˴ϴ�! ������� �ְ��� �����̾����ϴ�!");
				Thread.sleep(500);
				System.out.println("Lothem: " + team1 + " Creation: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("�ᱹ Lothem�� �¸��� �������׿�.\n.\n.\n.");
		}
		
		if (team1 < team2) {
			check = "Creation";
			try {
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("���� ����� ������ ������ �ֽ��ϴ�. �����̱��� ���� �𸣰ڽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("������� �ּ��� ���ؼ� �ٰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�� �����帮�� ���� �ڳ�ű �غ��ϰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�÷Ⱦ��.");
				Thread.sleep(1000);
				System.out.println("���!!!");
				Thread.sleep(1000);
				System.out.println("��!!! ���̿���!!! Lothem ������ �����մϴ�!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("��� ����˴ϴ�! ������� �ְ��� �����̾����ϴ�!");
				Thread.sleep(500);
				System.out.println("Lothem: " + team1 + " Creation: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("Creaion ���� �¸��� �������׿�.\n.\n.\n.");
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
				System.out.println("���� ����� ������ ������ �ֽ��ϴ�. �����̱��� ���� �𸣰ڽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("������� �ּ��� ���ؼ� �ٰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�� �����帮�� ���� �ڳ�ű �غ��ϰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�÷Ⱦ��.");
				Thread.sleep(1000);
				System.out.println("���!!!");
				Thread.sleep(1000);
				System.out.println("��!!! ���̿���!!! Grace ������ �����մϴ�!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("��� ����˴ϴ�! ������� �ְ��� �����̾����ϴ�!");
				Thread.sleep(500);
				System.out.println("Grace: " + team1 + " International: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("�ᱹ Grace�� �¸��� �������׿�.\n.\n.\n.");
		}
		
		if (team1 < team2) {
			check = "International";
			try {
				System.out.println("Match has begun!");
				Thread.sleep(1000);
				System.out.println("���� ����� ������ ������ �ֽ��ϴ�. �����̱��� ���� �𸣰ڽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("������� �ּ��� ���ؼ� �ٰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�� �����帮�� ���� �ڳ�ű �غ��ϰ� �ֽ��ϴ�.");
				Thread.sleep(1000);
				System.out.println("�÷Ⱦ��.");
				Thread.sleep(1000);
				System.out.println("���!!!");
				Thread.sleep(1000);
				System.out.println("��!!! ���̿���!!! International ������ �����մϴ�!");
				Thread.sleep(1000);
				System.out.println("Matching....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("....");
				Thread.sleep(1000);
				System.out.println("��� ����˴ϴ�! ������� �ְ��� �����̾����ϴ�!");
				Thread.sleep(500);
				System.out.println("Grace: " + team1 + " International: " + team2);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return true ;
			}
			System.out.println("International ���� �¸��� �������׿�.\n.\n.\n.");
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
