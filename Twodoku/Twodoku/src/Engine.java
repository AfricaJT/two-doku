import java.util.Timer;
import javax.swing.JOptionPane;

public class Engine {
	private static int W;
	private static int M;

	public static int x; //Static to change in GUI Classes
	public static int y;
	public static int m;
	public static boolean madeMove; //Static to change in GUI Classes
	private static int countTurn = 0;

	public Engine ()
	{

	}

	public Engine (int width, int mode)
	{
		W = width;
		M = mode;
	}

	public static void displayGrid(int arr[][]) {
		//display horizontal borders of each block
		for (int row = 0; row < arr.length; row++) 
		{
			for (int i = 1; i <= arr.length; i++)
			{
				if (row%W == 0 && row != arr.length -1 && row != 0)
				{
					if (i%W != 0) //odd
					{ 
						System.out.print("+===");
					} 
					else //even
					{ 
						System.out.print("+===+");
					}
				}
				else 
				{
					if (i%W != 0) //odd
					{ 
						System.out.print("+---");
					} 
					else //even
					{ 
						System.out.print("+---+");
					}
				}
			}

			System.out.println(); //new line
			System.out.print("|"); //left wall of grid
			//display number and vertical borders of each block
			for (int col = 0 ; col < arr.length ; col++) //column
			{
				if (arr[row][col] != 0)
					//add one space if m is two digits to keep shape of grid
					if (m > 9) {
						System.out.print(arr[row][col] + " |");
						displayNum(arr[row][col], row, col); //Display to GUI JFrame
						
						if ((col+1)%W == 0 && col != arr.length-1) //odd
						{ 
							System.out.print("|");
						}
					} else {
						//add two spaces if m is 1 digit
						System.out.print(" " + arr[row][col] + " |");
						displayNum(arr[row][col], row, col); //Display to GUI JFrame
						if ((col+1)%W == 0 && col != arr.length-1) //odd
						{ 
							System.out.print("|");
						}
					}
				else //if the block is empty just add 3 spaces
				{
					System.out.print("   |");
					//add extra vertical border if its also the border of a block
					if ((col+1)%W == 0 && col != arr.length-1) 
					{ 
						System.out.print("|");
					} 
				}
			}
			System.out.println("");
		}
		//add bottom horizontal border
		for (int i = 1; i <= arr.length; i++)
		{
			if (i%W != 0) //odd
			{ 
				System.out.print("+---");
			} 
			else //even
			{ 
				System.out.print("+---+");
			}
		}
		System.out.println();
	}
	public static void displayNum (int num, int x, int y) { //Sets the text of the appropriate textArea Array in DisplayG
		if (W == 2){
			DisplayG.setTextArea2(num, x, y);
		}
		else
			if (W == 3){
				DisplayG.setTextArea3(num, x, y);
			}
			else
				if (W == 4){
					DisplayG.setTextArea4(num, x, y);
				}
	}
	public static void visibleGame(){//Hides the appropriate GameSize Grid
		if (W == 2){
			Mode.g2.setVisible(false); 
		}
		else 
			if (W == 3) {
				Mode.g3.setVisible(false); 
			}
			else
				if (W == 4){
					Mode.g4.setVisible(false); 
				}
		
	}
	
