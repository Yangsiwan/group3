package main;

import java.util.Scanner;

public class Main {

	static String name;
	static int hp=10;
	static int [] clear= new int [10];
	static String [] Sname= {"학관","오석관","뉴턴홀","현동홀","매점","알파서점","천마지","GLC","채플","히딩크필드"};
	
	public static void main(String[] args) { 
		 int check=1;
		 
		 
		 
		 int menu;
		 try (Scanner scn = new Scanner(System.in)) {
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
			 for(;1==check()||hp>0;) {
				 System.out.println("Where should we go?");
				 System.out.println("0 : Save");
				 for(int i=0;i<10;i++)
					 if(clear[i]==0)
						 System.out.println(i+1+" : "+Sname[i]);							 
				menu=scn.nextInt();
				menu--;
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
						//clear[menu]=1;
						//System.out.println(hp);
						 break;
					 case 1: //각 게임
						 break;
					 case 2: //각 게임
						 
						 break;
					 case 3: //각 게임
						 break;
					 case 4: //각 게임
						 break;
					 case 5: //각 게임
						 TicTac tic = new TicTac();
						 tic.tt(args);
						 break;
					 case 6: //각 게임
						 break;
					 case 7: //각 게임
						 break;
					 case 8: //각 게임
						 break;
					 case 9: //각 게임
						 Predict predict = new Predict();
						 predict.pd(args);
						 break;
				}
				 
			 }
			 if(hp<0) {
				 System.out.println("Game is over");
			 }
		}
	 }
	 public	static int check() {
		 for(int i=0;i<10;i++) {
			 if(clear[i]==0)
			 return 1;
		 }
		 return 0;
	 }
}
