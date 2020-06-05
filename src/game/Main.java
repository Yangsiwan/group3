import java.util.*;

class Main {
static String name;
  static int hp = 50;
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
			 System.out.printf("Please type your name: ");
			 while(check==1) {
				 name=scn.nextLine();
				 System.out.println("Your name is \""+name+"\" right? (0:Yes 1:No)");
				 check=scn.nextInt();
				 if(check==0) {
					 System.out.println("Okay.\n");
					 break;
				 }else if(check==1)
					 System.out.println("Please re-enter your name.");
				 else
					 System.out.println("You Typed Wrong Number!");
			 }
			 Character ch = new Character(name,hp); //set name, hp
			 System.out.println("Name : "+Character.getName()+"\nHp : "+Character.getHp());
			 for(;1==check()||Character.getHp()>0;) {
				 System.out.println("\nWhere should we go?");
				 System.out.println("0 : Save");
				 for(int i=0;i<10;i++)
					 if(clear[i]==0)
						 System.out.println(i+1+" : "+Sname[i]);
			    menu();
				System.out.print("Select place: ");
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
					case 0:
                		//SAVE
						break;
					case 1: //GLC
						hangman h=new hangman();
						h.game();
						break;
					case 2: //Hyoam Chpel
						Bible b=new Bible();
						b.game();
						break;
					case 3: //Cheonmaji
					 	Chunmaji.show();
						break;
					case 4: //Store
						Store.show();
						break;
					case 5: //Alpha Store
					 	TicTac tic = new TicTac();
						tic.tt();
						ch.growHp(tic.reduceHp());
						System.out.println("HP: " + ch.getHp());
						System.out.println();
						break;
					case 6: //Student Union
						break;
					case 7: //Hiddink Field
					 	Predict predict = new Predict();
						predict.pd();
						ch.growHp(predict.reduceHp());
						System.out.println("HP: " + ch.getHp());
						System.out.println();
						break;
					case 8: //Oseok Hall
						cgame c=new cgame();
					    ch.growHp(-cgame.main(name));
						break;
					case 9: //Newton Hall
					 	//TypingGame tg=new TypingGame();
                		//ch.growHp(-tg.main());
						break;
					case 10: //Hyundong Hall
            			Hyeondong hd = new Hyeondong();
						hd.show();
						hd.quiz();
            			ch.growHp(hd.getDamage());
						System.out.println("Remaining Health: "+ch.getHp()+"\n");
						break;
				}
        
			 }
			 if(Character.getHP()<0) {
				 System.out.println("Game is over");
			 }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
