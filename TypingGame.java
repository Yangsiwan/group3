package Java;
	import java.util.Scanner;
	import java.util.Random;

	public class TypingGame {
	public	int main() {
		int Error=0;//Ʋ�� Ƚ��
		int damage=0;//������ ���� ������
		Random rand=new Random();
		char chara=(char) (rand.nextInt(16)+65);//�������� ó�� ���ĺ� 16���� �ϳ��� ���� ���ĺ����� ���Ѵ�.
		String ch=Character.toString(chara);//�ش� ���ĺ��� ���� �Լ��鿡�� ����ϱ� ���� String���� �ٲ��ش�.
		char Chara=(char)((int)chara+32); //�빮�ڵ� �����ϰ� ������ش�/
		String Ch=Character.toString(Chara);
		String LP[]= {"The Little Prince","Onece when I was six years old I saw magnificent picture in a book,"," called True Stories from Nature, about the primeval forest.","It was a picture of a boa constrictor in the act of swallowings an animal.","Here is a copy of drawing."};
		//�׽�Ʈ�� ���ڿ� �ʱ�ȭ
		try (Scanner src = new Scanner(System.in)) {
			String temp;//������ ��ǲ�� ���� ����
			String Lptemp;//���� ���ڿ� ���� ���� ���ĺ��� ���Ѱ��� �����ϱ� ���� ����
			int time;//�ɸ� �ð��� �����ϱ� ���� ����
			//����
			System.out.println("Hello Welcome to OSuk Library");
			System.out.println("We will test your typing skills here.");
			System.out.println("Typing technology is one of the most important skills in college.");
			System.out.println("From now on, I'll show you the sentence and you can write it down.");
			System.out.println("However, you have to transcribe the sentence except for one alphabet that I showed you together.");
			System.out.println("If you write the alphabet you showed together or if the sentence you transferred is wrong, you have to retype it.");
			System.out.println("The score will be calculated from the number of mistakes and the time it took to write down all the sentences.");
			System.out.println("\n\nLet's start it!");
			//��¹�
			
			long start = System.currentTimeMillis();//Ÿ�̸� ����
			System.out.println("Alphabet to exclude: "+ch);//������ ���
			for(int i=0;i<5;i++) {//�� 5���� ������ ������� ���
				System.out.println(LP[i]);//���� ����
				temp=src.nextLine();//������ Ÿ����
				Lptemp=LP[i].replaceAll(ch,"");//�������� ���� ���ĺ� ����
				Lptemp=LP[i].replaceAll(Ch,"");//�������� ���� ���ĺ� ����
				if(temp.contains(ch)||temp.contains(Ch)) {//���� ���ĺ� ����Ȯ��
					System.out.println("Yout Typed Exclude Alphabet");
					i--;//������ �ٽ� �ϱ� ���� ���� ���� ����
					Error++;//���� Ƚ�� ����
					continue;//���� ������ ����
				}
				if(!temp.contentEquals(Lptemp)) {//���ڿ��� ��ġ�� Ȯ�� 
					System.out.println("You Miss Typed!!");
					i--;
					Error++;
					continue;
				}
				System.out.println("Good Answer!");//�������� �˷���
			}
			long end=System.currentTimeMillis();//�ð� ������ ������
			System.out.println("It took you a total of "+(float)((end-start)/1000)+" seconds to type everything.");//�ɸ� �ð��� �Ҽ������� ǥ������
			time=(int)((end-start)/1000);//�ش� �ɸ��ð��� ������ ����� ���� ��ȯ
			
			if(time<130)//�ð��� 2�� 10�� ������ �ɸ��� �������� ���� �ʴ´�.
			damage+=0;
			else {//�ƴҽ� 2�и�ŭ�� ���ϰ� ������ �� 10���� ���� ��ŭ �������� �ش�.
				damage+= (time-120)/10;
			}
		}
		if(Error<5)damage+=0;//��Ÿ Ƚ���� 5ȸ �̸��̸� �������� ���� �ʴ´�/
		else if(damage<10)damage+=Error-5;//10ȸ �̸��̸� 5ȸ��ŭ ���ϰ� �������� �ش�
		else damage+=4;//�׺��� Ŭ�� �ռ� ���� �ִ� ������� 4��ŭ�� �������� �ش�.
		if(damage>4)damage=4;//4���� �������� �� ���� �Ǹ� �̸� �����Ѵ�.
		
		return damage;//�������� ��ȯ�Ѵ�.
	}
}
