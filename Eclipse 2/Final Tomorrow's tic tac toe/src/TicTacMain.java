//project: Tomorrow's tic tac toe
//written by: Ari Steinfeld
//date: May 20, 2020
//description: like normal tic tac toe, but on a 3x4 board instead of a normal one
import java.util.Scanner;

public class TicTacMain {

	public static void main(String[] args) {
		//start variables that need to be initialized
		Scanner s = new Scanner(System.in);
		int [][] array = new int [4] [3];
		int arrayX = 0;
		int arrayY = 0;

		//setting the board to clear
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j<=4; j++) {
				array [arrayX] [arrayY] = 0;
				arrayX++;
			}
			arrayY++;
			arrayX = 0;
		}
		int timesRan = 1;
		int xWin = 0;
		int oWin = 0;
		System.out.println("how many times do you want to run the game?");
		timesRan = s.nextInt();
		for (int i = 1; i <= timesRan; i++) {
			int tempWon = game(array);
			if (tempWon == 1) {
				xWin++;
			}else if (tempWon == 2) {
				oWin++;
			}
			array = clearer(array);
			
		}
		if (oWin > xWin) {
			System.out.println("O wins overall");
		} else if (xWin > oWin) {
			System.out.println("X wins overall");
		}else {
			System.out.println("Tie! wow.");
		}











	}

	//Method: checker
	//Description: goes through the board array and checks if there are any win conditions
	//Parameters: int array [] [] will end up being [4] [3]
	//Return: int win (1 if red wins, 2 if blue wins)
	public static int checker(int array[][]) {
		int arrayX = 0;
		int arrayY = 0;
		int whoWon = 3;
		//checking for x win

		//checking rows
		for (int i = 0; i<= 2; i++) {
			if (array [0][i] == 1 && array [1][i] == 1 && array [2][i] == 1 ) {
				whoWon = 1;
			} else if (array [1][i] == 1 && array [2][i] == 1 && array [3][i] == 1 ) {
				whoWon = 1;
			}
		}

		//checking collums
		for (int i = 0; i <= 2; i++) {
			if (array [i] [0] == 1 && array [i] [1] == 1 && array [i] [2] == 1) {
				whoWon = 1;
			}
		}


		//checking diagonals
		if (array [0] [0] == 1 && array [1] [1] == 1 && array [2] [2] == 1) {
			whoWon = 1;
		} else if (array [1] [0] == 1 && array [2] [1] == 1 && array [3] [2] == 1) {
			whoWon = 1;
		} else if (array [3] [2] == 1 && array [2] [1] == 1 && array [1] [0] == 1) {
			whoWon = 1;
		}else if (array [2] [0] == 1 && array [1] [1] == 1 && array [0] [2] == 1) {
			whoWon = 1;
		}



		//cheching for o win

		//checking rows	
		for (int i = 0; i<= 2; i++) {
			if (array [0][i] == 2 && array [1][i] == 2 && array [2][i] == 2 ) {
				whoWon = 2;
			} else if (array [1][i] == 2 && array [2][i] == 2 && array [3][i] == 2 ) {
				whoWon = 2;
			}
		}


		//checking collums
		for (int i = 0; i <= 2; i++) {
			if (array [i] [0] == 2 && array [i] [1] == 2 && array [i] [2] == 2) {
				whoWon = 2;
			}
		}


		//checking diagonals
		if (array [0] [0] == 2 && array [1] [1] == 2 && array [2] [2] == 2) {
			whoWon = 2;
		} else if (array [1] [0] == 2 && array [2] [1] == 2 && array [3] [2] == 2) {
			whoWon = 2;
		} else if (array [3] [2] == 2 && array [2] [1] == 2 && array [1] [0] == 2) {
			whoWon = 2;
		}else if (array [2] [0] == 2 && array [1] [1] == 2 && array [0] [2] == 2) {
			whoWon = 2;
		}

		//checking for a tie
		int tracker = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j<=4; j++) {
				if (array [arrayX] [arrayY] != 0) {
					tracker++;
				}
				arrayX++;
			}
			arrayY++;
			arrayX = 0;
		}
		if (tracker == 12) {
			whoWon = 0;
		}


		//returning who won
		return whoWon;
	}

	//Method: printer
	//Description: gets passed the game board and prints out the game board
	//Parameters: int array [][], int arrayX, int arrayY
	//Return: void. prints out information instead
	public static void printer(int array [] [], int arrayX, int arrayY) {
		arrayX=0;
		arrayY=0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j<=4; j++) {
				if (array [arrayX] [arrayY] == 0) {
					System.out.print("- ");
				}else if (array [arrayX] [arrayY] == 1) {
					System.out.print("X ");
				}else {
					System.out.print("O ");
				}
				arrayX++;
			}
			arrayY++;
			arrayX = 0;
			System.out.println("");
		}
	}
	//Method: game 
	//Description: runs the tomorrow's tic tac toe game using other methods
	//Parameters: int array [] []
	//Return: 0 if draw, 1 if X won, 2 if O won
	public static int game(int array [] []) {
		Scanner s = new Scanner(System.in);
		int arrayX = 0, arrayY = 0; 
		int arrayX1 = 0; 
		int arrayY1 = 0;
		int winCondition = 3;
		while (winCondition == 3){
			System.out.println("X, where do you want to mark?");
			arrayX = s.nextInt();
			arrayY= s.nextInt();
			if (arrayX > 3 || arrayY > 2) {
				System.out.println("That space does not exist, turn skipped");
			}
			else if (array [arrayX][arrayY] != 0) {
				System.out.println("that space is taken, turn skipped");
			}else {
				System.out.println("Your move was made");
				array [arrayX] [arrayY] = 1;
			}
			printer(array, arrayX1, arrayY1);

			if(checker(array) != 3) {
				winCondition = checker(array);
			} else {
				System.out.println("O, where do you want to mark?");
				arrayX = s.nextInt();
				arrayY= s.nextInt();
				if (arrayX > 3 || arrayY > 2) {
					System.out.println("That space does not exist, turn skipped");
				}
				else if (array [arrayX][arrayY] != 0) {
					System.out.println("that space is taken, turn skipped");
				}else {
					System.out.println("Your move was made");
					array [arrayX] [arrayY] = 2;
				}
				printer(array, arrayX1, arrayY1);
				if(checker(array) != 3) {
					winCondition = checker(array);
				}
			}

		}
		if (winCondition == 1) {
			System.out.println("congradulations X");
		} else if (winCondition == 2) {
			System.out.println("congradulations O");
		} else if (winCondition == 0) {
			System.out.println("wow, a tie! thats hard to get.");
		}

		return winCondition;

	}
	
	//Method: clearer
	//Description: gets passed an array of [4] [3] and sets everything to zero
	//Parameters: int array [4] [3] with changes
	//Return: int array [4] [3] with all spaces set to 0
	public static int[][] clearer(int array [][]) {
		int arrayX = 0;
		int arrayY = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j<=4; j++) {
				array [arrayX] [arrayY] = 0;
				arrayX++;
			}
			arrayY++;
			arrayX = 0;
			
		}
		return array;
	}


//254 is the world's best FRC team. they have the best coding crew
}
