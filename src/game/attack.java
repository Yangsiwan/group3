package game;
import java.util.*;

public class attack {
	public static int Rows = 10;
    public static int Cols = 10;
    public static int playerMembers;
    public static int computerMembers;
    public static String[][] grid = new String[Rows][Cols];
    public static int[][] missedGuesses = new int[Rows][Cols];
	private static boolean succ = false;
	public static int time;
	private static Scanner input;
	static String timerBuffer; // 04:11:15 등의 경과 시간 문자열이 저장될 버퍼 정의
    static int oldTime;
	   public static boolean success(){
		  return succ;
	   }
        public static void entry() throws InterruptedException {
        	Main.main(null);
        }
	    public static void main(String[] args) throws InterruptedException {
	    	System.out.println("-----------------------------[Forward of Chunmaji]-----------------------------");
			Thread.sleep(500);
			System.out.println("===============================================================================");
			System.out.println("                           Wild Boar appeared!");
			System.out.println("===============================================================================");
			Thread.sleep(500);
		    System.out.println("You can't run away. You have to fight.");
		    System.out.println("\n* Rule");
		    System.out.println(" *  A player will place 5 of their member on a 10 by 10 grid.\n" + 
		    		" *  The computer player will deploy five members on the same grid.\n" + 
		    		" *  Once the game starts the player and computer take turns,\n" + 
		    		" *  trying to attack each other's members by guessing in 5 seconds.\n" + 
		    		" *  The game ends when either the player or computer has no members left.\n"+
		    		" *  If you mistyped the coordinates or exceeded 5 seconds, the number of boars increases.\n\n"+
		    		"================================================================\n"
		    		+ "@ Player x WildBoar * Killed Player ! Killed WildBoar - missed\n"+
		    		"================================================================\n");
		    Thread.sleep(500);
	    	 //Step 1 – Create the ocean map
	        createMap();

	        //Step 2 – Deploy player’s members
	        deployMember();

	        //Step 3 - Deploy computer's members
	        deployWildBoarMember(5);

	        //Step 4 Battle
	        do {
	            Battle();
	        }while(attack.playerMembers != 0 && attack.computerMembers != 0 &&attack.computerMembers!=15);

	        //Step 5 - Game over
	        gameOver();
	    }
	    
	    public static void createMap(){
	        //First section of Ocean Map
	        System.out.print("  ");
	        for(int i = 0; i < Cols; i++)
	                System.out.print(i);
	        System.out.println();

	        //Middle section of Ocean Map
	        for(int i = 0; i < grid.length; i++) {
	            for (int j = 0; j < grid[i].length; j++) {
	                grid[i][j] = " ";
	                if (j == 0)
	                    System.out.print(i + "|" + grid[i][j]);
	                else if (j == grid[i].length - 1)
	                    System.out.print(grid[i][j] + "|" + i);
	                else
	                    System.out.print(grid[i][j]);
	            }
	            System.out.println();
	        }

	        //Last section of Map
	        System.out.print("  ");
	        for(int i = 0; i < Cols; i++)
	            System.out.print(i);
	        System.out.println();
	    }
	    
	    public static void deployMember(){  //유저의멤버를 좌표 상에 놓는다.
	        input = new Scanner(System.in);

	        System.out.println("\nDeploy your members:");
	        //Deploying five ships for player
	        attack.playerMembers = 5;
	        for (int i = 1; i <= attack.playerMembers; ) {
	            System.out.print("Enter X coordinate for your " + i + " member: ");
	            int x = input.nextInt();
	            System.out.print("Enter Y coordinate for your " + i + " member: ");
	            int y = input.nextInt();

	            if((x >= 0 && x < Rows) && (y >= 0 && y < Cols) && (grid[x][y] == " "))
	            {
	                grid[x][y] =   "@";
	                i++;
	            }
	            else if((x >= 0 && x < Rows) && (y >= 0 && y < Cols) && grid[x][y] == "@")
	                System.out.println("Already your member placed in this space.");
	            else if((x < 0 || x >= Rows) || (y < 0 || y >= Cols))
	                System.out.println("You can't place members outside the " + Rows + " by " + Cols + " grid");
	        }
	        printMap();
	    }
	    
	    public static void deployWildBoarMember(int num){ //랜덤으로 멧돼지의 좌표를 놓는다.
	        System.out.println("\nWildBoar is deploying members");
	        //Deploying five ships for computer
	        attack.computerMembers +=num;
	        for (int i = 1; i <= num; ) {
	            int x = (int)(Math.random() * 10);
	            int y = (int)(Math.random() * 10);

	            if((x >= 0 && x < Rows) && (y >= 0 && y < Cols) && (grid[x][y] == " "))
	            {
	                grid[x][y] = "x";
	                i++;
	            }
	        }
	        System.out.println("Members of WildBoar DEPLOYED");
	        printMap();
	    }

