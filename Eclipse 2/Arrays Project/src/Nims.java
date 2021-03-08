//Project Name: Arrays Project
//Project Description: plays a classic game of Nims, which can be found on the internet
//Date: Nov 22, 2020
//Written By: Ari Steinfeld
import java.util.Scanner;

public class Nims {
	private int[]board = new int[] {3,4,5};
	Scanner s = new Scanner(System.in);

	public Nims() {
		this(new int[] {3,4,5});
	}

	public Nims( int[] board) {
		this.board = board;
	}

	//tells how many stones are in each pile
	public void piles() {
		System.out.println("In pile 1 there are " + board[0] + " stones.");
		System.out.println("In pile 2 there are " + board[1] + " stones.");
		System.out.println("In pile 3 there are " + board[2] + " stones.");
	}

	//one turn in the game
	public void turn() {
		System.out.println("which pile would you like to take from");
		int pile = s.nextInt();
		System.out.println("how many would you like to take from that pile?");
		int take = s.nextInt();
		if (pile == 1 || pile == 2 || pile == 3) {
			if (board[pile-1] - take <0) {
				System.out.println("that move is invalid, turn wasted");
			}else {
				board[pile-1] -= take;
			}
		}else {
			System.out.println("that move is invalid, turn wasted");
		}
	}
	//checks to see if someone won
	public Boolean checker() {
		Boolean won = false;
		if (board[0] + board[1] + board[2] == 0) {
			won=true;
		}

		return won;
	}


	//the whole game
	public void game() {
		int whoWon = -1; 
		while (whoWon == -1) {
			System.out.print("Person one, ");
			turn();
			piles();
			if (checker() == true) {
				whoWon = 1;
				System.out.println("Congradulations person one, you WON!");
			}
			if (whoWon != 1) {
				System.out.print("Person two, ");
				turn();
				piles();
				if (checker() == true) {
					whoWon = 2;
					System.out.println("Congradulations person two, you WON!");
				}    
			}
		}
	}

}
