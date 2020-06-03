package game;
import java.util.*;

public class Chunmaji {
	static Scanner sc = new Scanner(System.in);
	static int choose;
	public static void show() {
	System.out.println("==============================[Chunmaji]==============================");
	System.out.println("SaeSeom : Here is Cheonmaji.");
	System.out.println("SaeSeom :It is a quiet forest that only students of Handong University know.");
    System.out.println("SaeSeom : "+Character.getName()+", would you like to start your journey to Cheonmaji?");
    System.out.println("");
    menu();
	}
	
	public static void menu() {
	  System.out.println("\n==========================");
	  System.out.println("       1. go 2. out");
	  System.out.println("==========================");
	  System.out.print("Enter the number : ");
	  choose = sc.nextInt();
	  switch(choose) {
	   case 1 :
		  try {
			go();
		    } catch (InterruptedException e) {
			e.printStackTrace();
		    }
		  break;
	   case 2 :
		   out();
		   break;
	   case 3 :
	   default: 
		   System.out.println("\nYou have to choose between traveling or going out.");
		   menu();
	  }  
	}
	public static void go() throws InterruptedException{
		System.out.println("                                                 ");
		System.out.println("                                                 ");
		System.out.print("                        go");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		Thread.sleep(500);
		System.out.println("                                                 ");
		three();
		
	}
	public static void out() {
		System.out.println("Would you like to give up on a fun trip and really go out? (Y/N)");
		String choice = sc.next();
		if(choice.equals("Y")) {
			// go main to choose other menu
			System.out.println("Have a good time in Handong University.");
			Main.main(null);
		}
		else menu();
	}
	public static void three() throws InterruptedException {  //1. 전투 2. hp가 올라가는 강 3. trash
		if(river.success()&&attack.success()&&trash.success()) {
			System.exit(0);
		}
		System.out.println("                                                 ");
		System.out.println("==============================[Cross Road]==============================");
		System.out.println("SaeSeom : There are three crossroads.");
		System.out.println("SaeSeom : Which one would you like to choose? (You have to go all three places anyway.)");
		System.out.println("========================");
		System.out.println("1.Forward 2.Left 3.Right");
		System.out.println("========================");
		System.out.print("Enter the number : ");
		choose = sc.nextInt();
	    switch(choose) {
	     case 1 : 
	    	 if(attack.success()==false) attack.entry();
				else {
					System.out.println("\nYou already success the game.");
				    three();
				}
	    	break;
	     case 2 :
				if(river.success()==false) river.show();
				else {
					System.out.println("\nYou already success the game.");
				    three();
				}
	    	break;
	     case 3 :
				if(trash.success()==false) trash.show();
				else {
					System.out.println("\nYou already success the game.");
				    three();
				}
	    	break;
	     default : 
	    	 System.out.println("You have to win all the games to get out.");
	    	 three();
	    }  
	 }

   }
