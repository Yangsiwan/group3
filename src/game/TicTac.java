import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTac {
	
	//contain inputs in arraylist
	private static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	private static ArrayList<Integer> cashierPositions = new ArrayList<Integer>();
	private static int lost = 0;

	public boolean tt() {
		int damage = 0;

		try {
			System.out.println("Cashier: Welcome to Alpha Store!");
			Thread.sleep(1000);
			System.out.println("Cashier: Here, we sell various office supplies.");
			Thread.sleep(1000);
			System.out.println(Character.getName()+": Wait, what is this?");
			Thread.sleep(1000);
			System.out.println("Cashier: Ahhh, that is an old game called TicTacToe.");
			Thread.sleep(1000);
			System.out.println(Character.getName()+": Can I buy this?");
			Thread.sleep(1000);
			System.out.println("Cashier: Well, that is not for sale.");
			Thread.sleep(1000);
			System.out.println(Character.getName()+": But I want this game.");
			Thread.sleep(1000);
			System.out.println("Cashier: Hmm... Ok, but here is the deal,\n\t If you beat the game with me, \n\t I will give it to you for free.");
			Thread.sleep(1000);
			System.out.println("Cashier: Only winning is the key. No tie.");
			System.out.println(Character.getName()+": Got it!");
			Thread.sleep(1000);
			System.out.println("Cashier: Here is the game rules.");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("[Tic Tac Toe Rule]");
			System.out.println("1. The game is played on a grid that's 3 squares by 3 squares.\n2. You are X, your friend is O. Players take turns putting their marks in empty squares.\n3. The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.\n4. When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.");
			System.out.println("\nBasically, you need to make three in a row.");
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			return false;
		}
		
		//Game Board Form
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
		System.out.println("\nGame Start!\n");
		printGameBoard(gameBoard);
		
		//keeps asking to put new inputs
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter your placement(1 - 9): ");
			int playerPos = scan.nextInt();
			
			//To check if chosen place is already taken
			while(playerPositions.contains(playerPos) || cashierPositions.contains(playerPos)) {
				System.out.println("Position is already taken! Enter other positions");
				playerPos = scan.nextInt();
			}
			
			//call placeInput() method for player's inputs
			placeInput(gameBoard, playerPos, "player");
			
			String result = checkWinner();
			//if result's length is greater than 0, program ends;
			if(result.length()>0) {
				System.out.println(result);
				System.out.println("Result");
				printGameBoard(gameBoard);
				System.out.println();
				break;
			}
			
			//generates random numbers for inputs of Cashier
			Random rand = new Random();
			int cashPos = rand.nextInt(9) + 1;
			//To check if chosen place is already taken and generates new numbers to input.
			while(playerPositions.contains(cashPos) || cashierPositions.contains(cashPos)) {
				cashPos = rand.nextInt(9) + 1;
			}
			placeInput(gameBoard, cashPos, "Cashier");
			
			//call printGameBoard() after set place of 'X'
			System.out.println();
			printGameBoard(gameBoard);
			
			//call checkWinner() method and print winning message
			result = checkWinner();
			if(result.length()>0) {
				System.out.println(result);
				System.out.println();
				System.out.println("Result");
				printGameBoard(gameBoard);
				System.out.println();
				break;
			}
		}
		if(lost == 1)damage = 5;
		else if(lost == 0)damage = 0;
		Character.growHp(-damage);
		return true;
	}
	
	//Print out gameBoard() method
	public static void printGameBoard(char[][] gameBoard) {

		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	//Place inputs from users
	public static void placeInput(char[][] gameBoard, int pos, String user) {
		
		char symbol = ' ';
		
		//Different inputs from player and cashier
		if(user.equals("player")) {
			symbol = 'X';
			playerPositions.add(pos);
		}
		else if(user.contentEquals("Cashier")) {
			symbol = 'O';
			cashierPositions.add(pos);
		}
		
		//Put 'X' or 'O' on right place on the game board.
		switch(pos) {
			case 1:
				gameBoard[0][0] = symbol;
				break;
			case 2:
				gameBoard[0][2] = symbol;
				break;
			case 3:
				gameBoard[0][4] = symbol;
				break;
			case 4:
				gameBoard[2][0] = symbol;
				break;
			case 5:
				gameBoard[2][2] = symbol;
				break;
			case 6:
				gameBoard[2][4] = symbol;
				break;
			case 7:
				gameBoard[4][0] = symbol;
				break;
			case 8:
				gameBoard[4][2] = symbol;
				break;
			case 9:
				gameBoard[4][4] = symbol;
				break;
			default:
				break;
		}
	}
	
	//Winning condition method
	public static String checkWinner() {
			
		//winning positions check that users' inputs contain these conditions
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(6, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(3, 5, 7);
		
		//contains winning condition in List of List.
		List<List> winningConditions = new ArrayList<List>();
		winningConditions.add(topRow);
		winningConditions.add(midRow);
		winningConditions.add(botRow);
		winningConditions.add(leftCol);
		winningConditions.add(midCol);
		winningConditions.add(rightCol);
		winningConditions.add(cross1);
		winningConditions.add(cross2);
		
		//read all the contents of List
		for(List l : winningConditions) {
			//when player fulfills winning condition
			if(playerPositions.containsAll(l)) {
				return "Congratulations you won!";
			}
			else if(cashierPositions.containsAll(l)) {
				lost++;
				return "I won! Sorry.";
			}
			else if((!playerPositions.containsAll(l) && !cashierPositions.containsAll(l)) && (playerPositions.size() + cashierPositions.size() == 9)) {
				lost++;
				return "DRAW!";
			}
		}	
		return "";		
	}
}
