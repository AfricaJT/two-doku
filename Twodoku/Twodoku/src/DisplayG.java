import javax.swing.JTextArea;

public class DisplayG {
	public static JTextArea arrDis2 [] [] = new JTextArea [4][4];
	public static JTextArea arrDis3 [] [] = new JTextArea [9][9];
	public static JTextArea arrDis4 [] [] = new JTextArea [16][16];
	
	public DisplayG () {
		
	}

	public void setArrDis2 (JTextArea area, int x, int y) { //Creates an array of JTextAreas from the jFrame Game2x2
		arrDis2 [x][y] = area;
	}
	public void setArrDis3 (JTextArea area, int x, int y) { //Creates an array of JTextAreas from the jFrame Game3x3
		arrDis3 [x][y] = area;
	}
	public void setArrDis4 (JTextArea area, int x, int y) { //Creates an array of JTextAreas from the jFrame Game4x4
		arrDis4 [x][y] = area;
	}
	
	public static void setTextArea2 (int num, int x, int y){ //Changes the text of a specific JTextArea within an array to display the chosen number on the jFrame
		String text = "";
		if (num < 10){
			text = " " + num; //If single digit then space added before digit
		}
		else {
			text = "" + num;
		}
		arrDis2 [x][y].setText(text);
	}
	public static void setTextArea3 (int num, int x, int y){ //Changes the text of a specific JTextArea within an array to display the chosen number on the jFrame
		String text = "";
		if (num < 10){
			text = " " + num; //If single digit then space added before digit
		}
		else {
			text = "" + num;
		}
		arrDis3 [x][y].setText(text);
	}
	public static void setTextArea4 (int num, int x, int y){ //Changes the text of a specific JTextArea within an array to display the chosen number on the jFrame
		String text = "";
		if (num < 10){
			text = " " + num; //If single digit then space added before digit
		}
		else {
			text = "" + num;
		}
		arrDis4 [x][y].setText(text);
	}
	
	
}
