import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class InvalidMove extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvalidMove frame = new InvalidMove();
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
	public InvalidMove() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrIllegalMove = new JTextArea();
		txtrIllegalMove.setBackground(new Color(230, 230, 250));
		txtrIllegalMove.setForeground(new Color(0, 0, 255));
		txtrIllegalMove.setFont(new Font("HanziPen TC", Font.BOLD, 28));
		txtrIllegalMove.setText("Illegal Move!");
		txtrIllegalMove.setBounds(130, 63, 174, 41);
		contentPane.add(txtrIllegalMove);
		
		JTextArea txtrGameTerminated = new JTextArea();
		txtrGameTerminated.setText("Game terminated!");
		txtrGameTerminated.setForeground(Color.BLUE);
		txtrGameTerminated.setFont(new Font("HanziPen TC", Font.BOLD, 28));
		txtrGameTerminated.setBackground(new Color(230, 230, 250));
		txtrGameTerminated.setBounds(94, 141, 245, 41);
		contentPane.add(txtrGameTerminated);
	}

}
