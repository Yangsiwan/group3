import java.util.InputMismatchException;
import java.util.Scanner;

public class cgamebase {
	public static int size=4;//전체 게임 판의 크기
	public static String nl="   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ";//전체 칸의 크기
	public static String tl="ㅡㅡㅡㅡㅡㅡ";
	public String hl="  ㅡㅡㅡㅡㅡ";//한칸의 크기
	public static String s="          ";//빈칸
	public String cx="xxxxx ";//금지칸
	public String a="     ㅡㅡ";//우측 연결 블록
	public String b="ㅡㅡ    ";//좌측 연결 블럭
	public String c="    ㅣ   ";//상하 연결 블럭
	public String l="  ㅡㅡㅡ ";//좌우 연결블럭
	public static int [][] test=new int [size][size];//test 블럭 
	public static int [][] cm=new int [size][size];//체크용 블럭


	public int	menu () {
		int check=0;
		int cleartime=0;//클리어 횟수 기록
		int change[]=new int [2];//좌표 받기
		int shape=0;//블록 모양고정
		printrule();
		for(;check==0;) {
			printall(size,test);
			check=check(0,size-1,3);
			if(check==1) {
				System.out.println("Game Clear");
				break;
			}else
				if(cleartime!=0)
				System.out.println("Wrong Answer");
				System.out.println("you want to stop play this game?(0:Keep Play it. 1:I'm give up.)");
				if(1==choose()) {
					return -1;
				}
				
			//입력구문
			cleartime++;
			
			while(cleartime>0) {
				try {
					change=chooseC();
					
					if(change[0]==-1){
						break;
					}else if(change[0]<0||change[0]>size-1||change[1]<0||change[1]>size-1||test[change[1]][change[0]]==7)
						throw new Exception();
						
					else
					while(shape==0){
						shape=chooseS();
						if(shape==0) {
							printB();
						}else if(shape<1||shape>6) {
							shape=0;
							throw new Exception();
						}
					}
					test[change[1]][change[0]]=shape;
					shape=0;
				}catch (Exception e) {
				System.out.println("Wrong Input");
				}
			}
		}
		return cleartime;
	}
	
	private int choose() {
		int answer=0;
		Scanner src = new Scanner(System.in);
		while(answer==0) {
				try {
					answer=src.nextInt();
					src.nextLine();
					if(answer!=0&&answer!=1) throw new MismatchException();
						break;
				}catch(InputMismatchException e){
				 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");	
				 	answer=0;
				 	src.nextLine();
				}catch(MismatchException e) {
					System.out.println("You Put the Wrong Number!! please re-enter your choice!");
					answer=0;
				}
			
			
			}
			return answer;
		
	}
	
	
	
	public void printrule() {//규칙인쇄
		int [][] example={{2,5,4},{6,3,2},{5,1,3}};
		
		System.out.println("Easeymode");
		System.out.println("All of these 5x5 spaces should be filled with 6 types of circuit blocks.");
		System.out.println("All circuit blocks must be connected to a circuit from start to goal.");
		System.out.println("If all the compartments are not used up or even a single block is not"
				+ " connected to the circuit, that is not acceptable.");
		System.out.println("Also, you cannot connect a circuit to a compartment filled with X.");
		System.out.println("You have a total of 3 chances to check blocks along the way, "
				+ "and if you don't complete the answer in 3 times, you'll lose the extra hp.");
		System.out.println("For Example:");
		printall(3,example);
	}

	private int[] chooseC() {//좌표 받기
		int matrix[]=new int [2];
		int check=0;
		var src = new Scanner(System.in);
			System.out.println("Please enter the coordinates of the column you want to change.");
			while(check==0) {
				try {
					System.out.println("Please enter the x coordinate.(-1 :check the result)");
					matrix[0]=src.nextInt();
					src.nextLine();
					break;
				} catch(InputMismatchException e){
			 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
			 	src.nextLine();
				}
			}
			if(matrix[0]==-1) {
				return matrix;
			}
			while(check==0) {
				try {
					System.out.println("Please enter the y coordinate.");
					matrix[1]=src.nextInt();
					src.nextLine();
					break;
				} catch(InputMismatchException e){
				 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
				 	src.nextLine();
					}
			}
			return matrix;
		
	}
	
	private int chooseS() {//모양 받기
		Scanner src = new Scanner(System.in);
		int check=0;
		int choice=0;
		while(check==0) {
			try {
				System.out.println("Enter the numbear of circuit blocks you want to change! (0: View numbers for each circuit block)");
				choice=src.nextInt();
				break;
			}catch(InputMismatchException e){
			 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
			 	src.nextLine();
				}
		}
				
		return choice;
	}
	
