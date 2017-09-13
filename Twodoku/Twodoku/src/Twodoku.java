import javax.swing.JOptionPane;

public class Twodoku {

	public static void main(String[] args) {

		new UserProfile();
		new StartGame().setVisible(true);
		//StartGame instantiates new Mode() jFrame
		
		while (!StartGame.wait){
			try {//Try Catch Exception for an empty While loop that prevents the computer from putting thread into idle state
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (!Mode.wait){
			try {//Try Catch Exception for an empty While loop that prevents the computer from putting thread into idle state
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//User Selects Size of Grid (2x2, 3x3, 4x4)
		int W = UserProfile.getWidth();
		int M = UserProfile.getMode();
		
		//Instantiate Engine Object
		new Engine (W, M);

		int arrSize = W*W;
		int arr[][] = new int [arrSize][arrSize];

		//if a human plays against a computer
		if (M == 0) {

			boolean valid = false;
			boolean gameOver = true;

			while (gameOver) {
				
				Engine.computersMove(arrSize, arr);
				
				gameOver = Engine.checkMate(arr, arrSize);
				if(!gameOver) {
					System.out.println("You Win!");
					JOptionPane.showMessageDialog(null, "You Win!");
					Engine.delayBanner(3);//Timer 3s and close
				}
				System.out.println("Your Turn ...");
				JOptionPane.showMessageDialog(null, "Your Turn ...");
				Engine.humansMove();
				valid = Engine.checks(arr);
				if (!valid) { ;
					System.out.println("Illegal move!");
					Engine.visibleGame();//Hides the appropriate GameSize Grid
					JOptionPane.showMessageDialog(null, "Illegal Move!");
					Engine.delayBanner(3);//Timer 3s and close
					System.exit(-1);
				}
				
				valid = false;
				Engine.insertMove(arr);
				Engine.displayGrid(arr);
				gameOver = Engine.checkMate(arr, arrSize);
				if(!gameOver) {
					JOptionPane.showMessageDialog(null, "Game Over - Thanks for Playing!");
					Engine.delayBanner(3);//Timer 3s and close
					System.exit(-1);
				}
			}
		}	
		// if two players play against each other
		else if (M == 1) {
			boolean valid = false;
			boolean gameOver = true;

			while (gameOver) {

				Engine.playersTurn();
					Engine.humansMove();
					valid = Engine.checks(arr);
					if (!valid) {
						System.out.println("Illegal Move!");
						JOptionPane.showMessageDialog(null, "Illegal Move!");
						Engine.delayBanner(3);//Timer 3s and close
						System.exit(-1);
				}
				valid = false;
				Engine.insertMove(arr);
				Engine.displayGrid(arr);

				gameOver = Engine.checkMate(arr, arrSize);
				if(!gameOver) {
					JOptionPane.showMessageDialog(null, "Game Over - Thanks for Playing!");
					Engine.delayBanner(3);//Timer 3s and close
					System.exit(-1);
				}
			}
		}

	}

}
