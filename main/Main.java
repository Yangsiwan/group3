package main;

import java.util.Scanner;

public class Main {
	static String name;
	static int hp=10;
	static int [] clear= new int [10];
	static String [] Sname= {"GLC","Hyoam Chaple","Cheonmaji","Store","Alpha Stationery","Student Union","Hiddink Field","Oseok Hall","Newton Hall","Hyundong Hall"};
	 public static void menu() {
		   System.out.println("===================[MAP]================");
		   System.out.println("| -----    -----                       |");
		   System.out.println("|| (8) |  | (9) |                      |");
		   System.out.println("| -----    -----                       |");
		   System.out.println("| -----       -------                  |");
		   System.out.println("|| (7) |     |  (10) |        -----    |");
		   System.out.println("| -----       -------        | (1) |   |");
		   System.out.println("| -----                       -----    |");
		   System.out.println("||     | ----                 -----    |");
		   System.out.println("|| (6) || (5)|               |     |   |");
		   System.out.println("| -----  ----                | (2) |   |");
		   System.out.println("|     -----                  |     |   |");
		   System.out.println("|    | (4) |   -----------    -----    |");
		   System.out.println("|     -----   |           |            |");
		   System.out.println("|             |    (3)    |            |");
		   System.out.println("========================================");
	   }
	public static void main(String[] args) { 
		 int check=1;
		 
		 int menu;
		 try (Scanner scn = new Scanner(System.in)) {
			System.out.println("========================================");
			System.out.println("Welcome to Your Hanst!!");
			 System.out.printf("Please type your name:");
			 while(check==1) {
				 name=scn.nextLine();
				 System.out.println("Your name is \""+name+"\" right? (0:Yes 1:No)");
				 check=scn.nextInt();
				 if(check==0) {
					 System.out.println("Okay.");
					 break;
				 }else if(check==1)
					 System.out.println("Please re-enter your name.");
				 else
					 System.out.println("You Typed Wrong Number!");
			 }
			 Character ch = new Character(name,hp); //set name, hp
			 System.out.println("Name : "+ch.getName()+"Hp :"+ch.getHp());
			 for(;1==check()||hp>0;) {
				 System.out.println("Where should we go?");
				 System.out.println("0 : Save");
				 for(int i=0;i<10;i++)
					 if(clear[i]==0)
						 System.out.println(i+1+" : "+Sname[i]);
			    menu();
				menu=scn.nextInt();
				//menu--;
				System.out.println(menu);
				if(menu>9||menu<-1) {
					System.out.println("You Typed Wrong Number!");
					System.out.println("Please re-enter.");
				}else if(clear[menu]==1) {
					System.out.println("It is Already Cleared!!");
					System.out.println("Please re-enter.");
				}
				switch(menu) {
					case -1: //save();
						 break;
					case 0:
						//Ccgame c=new Ccgame(hp);
						//hp=- c.cgame();
						clear[menu]=1;
						System.out.println(hp);
						 break;
					 case 1: 
						 break;
					 case 2: //�� ����
						 break;
					 case 3: 
						 break;
					 case 4: //�� ����
						 break;
					 case 5: //�� ����
						 TicTac tic = new TicTac();
						 tic.tt();
						 break;
					 case 6: //�� ����
						 break;
					 case 7: //�� ����
						 Predict predict = new Predict();
						 predict.pd();
						 break;
					 case 8: //�� ����
						 break;
					 case 9: //�� ����
						 break;
				}
				 
			 }
			 if(hp<0) {
				 System.out.println("Game is over");
			 }
		}
	 }
	 public static void gameover() {
		 System.out.println("\nGame over");
		 System.exit(0);
	 }
	 public	static int check() {
		 for(int i=0;i<10;i++) {
			 if(clear[i]==0)
			 return 1;
		 }
		 return 0;
	 }
}
