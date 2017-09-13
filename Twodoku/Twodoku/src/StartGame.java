import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartGame extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	public static boolean wait = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGame frame = new StartGame();
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
	public StartGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtrTwodoku = new JTextArea();
		txtrTwodoku.setForeground(Color.BLUE);
		txtrTwodoku.setBackground(new Color(230, 230, 250));
		txtrTwodoku.setFont(new Font("HanziPen SC", Font.BOLD, 45));
		txtrTwodoku.setText("Twodoku");
		txtrTwodoku.setBounds(116, 24, 242, 62);
		contentPane.add(txtrTwodoku);

		JTextArea txtrSelectGridSize = new JTextArea();
		txtrSelectGridSize.setFont(new Font("HanziPen TC", Font.BOLD, 27));
		txtrSelectGridSize.setBackground(new Color(230, 230, 250));
		txtrSelectGridSize.setForeground(new Color(123, 104, 238));
		txtrSelectGridSize.setText("Select your grid size:");
		txtrSelectGridSize.setBounds(75, 84, 325, 39);
		contentPane.add(txtrSelectGridSize);

		JToggleButton tglbtnx = new JToggleButton("2x2");
		tglbtnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Save width to 2x2 in UserProfile Class
				UserProfile.setWidth(2);
				setVisible(false);
				wait = true;//End while loop to continue program
				dispose();//Dispose of JFrame in RAM
				new Mode().setVisible(true);//Open Mode JFrame

			}
		});
		tglbtnx.setFont(new Font("HanziPen TC", Font.BOLD, 20));
		tglbtnx.setBackground(Color.BLACK);
		tglbtnx.setForeground(Color.BLUE);
		tglbtnx.setBounds(142, 135, 165, 41);
		contentPane.add(tglbtnx);

		JToggleButton tglbtnx_1 = new JToggleButton("3x3");
		tglbtnx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Save width to 3x3 in UserProfile Class
				UserProfile.setWidth(3);
				setVisible(false);
				wait = true;//End while loop to continue program
				dispose();//Dispose of JFrame in RAM
				new Mode().setVisible(true);//Open Mode JFrame

			}
		});
		tglbtnx_1.setForeground(Color.BLUE);
		tglbtnx_1.setFont(new Font("HanziPen TC", Font.BOLD, 20));
		tglbtnx_1.setBackground(Color.BLACK);
		tglbtnx_1.setBounds(142, 178, 165, 41);
		contentPane.add(tglbtnx_1);

		JToggleButton tglbtnx_2 = new JToggleButton("4x4");
		tglbtnx_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Save width to 4x4 in UserProfile Class
				UserProfile.setWidth(4);
				setVisible(false);
				wait = true;//End while loop to continue program
				dispose();//Dispose of JFrame in RAM
				new Mode().setVisible(true);//Open Mode JFrame

			}
		});
		tglbtnx_2.setForeground(Color.BLUE);
		tglbtnx_2.setFont(new Font("HanziPen TC", Font.BOLD, 20));
		tglbtnx_2.setBackground(Color.BLACK);
		tglbtnx_2.setBounds(142, 220, 165, 41);
		contentPane.add(tglbtnx_2);
	}

}
