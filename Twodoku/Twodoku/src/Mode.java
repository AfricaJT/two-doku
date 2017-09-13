import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

public class Mode extends JFrame {

	private JPanel contentPane;
	public static boolean wait = false;
	public static Game2x2 g2;
	public static Game3x3 g3;
	public static Game4x4 g4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mode frame = new Mode();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtrSelectYourMode = new JTextArea();
		txtrSelectYourMode.setForeground(new Color(123, 104, 238));
		txtrSelectYourMode.setFont(new Font("HanziPen TC", Font.BOLD, 30));
		txtrSelectYourMode.setBackground(new Color(230, 230, 250));
		txtrSelectYourMode.setText("Select your mode:");
		txtrSelectYourMode.setBounds(86, 39, 262, 43);
		contentPane.add(txtrSelectYourMode);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("Single player");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Singleplayer Mode = 0 //Launch specific GameSize Frame
				UserProfile.setMode(0);
				setVisible(false);
				if (UserProfile.getWidth() == 2){
					g2 = new Game2x2();
					g2.setVisible(true);
				}
				else 
					if (UserProfile.getWidth() == 3){
						g3 = new Game3x3();
						g3.setVisible(true);
					}
					else 
						if (UserProfile.getWidth() == 4){
							g4 = new Game4x4();
							g4.setVisible(true);
						}
				wait = true;//End While loop - Program continues
				dispose();

			}
		});
		tglbtnNewToggleButton.setForeground(Color.BLUE);
		tglbtnNewToggleButton.setFont(new Font("HanziPen TC", Font.BOLD, 22));
		tglbtnNewToggleButton.setBounds(114, 106, 222, 62);
		contentPane.add(tglbtnNewToggleButton);

		JToggleButton tglbtnPlayerVs = new JToggleButton("Multiplayer");
		tglbtnPlayerVs.addActionListener(new ActionListener() {//Multiplayer Mode = 1 //Launch specific GameSize Frame
			public void actionPerformed(ActionEvent arg0) { 
				UserProfile.setMode(1);
				setVisible(false);
				if (UserProfile.getWidth() == 2){
					g2 = new Game2x2();//Assigns the Game2x2 jFrame to static variable g2 to be referenced to in Twodoku
					g2.setVisible(true);
				}
				else 
					if (UserProfile.getWidth() == 3){
						g3 = new Game3x3();
						g3.setVisible(true);
					}
					else 
						if (UserProfile.getWidth() == 4){
							g4 = new Game4x4();
							g4.setVisible(true);
						}
				wait = true; //End While loop - Program continues
				dispose();

			}
		});
		tglbtnPlayerVs.setForeground(Color.BLUE);
		tglbtnPlayerVs.setFont(new Font("HanziPen TC", Font.BOLD, 22));
		tglbtnPlayerVs.setBounds(114, 180, 222, 62);
		contentPane.add(tglbtnPlayerVs);
	}
}
