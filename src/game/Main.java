import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;


class Main {

     static String name;
     static int hp = 50;
	 static int menu;
	 static boolean [] clear = new boolean[10];
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

	 public static void main(String[] args) throws FileNotFoundException, InterruptedException { 
		 int check=0;
		 int menu=0;
		 int gameend=0;
		 Scanner scn = new Scanner(System.in);
		 if(load()==0) {
			 check=1;
			System.out.println("========================================");
			System.out.println("Welcome to Your Hanst!!");
			 System.out.printf("Please type your name: ");
			 while(check==1) {
				 name=scn.nextLine();
				 while(check==1) {
				 try {
					 System.out.println("Your name is \""+name+"\" right? (0:Yes 1:No)");
					 check=scn.nextInt();
					 scn.nextLine();
					 if(check!=1&&check!=0) throw new MismatchException ();
					 break;
				 	} catch(InputMismatchException e){
					 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
					 	scn.nextLine();
				 	}catch(MismatchException e) {
				 		System.out.println("You Put the Wrong Number! please re-enter your choice!");
				 	}
				 }
						 
				if(check==0) {
					 System.out.println("Okay.\n");
					 break;
				 }else if(check==1)
					 System.out.println("Please re-enter your name.");
			}
		 }else {
			 System.out.println("========================================");
			 System.out.println("Welcome back to Your Hanst!!"+ name);
		 }
		 new Character(name,hp); //set name, hp
		for(;1==check()&&Character.getHp()>0&&gameend==0;) {
			 System.out.println("Name : "+Character.getName()+"\nHp : "+Character.getHp());
			 System.out.println("\nWhere should we go?");
			 System.out.println("0 : Save");
			 for(int i=0;i<10;i++)
				 if(clear[i]==false) 
					 System.out.println(i+1+" : "+Sname[i]);
			System.out.println("11 : Stop Playing this game.");
		    menu();
			
			while(Character.getHp()>0) {
				try {
				System.out.printf("Select place: ");
				 menu=scn.nextInt();
				 scn.nextLine();
				 if(menu<0||menu>11) throw new MismatchException ();
				break;
				
				}catch(InputMismatchException e){
				System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
			 	scn.nextLine();
				}
				catch(MismatchException e) {
					System.out.println("You Put the Wrong Number! please re-enter your choice!");
				}
			}//menu--;
			System.out.println(menu);
			if(menu!=0&&menu!=11&&clear[menu-1]==true) {
				System.out.println("It is Already Cleared!!");
				System.out.println("Please re-enter.");
			}
			switch(menu) {
				case 0:
               		//SAVE
					save();
					break;
				case 1: //GLC
					//hangman h=new hangman();
				//	h.game();
					break;
				case 2: 
				//Hyoam Chpel
					//Bible b=new Bible();
				//	b.game();
					break;
				case 3: //Cheonmaji
				   //Chunmaji chun = new Chunmaji();
				   //clear[menu-1]=chun.success();
				  // if(!clear[menu-1]) chun.menu();
				   break;
				case 4: //Store
				   //Store st = new Store();
				   //clear[menu-1]=st.success();
				   //if(!clear[menu-1]) st.show();
					break;
				case 5: //Alpha Store
				 //	TicTac tic = new TicTac();
					//tic.tt();
					//ch.growHp(tic.reduceHp());
					//System.out.println("HP: " + ch.getHp());
					//System.out.println();
					break;
				case 6: //Student Union
					break;
				case 7: //Hiddink Field
				 	//Predict predict = new Predict();
					//predict.pd();
					//ch.growHp(predict.reduceHp());
					//System.out.println("HP: " + ch.getHp());
				//	System.out.println();
					break;
				case 8:
					TypingGame tg=new TypingGame();
               		clear[menu-1]=tg.tgmain();
 					break;
				case 9: //Newton Hall
					cgame c=new cgame();
				    clear[menu-1]=c.main();
				    break;
				case 10: //Hyundong Hall
           		//	Hyeondong hd = new Hyeondong();
					//hd.show();
					//hd.quiz();
           		//	ch.growHp(hd.getDamage());
				//	System.out.println("Remaining Health: "+ch.getHp()+"\n");
					break;
				case 11: 
					try {
						System.out.println("You want to stop plating this game(0:I want to keep play this game 1:I want to stop playing game)");
						gameend=scn.nextInt();
						scn.nextLine();
						if(gameend!=0&&gameend!=1) throw new MismatchException ();
					} catch(InputMismatchException e){
					 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
					 	scn.nextLine();
				 	}catch(MismatchException e) {
				 		System.out.println("You Put the Wrong Number! please re-enter your choice!");
				 	}
					
			}	 
		 }
		 if(Character.getHp()<0) {
			 System.out.println("Game is over");
		 }else if(gameend==1) {
			 	save();
				System.out.println("Good bye and see you again!");
				 
		 }
		
	
	 }
	
	 private static int load() throws FileNotFoundException {
		 int load=0;
		 try {
		 File file=new File("save.txt");
		 int temp;
		 Scanner scn=new Scanner(System.in);
		 Scanner sc = new Scanner(file);
			if(sc.hasNextLine()) {
				while(load==0) {
					try {
						System.out.println("We have a save file. you want to continue?(0:no i don't 1:Yes, I want to continue)");
						load=scn.nextInt();
						scn.nextLine();
						if(load==0)return 0;
						else if(load!=1) throw new MismatchException ();
					} catch(InputMismatchException e){
						System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
						scn.nextLine();
					}catch(MismatchException e) {
						System.out.println("You Put the Wrong Number! please re-enter your choice!");
					}
				}
				 name=sc.nextLine();
				 hp=sc.nextInt();
				 sc.nextLine();
				 for(int i=0;i<10;i++) {
					 temp=sc.nextInt();
					 if(1==temp) {
						 clear[i]=true;
					 }else clear[i]=false;
					 sc.nextLine();
				 }
				 sc.close();
			}
		 }catch(FileNotFoundException e) {
			return 0;	
		}
		 return 1;
	 }
	 
	 private static void save() throws InterruptedException{
		 File file = new File("save.txt");
			FileWriter writer = null;
			try {
	            // 기존 파일의 내용에 이어서 쓰려면 true를, 기존 내용을 없애고 새로 쓰려면 false를 지정한다.
	            writer = new FileWriter(file, false);
	            writer.write(Character.getName()+"\n");
	            writer.write(Character.getHp()+"\n");
	            for(int i = 0;i<10;i++) {
	            	if(clear[i]==true) writer.write(1+"\n");
	            	else writer.write(0+"\n");
	            }
	            writer.flush();
	            System.out.println("Game Is Saved");
	        } catch(IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if(writer != null) writer.close();
	            } catch(IOException e) {
	                e.printStackTrace();
	            }
	        }
	 }

	 public	static int check() {
		 for(int i=0;i<10;i++) {
			 if(clear[i]==false)
			 return 1;
		 }
		 return 0;
	 }
}
