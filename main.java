package Java;
import java.util.Scanner;

public class main {

	static String name;
	static int [] clear= new int [10];
	static String [] Sname= {"�а�","������","����Ȧ","����Ȧ","����","���ļ���","õ����","GLC","ä��","����ũ�ʵ�"};
	public static void main(String[] args) { 
		 int check=1;
		 int hp=10;
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
						
						 break;
					 case 1: TypingGame t=new TypingGame();
					 hp-=t.main();
					 clear[menu]=1;
						System.out.println(hp);
						 break;
					 case 2: cgame c=new cgame();
						hp=- c.main(name);
						clear[menu]=1;
						System.out.println(hp);
						 
						 break;
					 case 3: //�� ����
						 break;
					 case 4: //�� ����
						 break;
					 case 5: //�� ����
						 break;
					 case 6: //�� ����
						 break;
					 case 7: //�� ����
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
	 public	static int check() {
		 for(int i=0;i<10;i++) {
			 if(clear[i]==0)
			 return 1;
		 }
		 return 0;
	 }
}