	public static void humansMove() { 
		boolean check = false;
		int width = W*W;
		
		while(!madeMove){//Waits for user to make move
			try {//Try Catch Exception for an empty While loop that prevents the computer from putting thread into idle state
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		madeMove = false;
		
		//check if move within constraints of the grid
		if ( (x <= width && x >= 1) && (y <= width && y >= 1) && (m <= width && y >= 1) ) {
			check = true;
			countTurn ++;
			//create index
			y = y-1;
			x = x-1;
		}
		if (!check) {
			System.out.println("Invalid move!");
			Engine.visibleGame();//Hides the appropriate GameSize Grid
			JOptionPane.showMessageDialog(null, "Invalid Move!");
			delayBanner(3);//Timer 3s and close
			System.exit(-1);
		}
	}
	public static void delayBanner(int num){//Pauses program for (int) seconds
		Timer delay = new Timer();
		delay.schedule(new BannerDelay(delay), num*1000);
	}
	public static void insertMove(int arr[][]) {
		arr[y][x] = m;
	}

	public static void computersMove(int arrSize, int arr [][]) {
		System.out.println("Computer thinking ...");
		JOptionPane.showMessageDialog(null, "Computer Thinking...");//Suspends Program till user acknowledges Computer Thinking
		boolean ans = false;
		while (!ans) { //creating index number

			double randomC = Math.random()*arrSize;
			int column = (int) randomC;
			x = column;	

			double randomR = Math.random()*arrSize;
			int row = (int) randomR;
			y = row;

			double randomN = Math.random()*arrSize;
			int number = (int) randomN + 1;
			m = number;

			ans = checks(arr);
		}
		countTurn ++;
		insertMove(arr);
		displayGrid(arr);
	}

	public static boolean checkMate(int arr[][], int arrSize) {
		boolean ans = false;
		//iterate through number, column and row testing all possible moves
		for (int i = 1; i <= arrSize; i++) {
			m = i;
			for (int j = 0; j < arrSize; j++) {
				y = j;
				for (int k = 0; k < arrSize; k++) {
					x = k;
					ans = checks(arr);
					//exit loop if one legal move is found
					if (ans) { k = arrSize;
					}
				}
				if (ans) { j = arrSize;
				}
			}
			if (ans) { i = arrSize +1;
			}
		}
		//if there's no more legal moves, say who wins
		if ((!ans) && (countTurn %2 == 0)) {
			if (M == 1) {
				System.out.println("Player 2 wins!");//Command Line 
				Engine.visibleGame();//Hides the appropriate GameSize Grid
				JOptionPane.showMessageDialog(null, "Player 2 wins!");
				Engine.delayBanner(3);//Timer 3s and close
			} else {
				System.out.println("You Win!"); //Command Line 
				Engine.visibleGame();//Hides the appropriate GameSize Grid
				JOptionPane.showMessageDialog(null, "You Win!");
				Engine.delayBanner(3);//Timer 3s and close
			}
		}
		if ((!ans) && (countTurn %2 != 0)) {
			if (M == 1) {
				System.out.println("Player 1 wins!");//Command Line 
				Engine.visibleGame();//Hides the appropriate GameSize Grid
				JOptionPane.showMessageDialog(null, "Player 1 Wins!");
				Engine.delayBanner(3);//Timer 3s and close
			} else {
				System.out.println("Computer Wins!"); //Command Line 
				Engine.visibleGame();//Hides the appropriate GameSize Grid
				JOptionPane.showMessageDialog(null, "Computer Wins!");
				Engine.delayBanner(3);//Timer 3s and close
				
			} 
		}
		
		return ans;
	}

	public static boolean checks(int arr[][]) {
		boolean ans = false;
		if ((arr[y][x] == 0) && (Engine.checkRow(arr)) && (Engine.checkColumn(arr)) && (Engine.checkBlock(arr))) {
			ans = true;	
		}
		return ans;
	}

	public static boolean checkColumn(int arr[][]) { 
		boolean ans = true;
		for (int i = 0; i < arr.length; i++) {
			if (m == arr[i][x]) {
				ans = false;
			}
		}
		return ans;
	}

	public static boolean checkRow (int arr[][]) { 
		boolean ans = true; 
		for (int i = 0; i < arr.length; i++) {
			if (m == arr[y][i]) { 
				ans = false; 
			}
		}		
		return ans;
	}

	public static boolean checkBlock(int arr[][]) {
		boolean ans = true;
		int blockX = 0;
		int blockY = 0;
		for (int t = 0; t<W; t++) { //find which block
			if ((x-t)%W == 0) { //column
				blockX = (x-t);
			}
		}
		for (int t = 0; t<W; t++) { //find which block
			if ((y-t)%W == 0) { // row
				blockY = (y-t);
			}
		}
		for (int i = blockX; i<blockX + W; i++) {
			for (int j = blockY; j<blockY + W; j++) {
				if (m == arr[j][i]) {
					ans = false;
				}
			}
		}
		return ans;
	}

	public static void playersTurn() {
		if (countTurn%2 == 0) {
			System.out.println("Player 1's turn");
			JOptionPane.showMessageDialog(null, "Player 1's turn");
		} else { 
			JOptionPane.showMessageDialog(null, "Player 2's turn");
			System.out.println("Player 2's turn");
		}
	}
}


