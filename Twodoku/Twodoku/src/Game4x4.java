import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Game4x4 extends JFrame {

	private JPanel contentPane;
	private JLabel lRow = new JLabel ("Row = ");
	private JLabel lCol = new JLabel ("Col = ");
	private JLabel lValue = new JLabel ("Value = ");
	public static DisplayG dsg = new DisplayG ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game4x4 frame = new Game4x4();
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
	public Game4x4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea00 = new JTextArea();
		textArea00.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea00.setEditable(false);
		textArea00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea00, 0, 0);//Places textArea into DisplayG array = arrDis3
		textArea00.setBounds(10, 46, 30, 30);
		contentPane.add(textArea00);
		
		JTextArea textArea0_1 = new JTextArea();
		textArea0_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_1.setEditable(false);
		textArea0_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_1, 0, 1);
		textArea0_1.setBounds(44, 46, 30, 30);
		contentPane.add(textArea0_1);
		
		JTextArea textArea0_2 = new JTextArea();
		textArea0_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_2.setEditable(false);
		textArea0_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_2, 0, 2);
		textArea0_2.setBounds(78, 46, 30, 30);
		contentPane.add(textArea0_2);
		
		JTextArea textArea0_3 = new JTextArea();
		textArea0_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_3.setEditable(false);
		textArea0_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_3, 0, 3);
		textArea0_3.setBounds(112, 46, 30, 30);
		contentPane.add(textArea0_3);
		
		JTextArea textArea0_4 = new JTextArea();
		textArea0_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_4.setEditable(false);
		textArea0_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_4, 0, 4);
		textArea0_4.setBounds(154, 46, 30, 30);
		contentPane.add(textArea0_4);
		
		JTextArea textArea0_5 = new JTextArea();
		textArea0_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_5.setEditable(false);
		textArea0_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_5, 0, 5);
		textArea0_5.setBounds(188, 46, 30, 30);
		contentPane.add(textArea0_5);
		
		JTextArea textArea0_6 = new JTextArea();
		textArea0_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_6.setEditable(false);
		textArea0_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_6, 0, 6);
		textArea0_6.setBounds(222, 46, 30, 30);
		contentPane.add(textArea0_6);
		
		JTextArea textArea0_7 = new JTextArea();
		textArea0_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_7.setEditable(false);
		textArea0_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_7, 0, 7);
		textArea0_7.setBounds(256, 46, 30, 30);
		contentPane.add(textArea0_7);
		
		JTextArea textArea0_8 = new JTextArea();
		textArea0_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_8.setEditable(false);
		textArea0_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_8, 0, 8);
		textArea0_8.setBounds(298, 46, 30, 30);
		contentPane.add(textArea0_8);
		
		JTextArea textArea0_9 = new JTextArea();
		textArea0_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_9.setEditable(false);
		textArea0_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_9, 0, 9);
		textArea0_9.setBounds(332, 46, 30, 30);
		contentPane.add(textArea0_9);
		
		JTextArea textArea0_10 = new JTextArea();
		textArea0_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_10.setEditable(false);
		textArea0_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_10, 0, 10);
		textArea0_10.setBounds(366, 46, 30, 30);
		contentPane.add(textArea0_10);
		
		JTextArea textArea0_11 = new JTextArea();
		textArea0_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_11.setEditable(false);
		textArea0_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_11, 0, 11);
		textArea0_11.setBounds(400, 46, 30, 30);
		contentPane.add(textArea0_11);
		
		JTextArea textArea0_12 = new JTextArea();
		textArea0_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_12.setEditable(false);
		textArea0_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_12, 0, 12);
		textArea0_12.setBounds(442, 46, 30, 30);
		contentPane.add(textArea0_12);
		
		JTextArea textArea0_13 = new JTextArea();
		textArea0_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_13.setEditable(false);
		textArea0_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_13, 0, 13);
		textArea0_13.setBounds(476, 46, 30, 30);
		contentPane.add(textArea0_13);
		
		JTextArea textArea0_14 = new JTextArea();
		textArea0_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_14.setEditable(false);
		textArea0_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_14, 0, 14);
		textArea0_14.setBounds(510, 46, 30, 30);
		contentPane.add(textArea0_14);
		
		JTextArea textArea0_15 = new JTextArea();
		textArea0_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea0_15.setEditable(false);
		textArea0_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea0_15, 1, 0);
		textArea0_15.setBounds(544, 46, 30, 30);
		contentPane.add(textArea0_15);
		
		JTextArea textArea1_0 = new JTextArea();
		textArea1_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_0.setEditable(false);
		textArea1_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_0, 1, 0);
		textArea1_0.setBounds(10, 83, 30, 30);
		contentPane.add(textArea1_0);
		
		JTextArea textArea1_1 = new JTextArea();
		textArea1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_1.setEditable(false);
		textArea1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_1, 1, 1);
		textArea1_1.setBounds(44, 83, 30, 30);
		contentPane.add(textArea1_1);
		
		JTextArea textArea1_2 = new JTextArea();
		textArea1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_2.setEditable(false);
		textArea1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_2, 1, 2);
		textArea1_2.setBounds(78, 83, 30, 30);
		contentPane.add(textArea1_2);
		
		JTextArea textArea1_3 = new JTextArea();
		textArea1_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_3.setEditable(false);
		textArea1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_3, 1, 3);
		textArea1_3.setBounds(112, 83, 30, 30);
		contentPane.add(textArea1_3);
		
		JTextArea textArea1_4 = new JTextArea();
		textArea1_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_4.setEditable(false);
		textArea1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_4, 1, 4);
		textArea1_4.setBounds(154, 83, 30, 30);
		contentPane.add(textArea1_4);
		
		JTextArea textArea1_5 = new JTextArea();
		textArea1_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_5.setEditable(false);
		textArea1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_5, 1, 5);
		textArea1_5.setBounds(188, 83, 30, 30);
		contentPane.add(textArea1_5);
		
		JTextArea textArea1_6 = new JTextArea();
		textArea1_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_6.setEditable(false);
		textArea1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_6, 1, 6);
		textArea1_6.setBounds(222, 83, 30, 30);
		contentPane.add(textArea1_6);
		
		JTextArea textArea1_7 = new JTextArea();
		textArea1_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_7.setEditable(false);
		textArea1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_7, 1, 7);
		textArea1_7.setBounds(256, 83, 30, 30);
		contentPane.add(textArea1_7);
		
		JTextArea textArea1_8 = new JTextArea();
		textArea1_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_8.setEditable(false);
		textArea1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_8, 1, 8);
		textArea1_8.setBounds(298, 83, 30, 30);
		contentPane.add(textArea1_8);
		
		JTextArea textArea1_9 = new JTextArea();
		textArea1_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_9.setEditable(false);
		textArea1_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_9, 1, 9);
		textArea1_9.setBounds(332, 83, 30, 30);
		contentPane.add(textArea1_9);
		
		JTextArea textArea1_10 = new JTextArea();
		textArea1_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_10.setEditable(false);
		textArea1_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_10, 1, 10);
		textArea1_10.setBounds(366, 83, 30, 30);
		contentPane.add(textArea1_10);
		
		JTextArea textArea1_11 = new JTextArea();
		textArea1_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_11.setEditable(false);
		textArea1_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_11, 1, 11);
		textArea1_11.setBounds(400, 83, 30, 30);
		contentPane.add(textArea1_11);
		
		JTextArea textArea1_12 = new JTextArea();
		textArea1_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_12.setEditable(false);
		textArea1_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_12, 1, 12);
		textArea1_12.setBounds(442, 83, 30, 30);
		contentPane.add(textArea1_12);
		
		JTextArea textArea1_13 = new JTextArea();
		textArea1_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_13.setEditable(false);
		textArea1_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_13, 1, 15);
		textArea1_13.setBounds(476, 83, 30, 30);
		contentPane.add(textArea1_13);
		
		JTextArea textArea1_14 = new JTextArea();
		textArea1_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_14.setEditable(false);
		textArea1_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_14, 1, 14);
		textArea1_14.setBounds(510, 83, 30, 30);
		contentPane.add(textArea1_14);
		
		JTextArea textArea1_15 = new JTextArea();
		textArea1_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea1_15.setEditable(false);
		textArea1_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 2;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea1_15, 1, 15);
		textArea1_15.setBounds(544, 83, 30, 30);
		contentPane.add(textArea1_15);
		
		JTextArea textArea2_0 = new JTextArea();
		textArea2_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_0.setEditable(false);
		textArea2_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_0, 2, 0);
		textArea2_0.setBounds(10, 120, 30, 30);
		contentPane.add(textArea2_0);
		
		JTextArea textArea2_1 = new JTextArea();
		textArea2_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_1.setEditable(false);
		textArea2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_1, 2, 1);
		textArea2_1.setBounds(44, 120, 30, 30);
		contentPane.add(textArea2_1);
		
		JTextArea textArea2_2 = new JTextArea();
		textArea2_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_2.setEditable(false);
		textArea2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_2, 2, 2);
		textArea2_2.setBounds(78, 120, 30, 30);
		contentPane.add(textArea2_2);
		
		JTextArea textArea2_3 = new JTextArea();
		textArea2_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_3.setEditable(false);
		textArea2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_3, 2, 3);
		textArea2_3.setBounds(112, 120, 30, 30);
		contentPane.add(textArea2_3);
		
		JTextArea textArea2_4 = new JTextArea();
		textArea2_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_4.setEditable(false);
		textArea2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_4, 2, 4);
		textArea2_4.setBounds(154, 120, 30, 30);
		contentPane.add(textArea2_4);
		
		JTextArea textArea2_5 = new JTextArea();
		textArea2_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_5.setEditable(false);
		textArea2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_5, 2, 5);
		textArea2_5.setBounds(188, 120, 30, 30);
		contentPane.add(textArea2_5);
		
		JTextArea textArea2_6 = new JTextArea();
		textArea2_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_6.setEditable(false);
		textArea2_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_6, 2, 6);
		textArea2_6.setBounds(222, 120, 30, 30);
		contentPane.add(textArea2_6);
		
		JTextArea textArea2_7 = new JTextArea();
		textArea2_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_7.setEditable(false);
		textArea2_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_7, 2, 7);
		textArea2_7.setBounds(256, 120, 30, 30);
		contentPane.add(textArea2_7);
		
		JTextArea textArea2_8 = new JTextArea();
		textArea2_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_8.setEditable(false);
		textArea2_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_8, 2, 8);
		textArea2_8.setBounds(298, 120, 30, 30);
		contentPane.add(textArea2_8);
		
		JTextArea textArea2_9 = new JTextArea();
		textArea2_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_9.setEditable(false);
		textArea2_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_9, 2, 9);
		textArea2_9.setBounds(332, 120, 30, 30);
		contentPane.add(textArea2_9);
		
		JTextArea textArea2_10 = new JTextArea();
		textArea2_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_10.setEditable(false);
		textArea2_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_10, 2, 10);
		textArea2_10.setBounds(366, 120, 30, 30);
		contentPane.add(textArea2_10);
		
		JTextArea textArea2_11 = new JTextArea();
		textArea2_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_11.setEditable(false);
		textArea2_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_11, 2, 11);
		textArea2_11.setBounds(400, 120, 30, 30);
		contentPane.add(textArea2_11);
		
		JTextArea textArea2_12 = new JTextArea();
		textArea2_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_12.setEditable(false);
		textArea2_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_12, 2, 12);
		textArea2_12.setBounds(442, 120, 30, 30);
		contentPane.add(textArea2_12);
		
		JTextArea textArea2_13 = new JTextArea();
		textArea2_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_13.setEditable(false);
		textArea2_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_13, 2, 13);
		textArea2_13.setBounds(476, 120, 30, 30);
		contentPane.add(textArea2_13);
		
		JTextArea textArea2_14 = new JTextArea();
		textArea2_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_14.setEditable(false);
		textArea2_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_14, 2, 14);
		textArea2_14.setBounds(510, 120, 30, 30);
		contentPane.add(textArea2_14);
		
		JTextArea textArea2_15 = new JTextArea();
		textArea2_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea2_15.setEditable(false);
		textArea2_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 3;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea2_15, 2, 15);
		textArea2_15.setBounds(544, 120, 30, 30);
		contentPane.add(textArea2_15);
		
		JTextArea textArea3_0 = new JTextArea();
		textArea3_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_0.setEditable(false);
		textArea3_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_0, 3, 0);
		textArea3_0.setBounds(10, 157, 30, 30);
		contentPane.add(textArea3_0);
		
		JTextArea textArea3_1 = new JTextArea();
		textArea3_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_1.setEditable(false);
		textArea3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_1, 3, 1);
		textArea3_1.setBounds(44, 157, 30, 30);
		contentPane.add(textArea3_1);
		
		JTextArea textArea3_2 = new JTextArea();
		textArea3_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_2.setEditable(false);
		textArea3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_2, 3, 2);
		textArea3_2.setBounds(78, 157, 30, 30);
		contentPane.add(textArea3_2);
		
		JTextArea textArea3_3 = new JTextArea();
		textArea3_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_3.setEditable(false);
		textArea3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_3, 3, 3);
		textArea3_3.setBounds(112, 157, 30, 30);
		contentPane.add(textArea3_3);
		
		JTextArea textArea3_4 = new JTextArea();
		textArea3_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_4.setEditable(false);
		textArea3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_4, 3, 4);
		textArea3_4.setBounds(154, 157, 30, 30);
		contentPane.add(textArea3_4);
		
		JTextArea textArea3_5 = new JTextArea();
		textArea3_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_5.setEditable(false);
		textArea3_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_5, 3, 5);
		textArea3_5.setBounds(188, 157, 30, 30);
		contentPane.add(textArea3_5);
		
		JTextArea textArea3_6 = new JTextArea();
		textArea3_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_6.setEditable(false);
		textArea3_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_6, 3, 6);
		textArea3_6.setBounds(222, 157, 30, 30);
		contentPane.add(textArea3_6);
		
		JTextArea textArea3_7 = new JTextArea();
		textArea3_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_7.setEditable(false);
		textArea3_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_7, 3, 7);
		textArea3_7.setBounds(256, 157, 30, 30);
		contentPane.add(textArea3_7);
		
		JTextArea textArea3_8 = new JTextArea();
		textArea3_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_8.setEditable(false);
		textArea3_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_8, 3, 8);
		textArea3_8.setBounds(298, 157, 30, 30);
		contentPane.add(textArea3_8);
		
		JTextArea textArea3_9 = new JTextArea();
		textArea3_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_9.setEditable(false);
		textArea3_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_9, 3, 9);
		textArea3_9.setBounds(332, 157, 30, 30);
		contentPane.add(textArea3_9);
		
		JTextArea textArea3_10 = new JTextArea();
		textArea3_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_10.setEditable(false);
		textArea3_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_10, 3, 10);
		textArea3_10.setBounds(366, 157, 30, 30);
		contentPane.add(textArea3_10);
		
		JTextArea textArea3_11 = new JTextArea();
		textArea3_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_11.setEditable(false);
		textArea3_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_11, 3, 11);
		textArea3_11.setBounds(400, 157, 30, 30);
		contentPane.add(textArea3_11);
		
		JTextArea textArea3_12 = new JTextArea();
		textArea3_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_12.setEditable(false);
		textArea3_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_12, 3, 12);
		textArea3_12.setBounds(442, 157, 30, 30);
		contentPane.add(textArea3_12);
		
		JTextArea textArea3_13 = new JTextArea();
		textArea3_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_13.setEditable(false);
		textArea3_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_13, 3, 13);
		textArea3_13.setBounds(476, 157, 30, 30);
		contentPane.add(textArea3_13);
		
		JTextArea textArea3_14 = new JTextArea();
		textArea3_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_14.setEditable(false);
		textArea3_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_14, 3, 14);
		textArea3_14.setBounds(510, 157, 30, 30);
		contentPane.add(textArea3_14);
		
		JTextArea textArea3_15 = new JTextArea();
		textArea3_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea3_15.setEditable(false);
		textArea3_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 4;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea3_15, 3, 15);
		textArea3_15.setBounds(544, 157, 30, 30);
		contentPane.add(textArea3_15);
		
		JTextArea textArea4_0 = new JTextArea();
		textArea4_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_0.setEditable(false);
		textArea4_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_0, 4, 0);
		textArea4_0.setBounds(10, 199, 30, 30);
		contentPane.add(textArea4_0);
		
		JTextArea textArea4_1 = new JTextArea();
		textArea4_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_1.setEditable(false);
		textArea4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_1, 4, 1);
		textArea4_1.setBounds(44, 199, 30, 30);
		contentPane.add(textArea4_1);
		
		JTextArea textArea4_2 = new JTextArea();
		textArea4_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_2.setEditable(false);
		textArea4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_2, 4, 2);
		textArea4_2.setBounds(78, 199, 30, 30);
		contentPane.add(textArea4_2);
		
		JTextArea textArea4_3 = new JTextArea();
		textArea4_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_3.setEditable(false);
		textArea4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_3, 4, 3);
		textArea4_3.setBounds(112, 199, 30, 30);
		contentPane.add(textArea4_3);
		
		JTextArea textArea4_4 = new JTextArea();
		textArea4_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_4.setEditable(false);
		textArea4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_4, 4, 4);
		textArea4_4.setBounds(154, 199, 30, 30);
		contentPane.add(textArea4_4);
		
		JTextArea textArea4_5 = new JTextArea();
		textArea4_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_5.setEditable(false);
		textArea4_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_5, 4, 5);
		textArea4_5.setBounds(188, 199, 30, 30);
		contentPane.add(textArea4_5);
		
		JTextArea textArea4_6 = new JTextArea();
		textArea4_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_6.setEditable(false);
		textArea4_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_6, 4, 6);
		textArea4_6.setBounds(222, 199, 30, 30);
		contentPane.add(textArea4_6);
		
		JTextArea textArea4_7 = new JTextArea();
		textArea4_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_7.setEditable(false);
		textArea4_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_7, 4, 7);
		textArea4_7.setBounds(256, 199, 30, 30);
		contentPane.add(textArea4_7);
		
		JTextArea textArea4_8 = new JTextArea();
		textArea4_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_8.setEditable(false);
		textArea4_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_8, 4, 8);
		textArea4_8.setBounds(298, 199, 30, 30);
		contentPane.add(textArea4_8);
		
		JTextArea textArea4_9 = new JTextArea();
		textArea4_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_9.setEditable(false);
		textArea4_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_9, 4, 9);
		textArea4_9.setBounds(332, 199, 30, 30);
		contentPane.add(textArea4_9);
		
		JTextArea textArea4_10 = new JTextArea();
		textArea4_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_10.setEditable(false);
		textArea4_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_10, 4, 10);
		textArea4_10.setBounds(366, 199, 30, 30);
		contentPane.add(textArea4_10);
		
		JTextArea textArea4_11 = new JTextArea();
		textArea4_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_11.setEditable(false);
		textArea4_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_11, 4, 11);
		textArea4_11.setBounds(400, 199, 30, 30);
		contentPane.add(textArea4_11);
		
		JTextArea textArea4_12 = new JTextArea();
		textArea4_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_12.setEditable(false);
		textArea4_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_12, 4, 12);
		textArea4_12.setBounds(442, 199, 30, 30);
		contentPane.add(textArea4_12);
		
		JTextArea textArea4_13 = new JTextArea();
		textArea4_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_13.setEditable(false);
		textArea4_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_13, 4, 13);
		textArea4_13.setBounds(476, 199, 30, 30);
		contentPane.add(textArea4_13);
		
		JTextArea textArea4_14 = new JTextArea();
		textArea4_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_14.setEditable(false);
		textArea4_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_14, 4, 14);
		textArea4_14.setBounds(510, 199, 30, 30);
		contentPane.add(textArea4_14);
		
		JTextArea textArea4_15 = new JTextArea();
		textArea4_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea4_15.setEditable(false);
		textArea4_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 5;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea4_15, 4, 15);
		textArea4_15.setBounds(544, 199, 30, 30);
		contentPane.add(textArea4_15);
		
		JTextArea textArea5_0 = new JTextArea();
		textArea5_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_0.setEditable(false);
		textArea5_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_0, 5, 0);
		textArea5_0.setBounds(10, 236, 30, 30);
		contentPane.add(textArea5_0);
		
		JTextArea textArea5_1 = new JTextArea();
		textArea5_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_1.setEditable(false);
		textArea5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_1, 5, 1);
		textArea5_1.setBounds(44, 236, 30, 30);
		contentPane.add(textArea5_1);
		
		JTextArea textArea5_2 = new JTextArea();
		textArea5_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_2.setEditable(false);
		textArea5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_2, 5, 2);
		textArea5_2.setBounds(78, 236, 30, 30);
		contentPane.add(textArea5_2);
		
		JTextArea textArea5_3 = new JTextArea();
		textArea5_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_3.setEditable(false);
		textArea5_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_3, 5, 3);
		textArea5_3.setBounds(112, 236, 30, 30);
		contentPane.add(textArea5_3);
		
		JTextArea textArea5_4 = new JTextArea();
		textArea5_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_4.setEditable(false);
		textArea5_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_4, 5, 4);
		textArea5_4.setBounds(154, 236, 30, 30);
		contentPane.add(textArea5_4);
		
		JTextArea textArea5_5 = new JTextArea();
		textArea5_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_5.setEditable(false);
		textArea5_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_5, 5, 5);
		textArea5_5.setBounds(188, 236, 30, 30);
		contentPane.add(textArea5_5);
		
		JTextArea textArea5_6 = new JTextArea();
		textArea5_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_6.setEditable(false);
		textArea5_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_6, 5, 6);
		textArea5_6.setBounds(222, 236, 30, 30);
		contentPane.add(textArea5_6);
		
		JTextArea textArea5_7 = new JTextArea();
		textArea5_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_7.setEditable(false);
		textArea5_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_7, 5, 7);
		textArea5_7.setBounds(256, 236, 30, 30);
		contentPane.add(textArea5_7);
		
		JTextArea textArea5_8 = new JTextArea();
		textArea5_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_8.setEditable(false);
		textArea5_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_8, 5, 8);
		textArea5_8.setBounds(298, 236, 30, 30);
		contentPane.add(textArea5_8);
		
		JTextArea textArea5_9 = new JTextArea();
		textArea5_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_9.setEditable(false);
		textArea5_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_9, 5, 9);
		textArea5_9.setBounds(332, 236, 30, 30);
		contentPane.add(textArea5_9);
		
		JTextArea textArea5_10 = new JTextArea();
		textArea5_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_10.setEditable(false);
		textArea5_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_10, 5, 10);
		textArea5_10.setBounds(366, 236, 30, 30);
		contentPane.add(textArea5_10);
		
		JTextArea textArea5_11 = new JTextArea();
		textArea5_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_11.setEditable(false);
		textArea5_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_11, 5, 11);
		textArea5_11.setBounds(400, 236, 30, 30);
		contentPane.add(textArea5_11);
		
		JTextArea textArea5_12 = new JTextArea();
		textArea5_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_12.setEditable(false);
		textArea5_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_12, 5, 12);
		textArea5_12.setBounds(442, 236, 30, 30);
		contentPane.add(textArea5_12);
		
		JTextArea textArea5_13 = new JTextArea();
		textArea5_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_13.setEditable(false);
		textArea5_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_13, 5, 13);
		textArea5_13.setBounds(476, 236, 30, 30);
		contentPane.add(textArea5_13);
		
		JTextArea textArea5_14 = new JTextArea();
		textArea5_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_14.setEditable(false);
		textArea5_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_14, 5, 14);
		textArea5_14.setBounds(510, 236, 30, 30);
		contentPane.add(textArea5_14);
		
		JTextArea textArea5_15 = new JTextArea();
		textArea5_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea5_15.setEditable(false);
		textArea5_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 6;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea5_15, 5, 15);
		textArea5_15.setBounds(544, 236, 30, 30);
		contentPane.add(textArea5_15);
		
		JTextArea textArea6_0 = new JTextArea();
		textArea6_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea6_0.setEditable(false);
		textArea6_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea6_0, 6, 0);
		textArea6_0.setBounds(10, 273, 30, 30);
		contentPane.add(textArea6_0);
		
		JTextArea tArea6_1 = new JTextArea();
		tArea6_1.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_1.setEditable(false);
		tArea6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_1, 6, 1);
		tArea6_1.setBounds(44, 273, 30, 30);
		contentPane.add(tArea6_1);
		
		JTextArea tArea6_2 = new JTextArea();
		tArea6_2.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_2.setEditable(false);
		tArea6_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_2, 6, 2);
		tArea6_2.setBounds(78, 273, 30, 30);
		contentPane.add(tArea6_2);
		
		JTextArea tArea6_3 = new JTextArea();
		tArea6_3.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_3.setEditable(false);
		tArea6_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_3, 6, 3);
		tArea6_3.setBounds(112, 273, 30, 30);
		contentPane.add(tArea6_3);
		
		JTextArea tArea6_4 = new JTextArea();
		tArea6_4.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_4.setEditable(false);
		tArea6_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_4, 6, 4);
		tArea6_4.setBounds(154, 273, 30, 30);
		contentPane.add(tArea6_4);
		
		JTextArea tArea6_5 = new JTextArea();
		tArea6_5.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_5.setEditable(false);
		tArea6_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_5, 6, 5);
		tArea6_5.setBounds(188, 273, 30, 30);
		contentPane.add(tArea6_5);
		
		JTextArea tArea6_6 = new JTextArea();
		tArea6_6.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_6.setEditable(false);
		tArea6_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_6, 6, 6);
		tArea6_6.setBounds(222, 273, 30, 30);
		contentPane.add(tArea6_6);
		
		JTextArea tArea6_7 = new JTextArea();
		tArea6_7.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_7.setEditable(false);
		tArea6_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_7, 6, 7);
		tArea6_7.setBounds(256, 273, 30, 30);
		contentPane.add(tArea6_7);
		
		JTextArea tArea6_8 = new JTextArea();
		tArea6_8.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_8.setEditable(false);
		tArea6_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_8, 6, 8);
		tArea6_8.setBounds(298, 273, 30, 30);
		contentPane.add(tArea6_8);
		
		JTextArea tArea6_9 = new JTextArea();
		tArea6_9.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_9.setEditable(false);
		tArea6_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_9, 6, 9);
		tArea6_9.setBounds(332, 273, 30, 30);
		contentPane.add(tArea6_9);
		
		JTextArea tArea6_10 = new JTextArea();
		tArea6_10.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_10.setEditable(false);
		tArea6_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_10, 6, 10);
		tArea6_10.setBounds(366, 273, 30, 30);
		contentPane.add(tArea6_10);
		
		JTextArea tArea6_11 = new JTextArea();
		tArea6_11.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_11.setEditable(false);
		tArea6_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_11, 6, 11);
		tArea6_11.setBounds(400, 273, 30, 30);
		contentPane.add(tArea6_11);
		
		JTextArea tArea6_12 = new JTextArea();
		tArea6_12.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_12.setEditable(false);
		tArea6_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_12, 6, 12);
		tArea6_12.setBounds(442, 273, 30, 30);
		contentPane.add(tArea6_12);
		
		JTextArea tArea6_13 = new JTextArea();
		tArea6_13.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_13.setEditable(false);
		tArea6_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_13, 6, 13);
		tArea6_13.setBounds(476, 273, 30, 30);
		contentPane.add(tArea6_13);
		
		JTextArea tArea6_14 = new JTextArea();
		tArea6_14.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_14.setEditable(false);
		tArea6_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_14, 6, 14);
		tArea6_14.setBounds(510, 273, 30, 30);
		contentPane.add(tArea6_14);
		
		JTextArea tArea6_15 = new JTextArea();
		tArea6_15.setFont(new Font("Dialog", Font.BOLD, 20));
		tArea6_15.setEditable(false);
		tArea6_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 7;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (tArea6_15, 6, 15);
		tArea6_15.setBounds(544, 273, 30, 30);
		contentPane.add(tArea6_15);
		
		JTextArea textArea7_0 = new JTextArea();
		textArea7_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_0.setEditable(false);
		textArea7_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_0, 7, 0);
		textArea7_0.setBounds(10, 310, 30, 30);
		contentPane.add(textArea7_0);
		
		JTextArea textArea7_1 = new JTextArea();
		textArea7_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_1.setEditable(false);
		textArea7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_1, 7, 1);
		textArea7_1.setBounds(44, 310, 30, 30);
		contentPane.add(textArea7_1);
		
		JTextArea textArea7_2 = new JTextArea();
		textArea7_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_2.setEditable(false);
		textArea7_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_2, 7, 2);
		textArea7_2.setBounds(78, 310, 30, 30);
		contentPane.add(textArea7_2);
		
		JTextArea textArea7_3 = new JTextArea();
		textArea7_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_3.setEditable(false);
		textArea7_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_3, 7, 3);
		textArea7_3.setBounds(112, 310, 30, 30);
		contentPane.add(textArea7_3);
		
		JTextArea textArea7_4 = new JTextArea();
		textArea7_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_4.setEditable(false);
		textArea7_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_4, 7, 4);
		textArea7_4.setBounds(154, 310, 30, 30);
		contentPane.add(textArea7_4);
		
		JTextArea textArea7_5 = new JTextArea();
		textArea7_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_5.setEditable(false);
		textArea7_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_5, 7, 5);
		textArea7_5.setBounds(188, 310, 30, 30);
		contentPane.add(textArea7_5);
		
		JTextArea textArea7_6 = new JTextArea();
		textArea7_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_6.setEditable(false);
		textArea7_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_6, 7, 6);
		textArea7_6.setBounds(222, 310, 30, 30);
		contentPane.add(textArea7_6);
		
		JTextArea textArea7_7 = new JTextArea();
		textArea7_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_7.setEditable(false);
		textArea7_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_7, 7, 7);
		textArea7_7.setBounds(256, 310, 30, 30);
		contentPane.add(textArea7_7);
		
		JTextArea textArea7_8 = new JTextArea();
		textArea7_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_8.setEditable(false);
		textArea7_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_8, 7, 8);
		textArea7_8.setBounds(298, 310, 30, 30);
		contentPane.add(textArea7_8);
		
		JTextArea textArea7_9 = new JTextArea();
		textArea7_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_9.setEditable(false);
		textArea7_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_9, 7, 9);
		textArea7_9.setBounds(332, 310, 30, 30);
		contentPane.add(textArea7_9);
		
		JTextArea textArea7_10 = new JTextArea();
		textArea7_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_10.setEditable(false);
		textArea7_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_10, 7, 10);
		textArea7_10.setBounds(366, 310, 30, 30);
		contentPane.add(textArea7_10);
		
		JTextArea textArea7_11 = new JTextArea();
		textArea7_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_11.setEditable(false);
		textArea7_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_11, 7, 11);
		textArea7_11.setBounds(400, 310, 30, 30);
		contentPane.add(textArea7_11);
		
		JTextArea textArea7_12 = new JTextArea();
		textArea7_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_12.setEditable(false);
		textArea7_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_12, 7, 12);
		textArea7_12.setBounds(442, 310, 30, 30);
		contentPane.add(textArea7_12);
		
		JTextArea textArea7_13 = new JTextArea();
		textArea7_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_13.setEditable(false);
		textArea7_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_13, 7, 13);
		textArea7_13.setBounds(476, 310, 30, 30);
		contentPane.add(textArea7_13);
		
		JTextArea textArea7_14 = new JTextArea();
		textArea7_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_14.setEditable(false);
		textArea7_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_14, 7, 14);
		textArea7_14.setBounds(510, 310, 30, 30);
		contentPane.add(textArea7_14);
		
		JTextArea textArea7_15 = new JTextArea();
		textArea7_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea7_15.setEditable(false);
		textArea7_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 8;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea7_15, 7, 15);
		textArea7_15.setBounds(544, 310, 30, 30);
		contentPane.add(textArea7_15);
		
		JTextArea textArea8_0 = new JTextArea();
		textArea8_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_0.setEditable(false);
		textArea8_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;//Actual Row Number
				Engine.x = 1;//Actual Col Number
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_0, 8, 0);//Places textArea into DisplayG array = arrDis4
		textArea8_0.setBounds(10, 352, 30, 30);
		contentPane.add(textArea8_0);
		
		JTextArea textArea8_1 = new JTextArea();
		textArea8_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_1.setEditable(false);
		textArea8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_1, 8, 1);
		textArea8_1.setBounds(44, 352, 30, 30);
		contentPane.add(textArea8_1);
		
		JTextArea textArea8_2 = new JTextArea();
		textArea8_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_2.setEditable(false);
		textArea8_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_2, 8, 2);
		textArea8_2.setBounds(78, 352, 30, 30);
		contentPane.add(textArea8_2);
		
		JTextArea textArea8_3 = new JTextArea();
		textArea8_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_3.setEditable(false);
		textArea8_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_3, 8, 3);
		textArea8_3.setBounds(112, 352, 30, 30);
		contentPane.add(textArea8_3);
		
		JTextArea textArea8_4 = new JTextArea();
		textArea8_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_4.setEditable(false);
		textArea8_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_4, 8, 4);
		textArea8_4.setBounds(154, 352, 30, 30);
		contentPane.add(textArea8_4);
		
		JTextArea textArea8_5 = new JTextArea();
		textArea8_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_5.setEditable(false);
		textArea8_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_5, 8, 5);
		textArea8_5.setBounds(188, 352, 30, 30);
		contentPane.add(textArea8_5);
		
		JTextArea textArea8_6 = new JTextArea();
		textArea8_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_6.setEditable(false);
		textArea8_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_6, 8, 6);
		textArea8_6.setBounds(222, 352, 30, 30);
		contentPane.add(textArea8_6);
		
		JTextArea textArea8_7 = new JTextArea();
		textArea8_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_7.setEditable(false);
		textArea8_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_7, 8, 7);
		textArea8_7.setBounds(256, 352, 30, 30);
		contentPane.add(textArea8_7);
		
		JTextArea textArea8_8 = new JTextArea();
		textArea8_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_8.setEditable(false);
		textArea8_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_8, 8, 8);
		textArea8_8.setBounds(298, 352, 30, 30);
		contentPane.add(textArea8_8);
		
		JTextArea textArea8_9 = new JTextArea();
		textArea8_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_9.setEditable(false);
		textArea8_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_9, 8, 9);
		textArea8_9.setBounds(332, 352, 30, 30);
		contentPane.add(textArea8_9);
		
		JTextArea textArea8_10 = new JTextArea();
		textArea8_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_10.setEditable(false);
		textArea8_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_10, 8, 10);
		textArea8_10.setBounds(366, 352, 30, 30);
		contentPane.add(textArea8_10);
		
		JTextArea textArea8_11 = new JTextArea();
		textArea8_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_11.setEditable(false);
		textArea8_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_11, 8, 11);
		textArea8_11.setBounds(400, 352, 30, 30);
		contentPane.add(textArea8_11);
		
		JTextArea textArea8_12 = new JTextArea();
		textArea8_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_12.setEditable(false);
		textArea8_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_12, 8, 12);
		textArea8_12.setBounds(442, 352, 30, 30);
		contentPane.add(textArea8_12);
		
		JTextArea textArea8_13 = new JTextArea();
		textArea8_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_13.setEditable(false);
		textArea8_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_13, 8, 13);
		textArea8_13.setBounds(476, 352, 30, 30);
		contentPane.add(textArea8_13);
		
		JTextArea textArea8_14 = new JTextArea();
		textArea8_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_14.setEditable(false);
		textArea8_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_14, 8, 14);
		textArea8_14.setBounds(510, 352, 30, 30);
		contentPane.add(textArea8_14);
		
		JTextArea textArea8_15 = new JTextArea();
		textArea8_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea8_15.setEditable(false);
		textArea8_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 9;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea8_15, 8, 15);
		textArea8_15.setBounds(544, 352, 30, 30);
		contentPane.add(textArea8_15);
		
		JTextArea textArea9_0 = new JTextArea();
		textArea9_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_0.setEditable(false);
		textArea9_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_0, 9, 0);
		textArea9_0.setBounds(10, 389, 30, 30);
		contentPane.add(textArea9_0);
		
		JTextArea textArea9_1 = new JTextArea();
		textArea9_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_1.setEditable(false);
		textArea9_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_1, 9, 1);
		textArea9_1.setBounds(44, 389, 30, 30);
		contentPane.add(textArea9_1);
		
		JTextArea textArea9_2 = new JTextArea();
		textArea9_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_2.setEditable(false);
		textArea9_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_2, 9, 2);
		textArea9_2.setBounds(78, 389, 30, 30);
		contentPane.add(textArea9_2);
		
		JTextArea textArea9_3 = new JTextArea();
		textArea9_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_3.setEditable(false);
		textArea9_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_3, 9, 3);
		textArea9_3.setBounds(112, 389, 30, 30);
		contentPane.add(textArea9_3);
		
		JTextArea textArea9_4 = new JTextArea();
		textArea9_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_4.setEditable(false);
		textArea9_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_4, 9, 4);
		textArea9_4.setBounds(154, 389, 30, 30);
		contentPane.add(textArea9_4);
		
		JTextArea textArea9_5 = new JTextArea();
		textArea9_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_5.setEditable(false);
		textArea9_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_5, 9, 5);
		textArea9_5.setBounds(188, 389, 30, 30);
		contentPane.add(textArea9_5);
		
		JTextArea textArea9_6 = new JTextArea();
		textArea9_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_6.setEditable(false);
		textArea9_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_6, 9, 6);
		textArea9_6.setBounds(222, 389, 30, 30);
		contentPane.add(textArea9_6);
		
		JTextArea textArea9_7 = new JTextArea();
		textArea9_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_7.setEditable(false);
		textArea9_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_7, 9, 7);
		textArea9_7.setBounds(256, 389, 30, 30);
		contentPane.add(textArea9_7);
		
		JTextArea textArea9_8 = new JTextArea();
		textArea9_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_8.setEditable(false);
		textArea9_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_8, 9, 8);
		textArea9_8.setBounds(298, 389, 30, 30);
		contentPane.add(textArea9_8);
		
		JTextArea textArea9_9 = new JTextArea();
		textArea9_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_9.setEditable(false);
		textArea9_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_9, 9, 9);
		textArea9_9.setBounds(332, 389, 30, 30);
		contentPane.add(textArea9_9);
		
		JTextArea textArea9_10 = new JTextArea();
		textArea9_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_10.setEditable(false);
		textArea9_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_10, 9, 10);
		textArea9_10.setBounds(366, 389, 30, 30);
		contentPane.add(textArea9_10);
		
		JTextArea textArea9_11 = new JTextArea();
		textArea9_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_11.setEditable(false);
		textArea9_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_11, 9, 11);
		textArea9_11.setBounds(400, 389, 30, 30);
		contentPane.add(textArea9_11);
		
		JTextArea textArea9_12 = new JTextArea();
		textArea9_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_12.setEditable(false);
		textArea9_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_12, 9, 12);
		textArea9_12.setBounds(442, 389, 30, 30);
		contentPane.add(textArea9_12);
		
		JTextArea textArea9_13 = new JTextArea();
		textArea9_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_13.setEditable(false);
		textArea9_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_13, 9, 13);
		textArea9_13.setBounds(476, 389, 30, 30);
		contentPane.add(textArea9_13);
		
		JTextArea textArea9_14 = new JTextArea();
		textArea9_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_14.setEditable(false);
		textArea9_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_14, 9, 14);
		textArea9_14.setBounds(510, 389, 30, 30);
		contentPane.add(textArea9_14);
		
		JTextArea textArea9_15 = new JTextArea();
		textArea9_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea9_15.setEditable(false);
		textArea9_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 10;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea9_15, 9, 15);
		textArea9_15.setBounds(544, 389, 30, 30);
		contentPane.add(textArea9_15);
		
		JTextArea textArea10_0 = new JTextArea();
		textArea10_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_0.setEditable(false);
		textArea10_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_0, 10, 0);
		textArea10_0.setBounds(10, 426, 30, 30);
		contentPane.add(textArea10_0);
		
		JTextArea textArea10_1 = new JTextArea();
		textArea10_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_1.setEditable(false);
		textArea10_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_1, 10, 1);
		textArea10_1.setBounds(44, 426, 30, 30);
		contentPane.add(textArea10_1);
		
		JTextArea textArea10_2 = new JTextArea();
		textArea10_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_2.setEditable(false);
		textArea10_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_2, 10, 2);
		textArea10_2.setBounds(78, 426, 30, 30);
		contentPane.add(textArea10_2);
		
		JTextArea textArea10_3 = new JTextArea();
		textArea10_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_3.setEditable(false);
		textArea10_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_3, 10, 3);
		textArea10_3.setBounds(112, 426, 30, 30);
		contentPane.add(textArea10_3);
		
		JTextArea textArea10_4 = new JTextArea();
		textArea10_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_4.setEditable(false);
		textArea10_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_4, 10, 4);
		textArea10_4.setBounds(154, 426, 30, 30);
		contentPane.add(textArea10_4);
		
		JTextArea textArea10_5 = new JTextArea();
		textArea10_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_5.setEditable(false);
		textArea10_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_5, 10, 5);
		textArea10_5.setBounds(188, 426, 30, 30);
		contentPane.add(textArea10_5);
		
		JTextArea textArea10_6 = new JTextArea();
		textArea10_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_6.setEditable(false);
		textArea10_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_6, 10, 6);
		textArea10_6.setBounds(222, 426, 30, 30);
		contentPane.add(textArea10_6);
		
		JTextArea textArea10_7 = new JTextArea();
		textArea10_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_7.setEditable(false);
		textArea10_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_7, 10, 7);
		textArea10_7.setBounds(256, 426, 30, 30);
		contentPane.add(textArea10_7);
		
		JTextArea textArea10_8 = new JTextArea();
		textArea10_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_8.setEditable(false);
		textArea10_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_8, 10, 8);
		textArea10_8.setBounds(298, 426, 30, 30);
		contentPane.add(textArea10_8);
		
		JTextArea textArea10_9 = new JTextArea();
		textArea10_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_9.setEditable(false);
		textArea10_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_9, 10, 9);
		textArea10_9.setBounds(332, 426, 30, 30);
		contentPane.add(textArea10_9);
		
		JTextArea textArea10_10 = new JTextArea();
		textArea10_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_10.setEditable(false);
		textArea10_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_10, 10, 10);
		textArea10_10.setBounds(366, 426, 30, 30);
		contentPane.add(textArea10_10);
		
		JTextArea textArea10_11 = new JTextArea();
		textArea10_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_11.setEditable(false);
		textArea10_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_11, 10, 11);
		textArea10_11.setBounds(400, 426, 30, 30);
		contentPane.add(textArea10_11);
		
		JTextArea textArea10_12 = new JTextArea();
		textArea10_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_12.setEditable(false);
		textArea10_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_12, 10, 12);
		textArea10_12.setBounds(442, 426, 30, 30);
		contentPane.add(textArea10_12);
		
		JTextArea textArea10_13 = new JTextArea();
		textArea10_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_13.setEditable(false);
		textArea10_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_10, 10, 13);
		textArea10_13.setBounds(476, 426, 30, 30);
		contentPane.add(textArea10_13);
		
		JTextArea textArea10_14 = new JTextArea();
		textArea10_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_14.setEditable(false);
		textArea10_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_14, 10, 14);
		textArea10_14.setBounds(510, 426, 30, 30);
		contentPane.add(textArea10_14);
		
		JTextArea textArea10_15 = new JTextArea();
		textArea10_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea10_15.setEditable(false);
		textArea10_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 11;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea10_15, 10, 15);
		textArea10_15.setBounds(544, 426, 30, 30);
		contentPane.add(textArea10_15);
		
		JTextArea textArea11_0 = new JTextArea();
		textArea11_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_0.setEditable(false);
		textArea11_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_0, 11, 0);
		textArea11_0.setBounds(10, 463, 30, 30);
		contentPane.add(textArea11_0);
		
		JTextArea textArea11_1 = new JTextArea();
		textArea11_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_1.setEditable(false);
		textArea11_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_1, 11, 1);
		textArea11_1.setBounds(44, 463, 30, 30);
		contentPane.add(textArea11_1);
		
		JTextArea textArea11_2 = new JTextArea();
		textArea11_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_2.setEditable(false);
		textArea11_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_2, 11, 2);
		textArea11_2.setBounds(78, 463, 30, 30);
		contentPane.add(textArea11_2);
		
		JTextArea textArea11_3 = new JTextArea();
		textArea11_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_3.setEditable(false);
		textArea11_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_3, 11, 3);
		textArea11_3.setBounds(112, 463, 30, 30);
		contentPane.add(textArea11_3);
		
		JTextArea textArea11_4 = new JTextArea();
		textArea11_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_4.setEditable(false);
		textArea11_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_4, 11, 4);
		textArea11_4.setBounds(154, 463, 30, 30);
		contentPane.add(textArea11_4);
		
		JTextArea textArea11_5 = new JTextArea();
		textArea11_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_5.setEditable(false);
		textArea11_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_5, 11, 5);
		textArea11_5.setBounds(188, 463, 30, 30);
		contentPane.add(textArea11_5);
		
		JTextArea textArea11_6 = new JTextArea();
		textArea11_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_6.setEditable(false);
		textArea11_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_6, 11, 6);
		textArea11_6.setBounds(222, 463, 30, 30);
		contentPane.add(textArea11_6);
		
		JTextArea textArea11_7 = new JTextArea();
		textArea11_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_7.setEditable(false);
		textArea11_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_7, 11, 7);
		textArea11_7.setBounds(256, 463, 30, 30);
		contentPane.add(textArea11_7);
		
		JTextArea textArea11_8 = new JTextArea();
		textArea11_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_8.setEditable(false);
		textArea11_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_8, 11, 8);
		textArea11_8.setBounds(298, 463, 30, 30);
		contentPane.add(textArea11_8);
		
		JTextArea textArea11_9 = new JTextArea();
		textArea11_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_9.setEditable(false);
		textArea11_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_9, 11, 9);
		textArea11_9.setBounds(332, 463, 30, 30);
		contentPane.add(textArea11_9);
		
		JTextArea textArea11_10 = new JTextArea();
		textArea11_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_10.setEditable(false);
		textArea11_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_10, 11, 10);
		textArea11_10.setBounds(366, 463, 30, 30);
		contentPane.add(textArea11_10);
		
		JTextArea textArea11_11 = new JTextArea();
		textArea11_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_11.setEditable(false);
		textArea11_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_11, 11, 11);
		textArea11_11.setBounds(400, 463, 30, 30);
		contentPane.add(textArea11_11);
		
		JTextArea textArea11_12 = new JTextArea();
		textArea11_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_12.setEditable(false);
		textArea11_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_12, 11, 12);
		textArea11_12.setBounds(442, 463, 30, 30);
		contentPane.add(textArea11_12);
		
		JTextArea textArea11_13 = new JTextArea();
		textArea11_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_13.setEditable(false);
		textArea11_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_13, 11, 13);
		textArea11_13.setBounds(476, 463, 30, 30);
		contentPane.add(textArea11_13);
		
		JTextArea textArea11_14 = new JTextArea();
		textArea11_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_14.setEditable(false);
		textArea11_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_14, 11, 14);
		textArea11_14.setBounds(510, 463, 30, 30);
		contentPane.add(textArea11_14);
		
		JTextArea textArea11_15 = new JTextArea();
		textArea11_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea11_15.setEditable(false);
		textArea11_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 12;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea11_15, 11, 15);
		textArea11_15.setBounds(544, 463, 30, 30);
		contentPane.add(textArea11_15);
		
		JTextArea textArea12_0 = new JTextArea();
		textArea12_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_0.setEditable(false);
		textArea12_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_0, 12, 0);
		textArea12_0.setBounds(10, 508, 30, 30);
		contentPane.add(textArea12_0);
		
		JTextArea textArea12_1 = new JTextArea();
		textArea12_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_1.setEditable(false);
		textArea12_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_1, 12, 1);
		textArea12_1.setBounds(44, 508, 30, 30);
		contentPane.add(textArea12_1);
		
		JTextArea textArea12_2 = new JTextArea();
		textArea12_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_2.setEditable(false);
		textArea12_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_2, 12, 2);
		textArea12_2.setBounds(78, 508, 30, 30);
		contentPane.add(textArea12_2);
		
		JTextArea textArea12_3 = new JTextArea();
		textArea12_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_3.setEditable(false);
		textArea12_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_3, 12, 3);
		textArea12_3.setBounds(112, 508, 30, 30);
		contentPane.add(textArea12_3);
		
		JTextArea textArea12_4 = new JTextArea();
		textArea12_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_4.setEditable(false);
		textArea12_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_4, 12, 4);
		textArea12_4.setBounds(154, 508, 30, 30);
		contentPane.add(textArea12_4);
		
		JTextArea textArea12_5 = new JTextArea();
		textArea12_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_5.setEditable(false);
		textArea12_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_5, 12, 5);
		textArea12_5.setBounds(188, 508, 30, 30);
		contentPane.add(textArea12_5);
		
		JTextArea textArea12_6 = new JTextArea();
		textArea12_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_6.setEditable(false);
		textArea12_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_6, 12, 6);
		textArea12_6.setBounds(222, 508, 30, 30);
		contentPane.add(textArea12_6);
		
		JTextArea textArea12_7 = new JTextArea();
		textArea12_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_7.setEditable(false);
		textArea12_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_7, 12, 7);
		textArea12_7.setBounds(256, 508, 30, 30);
		contentPane.add(textArea12_7);
		
		JTextArea textArea12_8 = new JTextArea();
		textArea12_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_8.setEditable(false);
		textArea12_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_8, 12, 8);
		textArea12_8.setBounds(298, 508, 30, 30);
		contentPane.add(textArea12_8);
		
		JTextArea textArea12_9 = new JTextArea();
		textArea12_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_9.setEditable(false);
		textArea12_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_9, 12, 9);
		textArea12_9.setBounds(332, 508, 30, 30);
		contentPane.add(textArea12_9);
		
		JTextArea textArea12_10 = new JTextArea();
		textArea12_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_10.setEditable(false);
		textArea12_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_10, 12, 10);
		textArea12_10.setBounds(366, 508, 30, 30);
		contentPane.add(textArea12_10);
		
		JTextArea textArea12_11 = new JTextArea();
		textArea12_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_11.setEditable(false);
		textArea12_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_11, 12, 11);
		textArea12_11.setBounds(400, 508, 30, 30);
		contentPane.add(textArea12_11);
		
		JTextArea textArea12_12 = new JTextArea();
		textArea12_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_12.setEditable(false);
		textArea12_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_12, 12, 12);
		textArea12_12.setBounds(442, 508, 30, 30);
		contentPane.add(textArea12_12);
		
		JTextArea textArea12_13 = new JTextArea();
		textArea12_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_13.setEditable(false);
		textArea12_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_13, 12, 13);
		textArea12_13.setBounds(476, 508, 30, 30);
		contentPane.add(textArea12_13);
		
		JTextArea textArea12_14 = new JTextArea();
		textArea12_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_14.setEditable(false);
		textArea12_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_14, 12, 14);
		textArea12_14.setBounds(510, 508, 30, 30);
		contentPane.add(textArea12_14);
		
		JTextArea textArea12_15 = new JTextArea();
		textArea12_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea12_15.setEditable(false);
		textArea12_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 13;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea12_15, 12, 15);
		textArea12_15.setBounds(544, 508, 30, 30);
		contentPane.add(textArea12_15);
		
		JTextArea textArea13_0 = new JTextArea();
		textArea13_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_0.setEditable(false);
		textArea13_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_0, 13, 0);
		textArea13_0.setBounds(10, 545, 30, 30);
		contentPane.add(textArea13_0);
		
		JTextArea textArea13_1 = new JTextArea();
		textArea13_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_1.setEditable(false);
		textArea13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_1, 13, 1);
		textArea13_1.setBounds(44, 545, 30, 30);
		contentPane.add(textArea13_1);
		
		JTextArea textArea13_2 = new JTextArea();
		textArea13_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_2.setEditable(false);
		textArea13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_2, 13, 2);
		textArea13_2.setBounds(78, 545, 30, 30);
		contentPane.add(textArea13_2);
		
		JTextArea textArea13_3 = new JTextArea();
		textArea13_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_3.setEditable(false);
		textArea13_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_3, 13, 3);
		textArea13_3.setBounds(112, 545, 30, 30);
		contentPane.add(textArea13_3);
		
		JTextArea textArea13_4 = new JTextArea();
		textArea13_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_4.setEditable(false);
		textArea13_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_4, 13, 4);
		textArea13_4.setBounds(154, 545, 30, 30);
		contentPane.add(textArea13_4);
		
		JTextArea textArea13_5 = new JTextArea();
		textArea13_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_5.setEditable(false);
		textArea13_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_5, 13, 5);
		textArea13_5.setBounds(188, 545, 30, 30);
		contentPane.add(textArea13_5);
		
		JTextArea textArea13_6 = new JTextArea();
		textArea13_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_6.setEditable(false);
		textArea13_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_6, 13, 6);
		textArea13_6.setBounds(222, 545, 30, 30);
		contentPane.add(textArea13_6);
		
		JTextArea textArea13_7 = new JTextArea();
		textArea13_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_7.setEditable(false);
		textArea13_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_7, 13, 7);
		textArea13_7.setBounds(256, 545, 30, 30);
		contentPane.add(textArea13_7);
		
		JTextArea textArea13_8 = new JTextArea();
		textArea13_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_8.setEditable(false);
		textArea13_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_8, 13, 8);
		textArea13_8.setBounds(298, 545, 30, 30);
		contentPane.add(textArea13_8);
		
		JTextArea textArea13_9 = new JTextArea();
		textArea13_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_9.setEditable(false);
		textArea13_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_9, 13, 9);
		textArea13_9.setBounds(332, 545, 30, 30);
		contentPane.add(textArea13_9);
		
		JTextArea textArea13_10 = new JTextArea();
		textArea13_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_10.setEditable(false);
		textArea13_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_10, 13, 10);
		textArea13_10.setBounds(366, 545, 30, 30);
		contentPane.add(textArea13_10);
		
		JTextArea textArea13_11 = new JTextArea();
		textArea13_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_11.setEditable(false);
		textArea13_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_11, 13, 11);
		textArea13_11.setBounds(400, 545, 30, 30);
		contentPane.add(textArea13_11);
		
		JTextArea textArea13_12 = new JTextArea();
		textArea13_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_12.setEditable(false);
		textArea13_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_12, 13, 12);
		textArea13_12.setBounds(442, 545, 30, 30);
		contentPane.add(textArea13_12);
		
		JTextArea textArea13_13 = new JTextArea();
		textArea13_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_13.setEditable(false);
		textArea13_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_13, 13, 13);
		textArea13_13.setBounds(476, 545, 30, 30);
		contentPane.add(textArea13_13);
		
		JTextArea textArea13_14 = new JTextArea();
		textArea13_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_14.setEditable(false);
		textArea13_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_14, 13, 14);
		textArea13_14.setBounds(510, 545, 30, 30);
		contentPane.add(textArea13_14);
		
		JTextArea textArea13_15 = new JTextArea();
		textArea13_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea13_15.setEditable(false);
		textArea13_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 14;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea13_15, 13, 15);
		textArea13_15.setBounds(544, 545, 30, 30);
		contentPane.add(textArea13_15);
		
		JTextArea textArea14_0 = new JTextArea();
		textArea14_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_0.setEditable(false);
		textArea14_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_0, 14, 0);
		textArea14_0.setBounds(10, 582, 30, 30);
		contentPane.add(textArea14_0);
		
		JTextArea textArea14_1 = new JTextArea();
		textArea14_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_1.setEditable(false);
		textArea14_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_1, 14, 1);
		textArea14_1.setBounds(44, 582, 30, 30);
		contentPane.add(textArea14_1);
		
		JTextArea textArea14_2 = new JTextArea();
		textArea14_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_2.setEditable(false);
		textArea14_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_2, 14, 2);
		textArea14_2.setBounds(78, 582, 30, 30);
		contentPane.add(textArea14_2);
		
		JTextArea textArea14_3 = new JTextArea();
		textArea14_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_3.setEditable(false);
		textArea14_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_3, 14, 3);
		textArea14_3.setBounds(112, 582, 30, 30);
		contentPane.add(textArea14_3);
		
		JTextArea textArea14_4 = new JTextArea();
		textArea14_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_4.setEditable(false);
		textArea14_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_4, 14, 4);
		textArea14_4.setBounds(154, 582, 30, 30);
		contentPane.add(textArea14_4);
		
		JTextArea textArea14_5 = new JTextArea();
		textArea14_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_5.setEditable(false);
		textArea14_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_5, 14, 5);
		textArea14_5.setBounds(188, 582, 30, 30);
		contentPane.add(textArea14_5);
		
		JTextArea textArea14_6 = new JTextArea();
		textArea14_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_6.setEditable(false);
		textArea14_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_6, 14, 6);
		textArea14_6.setBounds(222, 582, 30, 30);
		contentPane.add(textArea14_6);
		
		JTextArea textArea14_7 = new JTextArea();
		textArea14_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_7.setEditable(false);
		textArea14_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_7, 14, 7);
		textArea14_7.setBounds(256, 582, 30, 30);
		contentPane.add(textArea14_7);
		
		JTextArea textArea14_8 = new JTextArea();
		textArea14_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_8.setEditable(false);
		textArea14_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_8, 14, 8);
		textArea14_8.setBounds(298, 582, 30, 30);
		contentPane.add(textArea14_8);
		
		JTextArea textArea14_9 = new JTextArea();
		textArea14_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_9.setEditable(false);
		textArea14_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_9, 14, 9);
		textArea14_9.setBounds(332, 582, 30, 30);
		contentPane.add(textArea14_9);
		
		JTextArea textArea14_10 = new JTextArea();
		textArea14_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_10.setEditable(false);
		textArea14_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_10, 14, 10);
		textArea14_10.setBounds(366, 582, 30, 30);
		contentPane.add(textArea14_10);
		
		JTextArea textArea14_11 = new JTextArea();
		textArea14_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_11.setEditable(false);
		textArea14_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_11, 14, 11);
		textArea14_11.setBounds(400, 582, 30, 30);
		contentPane.add(textArea14_11);
		
		JTextArea textArea14_12 = new JTextArea();
		textArea14_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_12.setEditable(false);
		textArea14_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_12, 14, 12);
		textArea14_12.setBounds(442, 582, 30, 30);
		contentPane.add(textArea14_12);
		
		JTextArea textArea14_13 = new JTextArea();
		textArea14_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_13.setEditable(false);
		textArea14_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_13, 14, 13);
		textArea14_13.setBounds(476, 582, 30, 30);
		contentPane.add(textArea14_13);
		
		JTextArea textArea14_14 = new JTextArea();
		textArea14_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_14.setEditable(false);
		textArea14_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_14, 14, 14);
		textArea14_14.setBounds(510, 582, 30, 30);
		contentPane.add(textArea14_14);
		
		JTextArea textArea14_15 = new JTextArea();
		textArea14_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea14_15.setEditable(false);
		textArea14_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 15;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea14_15, 14, 15);
		textArea14_15.setBounds(544, 582, 30, 30);
		contentPane.add(textArea14_15);
		
		JTextArea textArea15_0 = new JTextArea();
		textArea15_0.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_0.setEditable(false);
		textArea15_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_0, 15, 0);
		textArea15_0.setBounds(10, 619, 30, 30);
		contentPane.add(textArea15_0);
		
		JTextArea textArea15_1 = new JTextArea();
		textArea15_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_1.setEditable(false);
		textArea15_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_1, 15, 1);
		textArea15_1.setBounds(44, 619, 30, 30);
		contentPane.add(textArea15_1);
		
		JTextArea textArea15_2 = new JTextArea();
		textArea15_2.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_2.setEditable(false);
		textArea15_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_2, 15, 2);
		textArea15_2.setBounds(78, 619, 30, 30);
		contentPane.add(textArea15_2);
		
		JTextArea textArea15_3 = new JTextArea();
		textArea15_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_3.setEditable(false);
		textArea15_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_3, 15, 3);
		textArea15_3.setBounds(112, 619, 30, 30);
		contentPane.add(textArea15_3);
		
		JTextArea textArea15_4 = new JTextArea();
		textArea15_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_4.setEditable(false);
		textArea15_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_4, 15, 4);
		textArea15_4.setBounds(154, 619, 30, 30);
		contentPane.add(textArea15_4);
		
		JTextArea textArea15_5 = new JTextArea();
		textArea15_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_5.setEditable(false);
		textArea15_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_5, 15, 5);
		textArea15_5.setBounds(188, 619, 30, 30);
		contentPane.add(textArea15_5);
		
		JTextArea textArea15_6 = new JTextArea();
		textArea15_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_6.setEditable(false);
		textArea15_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_6, 15, 6);
		textArea15_6.setBounds(222, 619, 30, 30);
		contentPane.add(textArea15_6);
		
		JTextArea textArea15_7 = new JTextArea();
		textArea15_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_7.setEditable(false);
		textArea15_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_7, 15, 7);
		textArea15_7.setBounds(256, 619, 30, 30);
		contentPane.add(textArea15_7);
		
		JTextArea textArea15_8 = new JTextArea();
		textArea15_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_8.setEditable(false);
		textArea15_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_8, 15, 8);
		textArea15_8.setBounds(298, 619, 30, 30);
		contentPane.add(textArea15_8);
		
		JTextArea textArea15_9 = new JTextArea();
		textArea15_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_9.setEditable(false);
		textArea15_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 10;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_9, 15, 9);
		textArea15_9.setBounds(332, 619, 30, 30);
		contentPane.add(textArea15_9);
		
		JTextArea textArea15_10 = new JTextArea();
		textArea15_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_10.setEditable(false);
		textArea15_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 11;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_10, 15, 10);
		textArea15_10.setBounds(366, 619, 30, 30);
		contentPane.add(textArea15_10);
		
		JTextArea textArea15_11 = new JTextArea();
		textArea15_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_11.setEditable(false);
		textArea15_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 12;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_11, 15, 11);
		textArea15_11.setBounds(400, 619, 30, 30);
		contentPane.add(textArea15_11);
		
		JTextArea textArea15_12 = new JTextArea();
		textArea15_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_12.setEditable(false);
		textArea15_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 13;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_12, 15, 12);
		textArea15_12.setBounds(442, 619, 30, 30);
		contentPane.add(textArea15_12);
		
		JTextArea textArea15_13 = new JTextArea();
		textArea15_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_13.setEditable(false);
		textArea15_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 14;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_13, 15, 13);
		textArea15_13.setBounds(476, 619, 30, 30);
		contentPane.add(textArea15_13);
		
		JTextArea textArea15_14 = new JTextArea();
		textArea15_14.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_14.setEditable(false);
		textArea15_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 15;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_14, 15, 14);
		textArea15_14.setBounds(510, 619, 30, 30);
		contentPane.add(textArea15_14);
		
		JTextArea textArea15_15 = new JTextArea();
		textArea15_15.setFont(new Font("Dialog", Font.BOLD, 20));
		textArea15_15.setEditable(false);
		textArea15_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 16;
				Engine.x = 16;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis4 (textArea15_15, 15, 15);
		textArea15_15.setBounds(544, 619, 30, 30);
		contentPane.add(textArea15_15);
		

		JButton toggleButton = new JButton("1");
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 1;
				lValue.setText("Value = 1"); //Button adds 1 to lValue Label
			}
		});
		toggleButton.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton.setForeground(Color.BLUE);
		toggleButton.setBounds(602, 46, 50, 50);
		contentPane.add(toggleButton);
		
		JButton toggleButton_1 = new JButton("2");
		toggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 2;
				lValue.setText("Value = 2");
			}
		});
		toggleButton_1.setForeground(Color.BLUE);
		toggleButton_1.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_1.setBounds(653, 46, 50, 50);
		contentPane.add(toggleButton_1);
		
		JButton toggleButton_2 = new JButton("3");
		toggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 3;
				lValue.setText("Value = 3"); 
			}
		});
		toggleButton_2.setForeground(Color.BLUE);
		toggleButton_2.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_2.setBounds(703, 46, 50, 50);
		contentPane.add(toggleButton_2);
		
		JButton toggleButton_3 = new JButton("4");
		toggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 4;
				lValue.setText("Value = 4"); 
			}
		});
		toggleButton_3.setForeground(Color.BLUE);
		toggleButton_3.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_3.setBounds(754, 46, 50, 50);
		contentPane.add(toggleButton_3);
		
		JButton toggleButton_4 = new JButton("5");
		toggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 5;
				lValue.setText("Value = 5"); 
			}
		});
		toggleButton_4.setForeground(Color.BLUE);
		toggleButton_4.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_4.setBounds(602, 97, 50, 50);
		contentPane.add(toggleButton_4);
		
		JButton toggleButton_5 = new JButton("6");
		toggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 6;
				lValue.setText("Value = 6"); 
			}
		});
		toggleButton_5.setForeground(Color.BLUE);
		toggleButton_5.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_5.setBounds(653, 97, 50, 50);
		contentPane.add(toggleButton_5);
		
		JButton toggleButton_6 = new JButton("7");
		toggleButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 7;
				lValue.setText("Value = 7"); 
			}
		});
		toggleButton_6.setForeground(Color.BLUE);
		toggleButton_6.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_6.setBounds(703, 97, 50, 50);
		contentPane.add(toggleButton_6);
		
		JButton toggleButton_7 = new JButton("8");
		toggleButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 8;
				lValue.setText("Value = 8"); 
			}
		});
		toggleButton_7.setForeground(Color.BLUE);
		toggleButton_7.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_7.setBounds(754, 97, 50, 50);
		contentPane.add(toggleButton_7);
		
		JButton toggleButton_8 = new JButton("9");
		toggleButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 9;
				lValue.setText("Value = 9");
			}
		});
		toggleButton_8.setForeground(Color.BLUE);
		toggleButton_8.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_8.setBounds(602, 148, 50, 50);
		contentPane.add(toggleButton_8);
		
		JButton toggleButton_9 = new JButton("10");
		toggleButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 10;
				lValue.setText("Value = 10");
			}
		});
		toggleButton_9.setForeground(Color.BLUE);
		toggleButton_9.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_9.setBounds(653, 148, 50, 50);
		contentPane.add(toggleButton_9);
		
		JButton toggleButton_10 = new JButton("11");
		toggleButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 11;
				lValue.setText("Value = 11");
			}
		});
		toggleButton_10.setForeground(Color.BLUE);
		toggleButton_10.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_10.setBounds(703, 148, 50, 50);
		contentPane.add(toggleButton_10);
		
		JButton toggleButton_11 = new JButton("12");
		toggleButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 12;
				lValue.setText("Value = 12");
			}
		});
		toggleButton_11.setForeground(Color.BLUE);
		toggleButton_11.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_11.setBounds(754, 148, 50, 50);
		contentPane.add(toggleButton_11);
		
		JButton toggleButton_12 = new JButton("13");
		toggleButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 13;
				lValue.setText("Value = 13");
			}
		});
		toggleButton_12.setForeground(Color.BLUE);
		toggleButton_12.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_12.setBounds(602, 199, 50, 50);
		contentPane.add(toggleButton_12);
		
		JButton toggleButton_13 = new JButton("14");
		toggleButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 14;
				lValue.setText("Value = 14");
			}
		});
		toggleButton_13.setForeground(Color.BLUE);
		toggleButton_13.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_13.setBounds(653, 199, 50, 50);
		contentPane.add(toggleButton_13);
		
		JButton toggleButton_14 = new JButton("15");
		toggleButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 15;
				lValue.setText("Value = 15");
			}
		});
		toggleButton_14.setForeground(Color.BLUE);
		toggleButton_14.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_14.setBounds(703, 199, 50, 50);
		contentPane.add(toggleButton_14);
		
		JButton toggleButton_15 = new JButton("16");
		toggleButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 16;
				lValue.setText("Value = 16");
			}
		});
		toggleButton_15.setForeground(Color.BLUE);
		toggleButton_15.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_15.setBounds(754, 199, 50, 50);
		contentPane.add(toggleButton_15);
		
		JButton btnMakeMove = new JButton("Make Move");
		btnMakeMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.madeMove = true; //Button Places Users Move
			}
		});
		btnMakeMove.setForeground(Color.BLUE);
		btnMakeMove.setFont(new Font("HanziPen TC", Font.BOLD, 16));
		btnMakeMove.setBounds(624, 277, 161, 28);
		contentPane.add(btnMakeMove);
		
		JLabel lblRow = new JLabel("Row = ");
		lRow = lblRow;//Reference to lblRow from outside the method
		lblRow.setForeground(Color.BLUE);
		lblRow.setFont(new Font("Dialog", Font.BOLD, 17));
		lblRow.setBounds(10, 660, 100, 20);
		contentPane.add(lblRow);
		
		JLabel lblCol = new JLabel("Col = ");
		lCol = lblCol;//Reference to lblCol from outside the method
		lblCol.setForeground(Color.BLUE);
		lblCol.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCol.setBounds(10, 11, 100, 20);
		contentPane.add(lblCol);
		
		JLabel lblValue = new JLabel("Value = ");
		lValue = lblValue;//Reference to lblValue from outside the method
		lblValue.setForeground(Color.BLUE);
		lblValue.setFont(new Font("Dialog", Font.BOLD, 17));
		lblValue.setBounds(602, 11, 103, 20);
		contentPane.add(lblValue);
	}
}
