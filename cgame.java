package Java;
import java.util.Scanner;
public class cgame {
	public int main(String name) {
		int cleartime=0;//Ŭ�����ϱ���� �ɸ� Ƚ��
		int mode=0;//�ΰ��� ���̵��� ��带 ����.
 		cgamebase c=new cgamebase();//�Ѵ� �̸� ���������ش�.
 		cgamehard h=new cgamehard();
 		//����
 		System.out.println("Welcome to Newton hall");
		System.out.println("we prepare some crcuit game for you "+name);
		System.out.println("We have a 2 mode of game");
		System.out.println("1. just connect the crcuit from start to goal");
		System.out.println("2. Keep the power level above 1 and connect the start to the goal ");
		System.out.println("Please enter your choice(1. without power level, 2.with power level)");
		//�߸��� �Է��� �����ϰ� �ٽ� �ϵ��� �Ѵ�.
		while(mode!=1||mode!=2) {
			try(Scanner src=new Scanner(System.in);) {
				mode=src.nextInt();
		 	if(mode<1||mode>2)
		 		throw new Exception();
		 	else if(mode==1) { 
		 		cleartime=c.menu();
		 		break;
		 		}
		 	else {
		 		cleartime=h.menu();
		 		break;
		 		}
			}
			catch(Exception e) {
				System.out.println("You put the wrong number");
			}
		}
 		
		System.out.println("You tried "+cleartime+"times");//�Ϸ���� �ɸ� �õ�Ƚ���� ��½����ش�.
		if (cleartime<4)return 0;//3�������� �Ǽ��� ��ȿ�� ó���Ѵ�.
		else if(cleartime<7) return cleartime-3;// 4���̻��� �Ǽ��� 3��ŭ �����ؼ� �������� �ش�.
		else return 3;//���� �� �������� 3�� ������� 3���� �����Ѵ�.
	}
	

	
}