	private void printB() {//블럭별 출력
		for(int x=1;x<7;x++) {
			System.out.println(x);
			System.out.println(hl);
			for(int i=0;i<3;i++) {
			System.out.printf("ㅣ");
			printBox(x,i);
			System.out.println("ㅣ");
		}	
		System.out.println(hl);
		}
	}
	public void printall(int size,int test [][]) {//전체 현제 상황 출력
		System.out.println("  GOAL  ");
		for(int i=0;i<size;i++)
			if(i==0)
				System.out.printf("     0");
			else if(i==size-1)
				System.out.println("      "+i);
			else
				System.out.printf("      %d",i);	
		for(int y=0;y<size;y++) {
			System.out.printf(nl);
			if(size==4)
			System.out.println(tl);
			else System.out.println("");
			for(int i=0;i<3;i++) {
				for(int x=0;x<size;x++) {
					if(x==0)
						if(i==1)
						System.out.printf("%dㅣ",y);
						else System.out.printf("  ㅣ");
					else
					System.out.printf("ㅣ");
					printBox(test[y][x],i);
				}
				System.out.println("ㅣ");
			}
		}
		System.out.printf(nl);
		if(size==4)
			System.out.println(tl);
			else System.out.println("");
		System.out.println("  Start");
	}
	
	public void printBox(int x,int i) {//각 칸별 출력
		switch(x) {
		case 0: System.out.printf(s); break;
		case 1: if(i==0) System.out.printf(s);
		else if(i==1)System.out.printf(l);
		else if(i==2)System.out.printf(s);
		break;
		case 2: if(i==0) System.out.printf(c);
		else if(i==1)System.out.printf(c);
		else if(i==2)System.out.printf(c);
		break;
		case 3: if(i==0) System.out.printf(c);
		else if(i==1)System.out.printf(b);
		else if(i==2)System.out.printf(s);
		break;
		case 4: if(i==0) System.out.printf(s);
		else if(i==1)System.out.printf(b);
		else if(i==2)System.out.printf(c);
		break;
		case 5: if(i==0) System.out.printf(s);
		else if(i==1)System.out.printf(a);
		else if(i==2)System.out.printf(c);
		break;
		case 6: if(i==0) System.out.printf(c);
		else if(i==1)System.out.printf(a);
		else if(i==2)System.out.printf(s);
		break;
		}
	}
	
	public int check(int idx,int idy,int ip) {//연결유무와 전칸사용 여부 확인
		for(int y=0;y<size;y++) {
			for(int x=0;x<size;x++) {
				if(test[y][x]==7)
					cm[y][x]=1;
				else
				cm[y][x]=0;
			}
		}
		int c=checkC(idx,idy,ip);
		if(c==0)return 0;
		else {
			for(int y=0;y<size;y++)
				for(int x=0;x<size;x++)
					if((y!=0&&x!=0)&&cm[y][x]==0)
						return 0;
		}
		return 1;
	}
 
	public static int checkC(int idx,int idy,int ip) {//연결여부 확인
		int c=0;
		if(idx==size||idy==size||idx<0||idy<0) {
			return 0;
		}else if(idy==0&&idx==0&&((ip==3&&test[idy][idx]==2)||(ip==4&&test[idy][idx]==6))){
			return 1;
		}switch(test[idy][idx]) {
		case 0: return 0;
		
		case 1: if(ip==2) {
			c=checkC(idx+1,idy,2);
			break;
		}else if(ip==4) {
			c=checkC(idx-1,idy,4);
			break;
		}
		else return 0;
		case 2:if(ip==1) {
			c=checkC(idx,idy+1,1);
			break;
		}else if(ip==3) {
			c=checkC(idx,idy-1,3);
			break;
		}else 
			return 0;	
		
		case 3:if(ip==1) {
			c=checkC(idx-1,idy,4);
			break;
		}else if(ip==2) {
			c=checkC(idx,idy-1,3);
			break;
		}else 
			return 0;
		
		case 4:if(ip==2) {
			c=checkC(idx,idy+1,1);
			break;
		}else if(ip==3) {
			c=checkC(idx-1,idy,4);
			break;
		}else 
			return 0;
		
		case 5:if(ip==3) {
			c=checkC(idx+1,idy,2);
			break;
		}else if(ip==4) {
			c=checkC(idx,idy+1,1);
			break;
		}else 
			return 0;
		
		case 6:if(ip==1) {
			c=checkC(idx+1,idy,2);
			break;
		}else if(ip==4) {
			c=checkC(idx,idy-1,3);
			break;
		}else 
			return 0;
		case 7: 
				return 0;

		}
		if(c==1)cm[idy][idx]=1;
		return c;
	}

}
