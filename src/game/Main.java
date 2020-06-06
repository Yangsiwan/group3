import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;


class Main {

     static String name;
     static int hp = 50;
	 static int menu;
	 static boolean [] clear = new boolean[11];
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

	 public static void main(String[] args) throws InterruptedException { 
		 int check=1;
		 int menu=0;
		 Scanner scn = new Scanner(System.in);
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
				 		check=1;
				 	}
				 }
						 
				if(check==0) {
					 System.out.println("Okay.\n");
					 break;
				 }else if(check==1)
					 System.out.println("Please re-enter your name.");
			}
			 Character ch = new Character(name,hp); //set name, hp
			 System.out.println("Name : "+Character.getName()+"\nHp : "+Character.getHp());
			 for(;1==check()&&Character.getHp()>0;) {
				 System.out.println("\nWhere should we go?");
				 System.out.println("0 : Save");
				 for(int i=0;i<10;i++)
					 if(clear[i]==false)
						 System.out.println(i+1+" : "+Sname[i]);
			    menu();
				System.out.print("Select place: ");
				while(check==0) {
					try {
					 menu=scn.nextInt();
					 scn.nextLine();
					 if(menu<0||menu>10) throw new MismatchException ();
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
				if(menu!=0 && clear[menu-1]==true) {
					System.out.println("It is Already Cleared!!");
					System.out.println("Please re-enter.");
				}
				switch(menu) {
					case 0:
                		//SAVE
						File file = new File("save.txt");
						FileWriter writer = null;
						try {
				            // 기존 파일의 내용에 이어서 쓰려면 true를, 기존 내용을 없애고 새로 쓰려면 false를 지정한다.
				            writer = new FileWriter(file, false);
				            writer.write(Character.getName()+"\n");
				            writer.write(Character.getHp()+"\n");
				            for(int i = 0;i<11;i++) {
				            	if(clear[i]==true) writer.write(1+"\n");
				            	else writer.write(0+"\n");
				            }
				            writer.flush();
				            System.out.println("DONE");
				        } catch(IOException e) {
				            e.printStackTrace();
				        } finally {
				            try {
				                if(writer != null) writer.close();
				            } catch(IOException e) {
				                e.printStackTrace();
				            }
				        }
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
					   Chunmaji chun = new Chunmaji();
					   clear[menu-1]=chun.success();
					   if(!clear[menu-1]) chun.menu();
					   break;
					case 4: //Store
					   Store st = new Store();
					   clear[menu-1]=st.success();
					   if(!clear[menu-1]) st.show();
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
						//TypingGame tg=new TypingGame();
                		//clear[menu-1]=tg.tgmain();
 						break;
					case 9: //Newton Hall
						//cgame c=new cgame();
					    //clear[menu-1]=c.main();
					    break;
					case 10: //Hyundong Hall
            		//	Hyeondong hd = new Hyeondong();
						//hd.show();
						//hd.quiz();
            		//	ch.growHp(hd.getDamage());
					//	System.out.println("Remaining Health: "+ch.getHp()+"\n");
						break;
				}
				System.out.println("Name : "+Character.getName()+"\nHp : "+Character.getHp());
				 
			 }
			 if(Character.getHp()<0) {
				 System.out.println("Game is over");
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
