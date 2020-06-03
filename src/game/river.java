package game;

public class river {
	public static boolean succ = false;
	
   public static void show() throws InterruptedException {
	     System.out.println("==========================[Left Side of Chunmaji]==========================");
		System.out.println("SaeSeom : This is where the river flows...");
		Thread.sleep(1000);
	    System.out.println("SaeSeom : Many Handong University students heal by watching the river.");
	    Thread.sleep(1000);
	    System.out.println("You're healing, and your HP goes up to 100.");
	    Thread.sleep(1000);
	    Character.growHp(100);
	    System.out.println("");
	    System.out.println("Now, your HP is "+ Character.getHp()+".");
	    succ = true;
	    Chunmaji.three();
   }
   public static boolean success() {
	   return succ;
   }
}
