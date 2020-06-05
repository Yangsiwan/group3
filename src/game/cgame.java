package Java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class cgame {
	public boolean main() {
		int damage=0;
		int cleartime=0;//클리어하기까지 걸린 횟수
		int mode=0;//두가지 난이도중 모드를 고른다.
 		cgamebase c=new cgamebase();//둘다 미리 선언을해준다.
 		cgamehard h=new cgamehard();
 		Scanner src=new Scanner(System.in);
 		//설명
 		System.out.println("Welcome to Newton hall");
		System.out.println("we prepare some crcuit game for you "+Character.getName());
		System.out.println("We have a 2 mode of game");
		System.out.println("1. just connect the crcuit from start to goal");
		System.out.println("2. Keep the power level above 1 and connect the start to the goal ");
		System.out.println("Please enter your choice(1. without power level, 2.with power level)");
		//잘못된 입력을 무시하고 다시 하도록 한다.
		while(mode!=1||mode!=2) {
		
			try {
			mode=src.nextInt();
		 	if(mode==1) { 
		 		cleartime=c.menu();
		 		break;
		 		}
		 	else if(mode==2){
		 		cleartime=h.menu();
		 		break;
		 		}
		 	else System.out.println("You Put the Wrong Number! please re-enter your choice!");
			} catch(InputMismatchException e){
			 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
			 	src.nextLine();
		 	}
		}
 		
		if(cleartime!=-1) {
		System.out.println("You tried "+cleartime+"times");//완료까지 걸린 시도횟수를 출력시켜준다.
		if (cleartime<5)damage= 0;//3번까지의 실수는 무효로 처리한다.
		else if(cleartime<13) damage =cleartime-5;// 4번이상의 실수시 3만큼 차감해서 데미지를 준다.
		else damage= 8;//만일 총 데미지가 3을 넘을경우 3으로 고정한다.
		Character.growHp(-damage);
		return true;//성공시
		}
		else return false;//실패시
	}
	

	
}
