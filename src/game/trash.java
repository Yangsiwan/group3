package game;
import java.util.*;

public class trash {
	static Scanner sc = new Scanner(System.in);
	private static int count;
	private static boolean correct = false;
	private static boolean succ = false;
	public static boolean success(){
		return succ;
	}
	
    public static void show() throws InterruptedException {
       System.out.println("-----------------------------[Right Side of Chunmaji]-----------------------------");
	   System.out.println("");
	   System.out.println("Cleaning lady appeared!");
	   Thread.sleep(500);
	   System.out.println("");
	   System.out.println("Cleaning lady : There are so many students who throw away trash these days...");
	   Thread.sleep(1000);
	   System.out.println("Cleaning lady : You know, I'm having a hard time for cleaning...");
	   Thread.sleep(1000);
	   System.out.print("Cleaning lady : So.");
	   Thread.sleep(500);
	   System.out.print(".");
	   Thread.sleep(500);
	   System.out.println(".");
	   Thread.sleep(500);
	   System.out.println("Cleaning lady : I think I'll feel better if you get right in five chances, how many trash I picked up here today.");
	   Thread.sleep(500);
	   random_game();
   }
   public static void random_game() throws InterruptedException {
	   int r_num;
	   int a;
	   count =0;
	   r_num = (int) ((Math.random() * 50) + 1);
	   System.out.println("Cleaning lady : I'll give a hint, the range is 1-50.");
	   Thread.sleep(500);
	   while(true) {
	   if(count==5) {
		   System.out.println("Cleaning lady : I'm so sorry..."); 
		   break;
	   }
	   System.out.print("Enter the number [COUNT : "+count+" ] :");
	   a=sc.nextInt();
	   count++;
	   if (a < 1 || a > 50) {
			System.out.println("Cleaning lady : Check the hint!");
		}  else if (a > r_num) {
			System.out.println("Cleaning lady : The number should be smaller.");
		} else if (a < r_num) {
			System.out.println("Cleaning lady : The number should be larger.");
		} else {
			System.out.println("Cleaning lady : That's the answer! You guess the right answer in "+count+" chance!");
			correct = true;
			Thread.sleep(500);
			System.out.println("Cleaning lady : I feel better because You know the number of trash I cleaned up today.");
			Thread.sleep(500);
			break;
		}
	  }
	   if(correct) {  
		   System.out.println("");
		   System.out.println("[Game success]");
		   succ = true;
		   Chunmaji.three();
	   }
	   else {
		   System.out.println("");
		   System.out.println("[Game failed]");
		   Chunmaji.three();
	   }
   }
}
