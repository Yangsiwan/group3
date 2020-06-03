package game;

public class attack {
	String arr[][]= new String[3][3];
    arr[][]= {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    
	public void show() throws InterruptedException {
		System.out.println("-----------------------------[Forward of Chunmaji]-----------------------------");
		Thread.sleep(500);
		System.out.println("===============================================================================");
		System.out.println("                       Wild Boar appeared! [HP: 200]");
		System.out.println("===============================================================================");
		Thread.sleep(500);
	    System.out.println("You can't run away. You have to fight.");
	    Thread.sleep(500);
	    wildboar();
	}
	public void wildboar() {
		System.out.println("\nOh my god. The wild Boar hid.");
		System.out.println("We have to find and need to set up a trap.");
		System.out.print("Choose the number : ");
		print();
		
	}
	public void print() {
		System.out.println("==============[GRASS]============");
		System.out.println("|         |          |          |");
		System.out.println("|    "+arr[0][0]+"    |     "+arr[0][1]+"    |     "+arr[0][2]+"    |");
		System.out.println("|         |          |          |");
		System.out.println("=================================");
		System.out.println("|         |          |          |");
		System.out.println("|    4    |     5    |     6    |");
		System.out.println("|         |          |          |");
		System.out.println("=================================");
		System.out.println("|         |          |          |");
		System.out.println("|    7    |     8    |     9    |");
		System.out.println("|         |          |          |");
		System.out.println("=================================");
	
	}
	
	}
