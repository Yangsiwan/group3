package Java;

public class cgamehard extends cgamebase{
	static String ci=" +5 V ";//����
	static int  v=11;//���� ����
	public void printrule() {//��Ģ ���� ���� �� ����

		test[2][1]=7;
		test[1][3]=7;
		test[3][4]=7;
		System.out.println("Hardmode");
		System.out.println("All of these 5x5 spaces should be filled with 6 types of circuit blocks.");
		System.out.println("All circuit blocks must be connected to a circuit from start to goal.");
		System.out.println("If all the compartments are not used up or even a single block is not"
				+ " connected to the circuit, that is not acceptable.");
		System.out.println("You have a total of 3 chances to check blocks along the way, "
				+ "and if you don't complete the answer in 3 times, you'll lose the extra hp.");
		System.out.println("Also, your circuit should always have more than 1 power.");
		System.out.println("And you can't change the position or direction of the block that increases the power written +5v.");
	}
	public void printall() {//���� ���+���� ���� ��¶����� override
		System.out.println("  GOAL  ");
		System.out.println("     0      1      2      3      4");
		for(int y=0;y<size;y++) {
			System.out.println(nl);
			for(int i=0;i<3;i++) {
				for(int x=0;x<size;x++) {
					if(x==0)
						if(i==1)
						System.out.printf("%d��",y);
						else System.out.printf("  ��");
					else
					System.out.printf("��");
					printBox(test[y][x],i);
				}
				System.out.println("��");
			}
		}
		System.out.println(nl);
		System.out.println("  Start"+v+"V");
	}
	public void printBox(int x,int i) {//���к��� ����ϱ� ���� override
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
		case 7:  if(i==1)System.out.printf(ci);
		else System.out.printf(c);
			break;
		}
	}
	public int check(int idx,int idy,int ip) {//�������� üũ�� ���� overide
		for(int y=0;y<size;y++) {
			for(int x=0;x<size;x++) {
				cm[y][x]=0;
			}
		}
		int c=checkC(idx,idy,ip,v);
		
		if(c==0) {
			System.out.println("Line isn't Connected");
			return 0;
		}
		else {
			System.out.println("Line is Connected");
			for(int y=0;y<size;y++)
				for(int x=0;x<size;x++)
					if((y!=0&&x!=0)&&cm[y][x]==0)
						return 0;
		}
		return 1;
	}
	private static int checkC(int idx,int idy,int ip,int v) {//����üũ�� ���� override
		int c=0;
		if(v<1) {
			System.out.println("Lack of power");
		}else if(idx==size||idy==size||idx<0||idy<0) {
			System.out.println("Out of range");
			return 0;
		}else if(idy==size-1&&idx==0&&((ip==1&&test[idy][idx]==2)||(ip==4&&test[idy][idx]==5))){
			return 1;
		}switch(test[idy][idx]) {
		case 0: return 0;
		
		case 1: if(ip==2) {
			c=checkC(idx+1,idy,2,v-1);
			break;
		}else if(ip==4) {
			c=checkC(idx-1,idy,4,v-1);
			break;
		}
		else return 0;
		case 2:if(ip==1) {
			c=checkC(idx,idy+1,1,v-1);
			break;
		}else if(ip==3) {
			c=checkC(idx,idy-1,3,v-1);
			break;
		}else 
			return 0;	
		
		case 3:if(ip==1) {
			c=checkC(idx-1,idy,4,v-1);
			break;
		}else if(ip==2) {
			c=checkC(idx,idy-1,3,v-1);
			break;
		}else 
			return 0;
		
		case 4:if(ip==2) {
			c=checkC(idx,idy+1,1,v-1);
			break;
		}else if(ip==3) {
			c=checkC(idx-1,idy,4,v-1);
			break;
		}else 
			return 0;
		
		case 5:if(ip==3) {
			c=checkC(idx+1,idy,2,v-1);
			break;
		}else if(ip==4) {
			c=checkC(idx,idy+1,1,v-1);
			break;
		}else 
			return 0;
		
		case 6:if(ip==1) {
			c=checkC(idx+1,idy,2,v-1);
			break;
		}else if(ip==4) {
			c=checkC(idx,idy-1,3,v-1);
			break;
		}else 
			return 0;
		case 7: 
			if(ip==1) {
				c=checkC(idx,idy+1,1,v+5);
				break;
			}else if(ip==3) {
				c=checkC(idx,idy-1,3,v+5);
				break;
			}else return 0;
		}
		if(c==1)cm[idy][idx]=1;
		return c;
	}
}
