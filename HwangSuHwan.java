package Java;
import java.util.Scanner;
public class game{
	static int size=3;
	static String nl="  ㅡㅡㅡㅡ";
	static String tl="ㅡㅡㅡㅡㅡ";
	static String hl="  ㅡㅡㅡㅡㅡ";
	static String s="          ";
	static String cx="xxxxx ";
	static String a="     ㅡㅡ";
	static String b="ㅡㅡ     ";
	static String c="    ㅣ   ";
	static String l=" ㅡㅡㅡ ";
	static int [][] test;
	static int [][] cm;
	public game(int hp) {
		size=hp/2;
		if(size<3)
			size=3;
		test=new int [size][size];
		cm=new int [size][size];
	}


	public int cgame() {
		int check=0;
		int cleartime=0;
		int change=0;
		int shape=0;
		for(;check==0;) {
			printall();
			check=check(0,0,1);
			if(check==1) {
				System.out.println("해결됨");
				break;
			}else
				System.out.println("정답이 아님");
			//입력구문
			cleartime++;
			
			while(cleartime>=0) {
				change=chooseC();
				if(change==-1){
					break;
				}else if(change<0||change>(size*size-1)||test[change/size][change%size]==7) {
					System.out.println("잘못된 입력입니다.");
				}else {
					while(shape==0){
						shape=chooseS();
						if(shape==0) {
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
						}else if(shape<1||shape>6) {
							System.out.println("잘못된 입력입니다.");
							shape=0;
						}
					}
					test[change/size][change%size]=shape;
					shape=0;
				}		
			}
		}
		System.out.println("You tried "+cleartime+"times");
		System.out.println("You Damaaged "+(cleartime-1)+"Danage");
		if (cleartime<4)return 0;
		return cleartime-3;
	}
	private int chooseC() {
		Scanner src=new Scanner(System.in);
		for(int y=0;y<size;y++) {
			for(int x=0;x<size;x++) {
				System.out.printf((y*size+x)+" ");
				}
			System.out.println(" ");
		}
		System.out.println("바꾸고싶은 칸의  번호를 입력주세요.(-1:결과 확인하기)");
		return src.nextInt();
	}
	private int chooseS() {
		Scanner src=new Scanner(System.in);
		System.out.println("바꾸고 싶은 모양의 번호를 입력하세요!(0: 모양별 번호보기)");
		return src.nextInt();
	}
	private void printall() {
		System.out.println("  GOAL");
		for(int y=0;y<size;y++) {
			for(int z=0;z<size;z++) {
				if(z==0)
					System.out.printf(nl);
				else if(z==size-1)
					System.out.println(tl);
				else 
					System.out.printf(tl);
			}
			for(int i=0;i<3;i++) {
				for(int x=0;x<size;x++) {
					System.out.printf("ㅣ");
					printBox(test[y][x],i);
				}
				System.out.println("ㅣ");
			}
		}
		for(int z=0;z<size;z++) {
			if(z==0)
				System.out.printf(nl);
			else if(z==size-1)
				System.out.println(tl);
			else 
				System.out.printf(tl);
		}			
		System.out.println("  Start");
	}
	private void printBox(int x,int i) {
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
		case 7:  System.out.printf(cx); break;
		}
	}
	private int check(int idx,int idy,int ip) {
		int c=checkC(idx,idy,ip);
		if(c==0)return 0;
		else {
			System.out.println("C");
			for(int y=0;y<size;y++)
				for(int x=0;x<size;x++)
					if((y!=0&&x!=0)&&cm[y][x]==0)
						return 0;
		}
		return 1;
	}
 
	private static int checkC(int idx,int idy,int ip) {
		int c=0;
		if(idy==size-1&&idx==0&&((ip==1&&test[idy][idx]==2)||(ip==4&&test[idy][idx]==5))) {
			return 1;
		}else if(idx==size||idy==size) {
			return 0;
		}switch(test[idy][idx]) {
		
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
		}
		if(c==1)cm[idy][idx]=1;
		return c;
	}
}
