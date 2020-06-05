	import java.util.Scanner;
	import java.util.Random;

	public class TypingGame {
	public	boolean tgmain() {
		int Error=0;//틀린 횟수
		int damage=0;//유저가 받을 데미지
		long end=0;
		Random rand=new Random();
		char chara;
		chara=(char)(rand.nextInt(8)+65);//랜덤으로 처음 알파벳 16개중 하나를 금지 알파벳으로 정한다.
		String ch=String.valueOf(chara);//해당 알파벳을 밑의 함수들에서 사용하기 위해 String으로 바꿔준다.
		char Chara;
		Chara=(char)((int)chara+32); //대문자도 동일하게 만들어준다/
		String Ch=String.valueOf(Chara);
		String LP[]= {"The Little Prince","Onece when I was six years old I saw magnificent picture in a book,","called True Stories from Nature, about the primeval forest.","It was a picture of a boa constrictor in the act of swallowings an animal.","Here is a copy of drawing."};
		//테스트용 문자열 초기화
		Scanner src = new Scanner(System.in);
			String temp;//유저의 인풋을 받을 변수
			String Lptemp;//기존 문자열 에서 금지 알파벳을 제한것을 저장하기 위한 변수
			int time;//걸린 시간을 측정하기 위한 변수
			//설명문
			System.out.println("Hello Welcome to OSuk Library");
			System.out.println("We will test your typing skills here.");
			System.out.println("Typing technology is one of the most important skills in college.");
			System.out.println("From now on, I'll show you the sentence and you can write it down.");
			System.out.println("However, you have to transcribe the sentence except for one alphabet that I showed you together.");
			System.out.println("If you write the alphabet you showed together or if the sentence you transferred is wrong, you have to retype it.");
			System.out.println("The score will be calculated from the number of mistakes and the time it took to write down all the sentences.");
			System.out.println("For Example\n \"Apple\" \n Alphabet to exclude: A\n Answer: pple");
			System.out.println("\nAlso, if you want to give up this game, you can just type: END");
			System.out.println("\n\nLet's start it!");
			//출력문
			
			long start = System.currentTimeMillis();//타이머 시작
			System.out.println("Alphabet to exclude: "+ch);//금지어 출력
			for(int i=0;i<5;i++) {//총 5개의 예문을 순서대로 출력)
				if(Error>10) {
					System.out.println("You Made so many miss. Game Over!");
					break;
				}
				System.out.println("\""+LP[i]+"\"");//예뮨 츌력
				
				temp=src.nextLine();//유저의 타이핑
				if(temp.contentEquals("END"))
					return false;
				Lptemp=LP[i].replaceAll(ch,"");//예문에서 금지 알파벳 제거
				Lptemp=LP[i].replaceAll(Ch,"");//예문에서 금지 알파벳 제거
				if(temp.contains(ch)||temp.contains(Ch)) {//금지 알파벳 유무확인
					System.out.println("Yout Typed Exclude Alphabet");
					i--;//있을시 다시 하기 위해 증가 하지 않음
					Error++;//오류 횟수 증가
					continue;//밑의 내용을 무시
				}
				if(!temp.contentEquals(Lptemp)) {//문자열의 일치를 확인 
					System.out.println("You Miss Typed!!");
					i--;
					Error++;
					continue;
				}
				System.out.println("Good Answer!");//정답임을 알려줌
				end=System.currentTimeMillis();//시간 측정을 종료함
				System.out.println((float)((end-start)/1000)+"seconds");
			}
			end=System.currentTimeMillis();//시간 측정을 종료함
			System.out.println("It took you a total of "+(float)((end-start)/1000)+" seconds to type everything.");//걸린 시간을 소숫점으로 표시해줌
			time=(int)((end-start)/1000);//해당 걸린시간을 데미지 계산을 위해 변환
			
			if(time<130)//시간이 2분 10초 내에서 걸리면 데미지를 주지 않는다.
			damage+=0;
			else {//아닐시 2분만큼은 차하고 나머지 를 10으로 나눈 만큼 데미지를 준다.
				damage+= (time-120)/10;
			}
		
		if(Error<5)damage+=0;//오타 횟수가 5회 미만이면 데미지를 주지 않는다/
		else if(damage<15)damage+=Error-5;//10회 미만이면 5회만큼 제하고 데미지를 준다
		else damage+=10;//그보다 클시 앞선 것의 최대 대미지인 4만큼만 데미지를 준다.
		if(damage>10)damage=10;//4보다 데미지가 더 들어가게 되면 이를 수정한다.
		
		Character.growHp(-damage);//데미지를 반환한다.
		return true;
	}
}