	    public static void Battle(){  //배틀시작
	        playerTurn();
	        computerTurn();

	        printMap();

	        System.out.println();
	        System.out.println("Your members: " + attack.playerMembers + " | WildBoar members: " + attack.computerMembers);
	        System.out.println();
	    }
	    public static void stopwatch(int onOff) {
	        if (onOff == 1) // 타이머 켜기
	          oldTime = (int) System.currentTimeMillis() / 1000;

	        if (onOff == 0) // 타이머 끄고, 시분초를 timerBuffer 에 저장
	          secToHHMMSS(  ((int) System.currentTimeMillis() / 1000) - oldTime  );
	     

	      }
	    public static void secToHHMMSS(int secs) {
	        int hour, min, sec;
            time = secs % 60;
	        sec  = secs % 60;
	        min  = secs / 60 % 60;
	        hour = secs / 3600;

	        timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
	      }
	    
	    public static void playerTurn(){ // 유저의 차례
	        System.out.println("\nYOUR TURN");
	        stopwatch(1);
	        int x = -1, y = -1;
	        do {
	            System.out.print("Enter X coordinate: ");
	            x = input.nextInt();
	            System.out.print("Enter Y coordinate: ");
	            y = input.nextInt();
                stopwatch(0);
                System.out.format("* time: [%s]%n", timerBuffer);
                if(time > 5) {
                	System.out.println("Time is over!");
                	deployWildBoarMember(1);
                    
                    break;
                }
                
	            if ((x >= 0 && x < Rows) && (y >= 0 && y < Cols)) //valid guess
	            {
	                if (grid[x][y] == "x") //if wildboar is already there
	                {
	                    System.out.println("Boom! You attack one of the WildBoar!");
	                    grid[x][y] = "!"; //Hit mark
	                    --attack.computerMembers;
	                }
	                else if (grid[x][y] == "@") { // if your's member is already there
	                    System.out.println("Oh no, you attack your member :(");
	                    grid[x][y] = "*";
	                    --attack.playerMembers;
	                }
	                else if (grid[x][y] == " ") { //if you missed
	                    System.out.println("Sorry, you missed");
	                    deployWildBoarMember(1);
	                    grid[x][y] = "-";
	                }
	            }
	            else if ((x < 0 || x >= Rows) || (y < 0 || y >= Cols))  //invalid guess
	                System.out.println("You can't place ships outside the " + Rows + " by " + Cols + " grid");
	        }while((x < 0 || x >= Rows) || (y < 0 || y >= Cols));  //keep re-prompting till valid guess
	    }
	    
	    public static void computerTurn(){
	        System.out.println("\nCOMPUTER'S TURN");
	        //Guess co-ordinates
	        int x = -1, y = -1;
	        do {
	            x = (int)(Math.random() * 10);
	            y = (int)(Math.random() * 10);

	            if ((x >= 0 && x < Rows) && (y >= 0 && y < Cols)) //valid guess
	            {
	                if (grid[x][y] == "@") //if player's member is already there; 
	                {
	                    System.out.println("The WildBoar attack one of your members!");
	                    grid[x][y] = "*";
	                    --attack.playerMembers;
	                }
	                else if (grid[x][y] == "x") { // if wildboar's member is already there
	                    System.out.println("The WildBoar attack its member!");
	                    grid[x][y] = "!";
	                    --attack.computerMembers;
	                }
	                else if (grid[x][y] == " ") { // if wildboar missed
	                    System.out.println("WildBoar missed");
	                    //Saving missed guesses for computer
	                    if(missedGuesses[x][y] != 1)
	                        missedGuesses[x][y] = 1;
	                }
	            }
	        }while((x < 0 || x >= Rows) || (y < 0 || y >= Cols));  //keep re-prompting till valid guess
	    }
	    
	    public static void gameOver() throws InterruptedException{ //game over
	        System.out.println("Your members: " + attack.playerMembers + " | WildBoar members: " + attack.computerMembers);
	        if(attack.playerMembers > 0 && attack.computerMembers <= 0) {
	            System.out.println("Wow! You won the battle :)");
	            succ = true;
	        }
	        else {
	            System.out.println("Sorry, you lost the battle");
	            Character.growHp(-50);
	            System.out.println("Your Hp decrease 50.");
	 		    System.out.println("Now, your HP is "+ Character.getHp()+".");
	        }
	        System.out.println();
	        Chunmaji.three();
	   }
	    
	    public static void printMap(){
	        System.out.println();
	        //First section of Map
	        System.out.print("  ");
	        for(int i = 0; i < Cols; i++)
	            System.out.print(i);
	        System.out.println();

	        //Middle section of  Map
	        for(int x = 0; x < grid.length; x++) {
	            System.out.print(x + "|");

	            for (int y = 0; y < grid[x].length; y++){
	                System.out.print(grid[x][y]);
	            }

	            System.out.println("|" + x);
	        }

	        //Last section of Map
	        System.out.print("  ");
	        for(int i = 0; i < Cols; i++)
	            System.out.print(i);
	        System.out.println();
	    }
	    
}
	
