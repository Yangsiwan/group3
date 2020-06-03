package game;
import java.util.*;

public class Store {
	static Scanner sc = new Scanner(System.in);
    static boolean winner = false;
    private static boolean succ = false;
   public static void show() throws InterruptedException {
	   System.out.println("==============================[Store]==============================");
	   Thread.sleep(500);
	   System.out.println("SaeSeom : This is a store in Handong University.");
	   Thread.sleep(500);
	   System.out.println("SaeSeom : I'm hungry, so let's buy snacks one by one.");
	   Thread.sleep(500);
	   System.out.println("SaeSeom : But you know what?");
	   Thread.sleep(500);
	   System.out.println("SaeSeom : There's a culture here called card-picking! Everybody give me a credit card!");
	   Thread.sleep(500);
	   System.out.println("SaeSeom : The loser of rock-paper-scissors take the card and ask the cashier to choose it!");
	   Thread.sleep(500);
	   rsp();
   }
   public static void rsp() throws InterruptedException {
	   System.out.println("========================[Rock Scissor Paper]========================");
	   System.out.println("\n==========================");
	   System.out.println("1.Rock 2.Scissor 3.Paper");
	   System.out.println("==========================");
	   while(true) {
       System.out.print("Enter the number :");
       int com = 0;
       int user = sc.nextInt();
       Random r =new Random();
       com = r.nextInt(3)+1; 
       System.out.println(Character.getName()+":"+user);
       System.out.println("Saesom : "+com);
       if(user == 1) {
              if(com == 2) {
                     System.out.println("Win");
                     winner = true;
                     break;
        
              }
              else if(com == 3) {
                     System.out.println("Lose");
                     break;
              }
              else {
            	  System.out.println("Draw");
           	      System.out.println("Again!");  
              }
       }
       else if(user == 2) {
              if(com == 3) {
                     System.out.println("Win");
                     winner = true;
                     break;
              }
              else if(com == 1){
                     System.out.println("Lose");
                     break;
              }
              else {
            	  System.out.println("Draw");
           	      System.out.println("Again!");  
              }
       }
       else if(user == 3) {
              if(com == 2) {
                     System.out.println("Lose");
                     break;
              }
              else if (com == 1){
                     System.out.println("Win");
                     winner = true;
                     break;
              }
              else {
            	  System.out.println("Draw");
           	      System.out.println("Again!");  
              }
       }
       else {
              System.out.println("Enter again!");
       }   
      }
	   
	  if(winner) {
		  System.out.print("\nSaeSeom goes to the cashier.");
		  Thread.sleep(1000);
		  System.out.print(".");
		  Thread.sleep(1000);
		  System.out.print(".\n");
		  Thread.sleep(1000);
		  System.out.println("SaeSeom : The cashier is angry!");
		  Thread.sleep(1000);
		  System.out.println("SaeSeom : I think you should go to the cashier!");
		  Thread.sleep(1000);
		  Cashier.entry();
	  }
	  else {
		  System.out.print("\nGo to cashier.");
		  Thread.sleep(1000);
		  System.out.print(".");
		  Thread.sleep(1000);
		  System.out.print(".\n");
		  Thread.sleep(1000);
		  Cashier.entry();
	  }
    }
   public static boolean success() {
	   if(Cashier.success()) {
	    	succ = true;
	    }
	   return succ;
   }
   }
