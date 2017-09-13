import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Game3x3 extends JFrame {

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
					Game3x3 frame = new Game3x3();
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
	public Game3x3() {
		setTitle("Twodoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Engine.y = 1;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea, 0, 0);//Places textArea into DisplayG array = arrDis3
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(24, 60, 20, 20);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_1, 0, 1);//
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(48, 60, 20, 20);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_2, 0, 2);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setBounds(72, 60, 20, 20);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_3, 0, 3);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setBounds(104, 60, 20, 20);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setEditable(false);
		textArea_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_4, 0, 4);
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setBounds(128, 60, 20, 20);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setEditable(false);
		textArea_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_5, 0, 5);
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setBounds(152, 60, 20, 20);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setEditable(false);
		textArea_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_6, 0, 6);
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setBounds(186, 60, 20, 20);
		contentPane.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setEditable(false);
		textArea_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_7, 0, 7);
		textArea_7.setBackground(Color.WHITE);
		textArea_7.setBounds(210, 60, 20, 20);
		contentPane.add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setEditable(false);
		textArea_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 1;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_8, 0, 8);
		textArea_8.setBackground(Color.WHITE);
		textArea_8.setBounds(234, 60, 20, 20);
		contentPane.add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setEditable(false);
		textArea_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_9, 1, 0);
		textArea_9.setBackground(Color.WHITE);
		textArea_9.setBounds(24, 83, 20, 20);
		contentPane.add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setEditable(false);
		textArea_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_10, 1, 1);
		textArea_10.setBackground(Color.WHITE);
		textArea_10.setBounds(48, 83, 20, 20);
		contentPane.add(textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setEditable(false);
		textArea_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_11, 1, 2);
		textArea_11.setBackground(Color.WHITE);
		textArea_11.setBounds(72, 83, 20, 20);
		contentPane.add(textArea_11);
		
		JTextArea textArea_12 = new JTextArea();
		textArea_12.setEditable(false);
		textArea_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_12, 1, 3);
		textArea_12.setBackground(Color.WHITE);
		textArea_12.setBounds(104, 83, 20, 20);
		contentPane.add(textArea_12);
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setEditable(false);
		textArea_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_13, 1, 4);
		textArea_13.setBackground(Color.WHITE);
		textArea_13.setBounds(128, 83, 20, 20);
		contentPane.add(textArea_13);
		
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setEditable(false);
		textArea_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_14, 1, 5);
		textArea_14.setBackground(Color.WHITE);
		textArea_14.setBounds(152, 83, 20, 20);
		contentPane.add(textArea_14);
		
		JTextArea textArea_15 = new JTextArea();
		textArea_15.setEditable(false);
		textArea_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_15, 1, 6);
		textArea_15.setBackground(Color.WHITE);
		textArea_15.setBounds(186, 83, 20, 20);
		contentPane.add(textArea_15);
		
		JTextArea textArea_16 = new JTextArea();
		textArea_16.setEditable(false);
		textArea_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_16, 1, 7);
		textArea_16.setBackground(Color.WHITE);
		textArea_16.setBounds(210, 83, 20, 20);
		contentPane.add(textArea_16);
		
		JTextArea textArea_17 = new JTextArea();
		textArea_17.setEditable(false);
		textArea_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_17, 1, 8);
		textArea_17.setBackground(Color.WHITE);
		textArea_17.setBounds(234, 83, 20, 20);
		contentPane.add(textArea_17);
		
		JTextArea textArea_18 = new JTextArea();
		textArea_18.setEditable(false);
		textArea_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_18, 2, 0);
		textArea_18.setBackground(Color.WHITE);
		textArea_18.setBounds(24, 106, 20, 20);
		contentPane.add(textArea_18);
		
		JTextArea textArea_19 = new JTextArea();
		textArea_19.setEditable(false);
		textArea_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_19, 2, 1);
		textArea_19.setBackground(Color.WHITE);
		textArea_19.setBounds(48, 106, 20, 20);
		contentPane.add(textArea_19);
		
		JTextArea textArea_20 = new JTextArea();
		textArea_20.setEditable(false);
		textArea_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_20, 2, 2);
		textArea_20.setBackground(Color.WHITE);
		textArea_20.setBounds(72, 106, 20, 20);
		contentPane.add(textArea_20);
		
		JTextArea textArea_21 = new JTextArea();
		textArea_21.setEditable(false);
		textArea_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_21, 2, 3);
		textArea_21.setBackground(Color.WHITE);
		textArea_21.setBounds(104, 106, 20, 20);
		contentPane.add(textArea_21);
		
		JTextArea textArea_22 = new JTextArea();
		textArea_22.setEditable(false);
		textArea_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_22, 2, 4);
		textArea_22.setBackground(Color.WHITE);
		textArea_22.setBounds(128, 106, 20, 20);
		contentPane.add(textArea_22);
		
		JTextArea textArea_23 = new JTextArea();
		textArea_23.setEditable(false);
		textArea_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_23, 2, 5);
		textArea_23.setBackground(Color.WHITE);
		textArea_23.setBounds(152, 106, 20, 20);
		contentPane.add(textArea_23);
		
		JTextArea textArea_24 = new JTextArea();
		textArea_24.setEditable(false);
		textArea_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_24, 2, 6);
		textArea_24.setBackground(Color.WHITE);
		textArea_24.setBounds(186, 106, 20, 20);
		contentPane.add(textArea_24);
		
		JTextArea textArea_25 = new JTextArea();
		textArea_25.setEditable(false);
		textArea_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_25, 2, 7);
		textArea_25.setBackground(Color.WHITE);
		textArea_25.setBounds(210, 106, 20, 20);
		contentPane.add(textArea_25);
		
		JTextArea textArea_26 = new JTextArea();
		textArea_26.setEditable(false);
		textArea_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_26, 2, 8);
		textArea_26.setBackground(Color.WHITE);
		textArea_26.setBounds(234, 106, 20, 20);
		contentPane.add(textArea_26);
		
		JTextArea textArea_27 = new JTextArea();
		textArea_27.setEditable(false);
		textArea_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_27, 3, 0);
		textArea_27.setBackground(Color.WHITE);
		textArea_27.setBounds(24, 138, 20, 20);
		contentPane.add(textArea_27);
		
		JTextArea textArea_28 = new JTextArea();
		textArea_28.setEditable(false);
		textArea_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_28, 3, 1);
		textArea_28.setBackground(Color.WHITE);
		textArea_28.setBounds(48, 138, 20, 20);
		contentPane.add(textArea_28);
		
		JTextArea textArea_29 = new JTextArea();
		textArea_29.setEditable(false);
		textArea_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_29, 3, 2);
		textArea_29.setBackground(Color.WHITE);
		textArea_29.setBounds(72, 138, 20, 20);
		contentPane.add(textArea_29);
		
		JTextArea textArea_30 = new JTextArea();
		textArea_30.setEditable(false);
		textArea_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_30, 3, 3);
		textArea_30.setBackground(Color.WHITE);
		textArea_30.setBounds(104, 138, 20, 20);
		contentPane.add(textArea_30);
		
		JTextArea textArea_31 = new JTextArea();
		textArea_31.setEditable(false);
		textArea_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_31, 3, 4);
		textArea_31.setBackground(Color.WHITE);
		textArea_31.setBounds(128, 138, 20, 20);
		contentPane.add(textArea_31);
		
		JTextArea textArea_32 = new JTextArea();
		textArea_32.setEditable(false);
		textArea_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_32, 3, 5);
		textArea_32.setBackground(Color.WHITE);
		textArea_32.setBounds(152, 138, 20, 20);
		contentPane.add(textArea_32);
		
		JTextArea textArea_33 = new JTextArea();
		textArea_33.setEditable(false);
		textArea_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_33, 3, 6);
		textArea_33.setBackground(Color.WHITE);
		textArea_33.setBounds(186, 138, 20, 20);
		contentPane.add(textArea_33);
		
		JTextArea textArea_34 = new JTextArea();
		textArea_34.setEditable(false);
		textArea_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_34, 3, 7);
		textArea_34.setBackground(Color.WHITE);
		textArea_34.setBounds(210, 138, 20, 20);
		contentPane.add(textArea_34);
		
		JTextArea textArea_35 = new JTextArea();
		textArea_35.setEditable(false);
		textArea_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_35, 3, 8);
		textArea_35.setBackground(Color.WHITE);
		textArea_35.setBounds(234, 138, 20, 20);
		contentPane.add(textArea_35);
		
		JTextArea textArea_36 = new JTextArea();
		textArea_36.setEditable(false);
		textArea_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_36, 4, 0);
		textArea_36.setBackground(Color.WHITE);
		textArea_36.setBounds(24, 161, 20, 20);
		contentPane.add(textArea_36);
		
		JTextArea textArea_37 = new JTextArea();
		textArea_37.setEditable(false);
		textArea_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_37, 4, 1);
		textArea_37.setBackground(Color.WHITE);
		textArea_37.setBounds(48, 161, 20, 20);
		contentPane.add(textArea_37);
		
		JTextArea textArea_38 = new JTextArea();
		textArea_38.setEditable(false);
		textArea_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_38, 4, 2);
		textArea_38.setBackground(Color.WHITE);
		textArea_38.setBounds(72, 161, 20, 20);
		contentPane.add(textArea_38);
		
		JTextArea textArea_39 = new JTextArea();
		textArea_39.setEditable(false);
		textArea_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_39, 4, 3);
		textArea_39.setBackground(Color.WHITE);
		textArea_39.setBounds(104, 161, 20, 20);
		contentPane.add(textArea_39);
		
		JTextArea textArea_40 = new JTextArea();
		textArea_40.setEditable(false);
		textArea_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_40, 4, 4);
		textArea_40.setBackground(Color.WHITE);
		textArea_40.setBounds(128, 161, 20, 20);
		contentPane.add(textArea_40);
		
		JTextArea textArea_41 = new JTextArea();
		textArea_41.setEditable(false);
		textArea_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_41, 4, 5);
		textArea_41.setBackground(Color.WHITE);
		textArea_41.setBounds(152, 161, 20, 20);
		contentPane.add(textArea_41);
		
		JTextArea textArea_42 = new JTextArea();
		textArea_42.setEditable(false);
		textArea_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_42, 4, 6);
		textArea_42.setBackground(Color.WHITE);
		textArea_42.setBounds(186, 161, 20, 20);
		contentPane.add(textArea_42);
		
		JTextArea textArea_43 = new JTextArea();
		textArea_43.setEditable(false);
		textArea_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_43, 4, 7);
		textArea_43.setBackground(Color.WHITE);
		textArea_43.setBounds(210, 161, 20, 20);
		contentPane.add(textArea_43);
		
		JTextArea textArea_44 = new JTextArea();
		textArea_44.setEditable(false);
		textArea_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 5;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_44, 4, 8);
		textArea_44.setBackground(Color.WHITE);
		textArea_44.setBounds(234, 161, 20, 20);
		contentPane.add(textArea_44);
		
		JTextArea textArea_45 = new JTextArea();
		textArea_45.setEditable(false);
		textArea_45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_45, 5, 0);
		textArea_45.setBackground(Color.WHITE);
		textArea_45.setBounds(24, 184, 20, 20);
		contentPane.add(textArea_45);
		
		JTextArea textArea_46 = new JTextArea();
		textArea_46.setEditable(false);
		textArea_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_46, 5, 1);
		textArea_46.setBackground(Color.WHITE);
		textArea_46.setBounds(48, 184, 20, 20);
		contentPane.add(textArea_46);
		
		JTextArea textArea_47 = new JTextArea();
		textArea_47.setEditable(false);
		textArea_47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_47, 5, 2);
		textArea_47.setBackground(Color.WHITE);
		textArea_47.setBounds(72, 184, 20, 20);
		contentPane.add(textArea_47);
		
		JTextArea textArea_48 = new JTextArea();
		textArea_48.setEditable(false);
		textArea_48.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_48, 5, 3);
		textArea_48.setBackground(Color.WHITE);
		textArea_48.setBounds(104, 184, 20, 20);
		contentPane.add(textArea_48);
		
		JTextArea textArea_49 = new JTextArea();
		textArea_49.setEditable(false);
		textArea_49.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_49, 5, 4);
		textArea_49.setBackground(Color.WHITE);
		textArea_49.setBounds(128, 184, 20, 20);
		contentPane.add(textArea_49);
		
		JTextArea textArea_50 = new JTextArea();
		textArea_50.setEditable(false);
		textArea_50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_50, 5, 5);
		textArea_50.setBackground(Color.WHITE);
		textArea_50.setBounds(152, 184, 20, 20);
		contentPane.add(textArea_50);
		
		JTextArea textArea_51 = new JTextArea();
		textArea_51.setEditable(false);
		textArea_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_51, 5, 6);
		textArea_51.setBackground(Color.WHITE);
		textArea_51.setBounds(186, 184, 20, 20);
		contentPane.add(textArea_51);
		
		JTextArea textArea_52 = new JTextArea();
		textArea_52.setEditable(false);
		textArea_52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_52, 5, 7);
		textArea_52.setBackground(Color.WHITE);
		textArea_52.setBounds(210, 184, 20, 20);
		contentPane.add(textArea_52);
		
		JTextArea textArea_53 = new JTextArea();
		textArea_53.setEditable(false);
		textArea_53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 6;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_53, 5, 8);
		textArea_53.setBackground(Color.WHITE);
		textArea_53.setBounds(234, 184, 20, 20);
		contentPane.add(textArea_53);
		
		JTextArea textArea_54 = new JTextArea();
		textArea_54.setEditable(false);
		textArea_54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_54, 6, 0);
		textArea_54.setBackground(Color.WHITE);
		textArea_54.setBounds(24, 216, 20, 20);
		contentPane.add(textArea_54);
		
		JTextArea textArea_55 = new JTextArea();
		textArea_55.setEditable(false);
		textArea_55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_55, 6, 1);
		textArea_55.setBackground(Color.WHITE);
		textArea_55.setBounds(48, 216, 20, 20);
		contentPane.add(textArea_55);
		
		JTextArea textArea_56 = new JTextArea();
		textArea_56.setEditable(false);
		textArea_56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_56, 6, 2);
		textArea_56.setBackground(Color.WHITE);
		textArea_56.setBounds(72, 216, 20, 20);
		contentPane.add(textArea_56);
		
		JTextArea textArea_57 = new JTextArea();
		textArea_57.setEditable(false);
		textArea_57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_57, 6, 3);
		textArea_57.setBackground(Color.WHITE);
		textArea_57.setBounds(104, 216, 20, 20);
		contentPane.add(textArea_57);
		
		JTextArea textArea_58 = new JTextArea();
		textArea_58.setEditable(false);
		textArea_58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_58, 6, 4);
		textArea_58.setBackground(Color.WHITE);
		textArea_58.setBounds(128, 216, 20, 20);
		contentPane.add(textArea_58);
		
		JTextArea textArea_59 = new JTextArea();
		textArea_59.setEditable(false);
		textArea_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_59, 6, 5);
		textArea_59.setBackground(Color.WHITE);
		textArea_59.setBounds(152, 216, 20, 20);
		contentPane.add(textArea_59);
		
		JTextArea textArea_60 = new JTextArea();
		textArea_60.setEditable(false);
		textArea_60.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_60, 6, 6);
		textArea_60.setBackground(Color.WHITE);
		textArea_60.setBounds(186, 216, 20, 20);
		contentPane.add(textArea_60);
		
		JTextArea textArea_61 = new JTextArea();
		textArea_61.setEditable(false);
		textArea_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_61, 6, 7);
		textArea_61.setBackground(Color.WHITE);
		textArea_61.setBounds(210, 216, 20, 20);
		contentPane.add(textArea_61);
		
		JTextArea textArea_62 = new JTextArea();
		textArea_62.setEditable(false);
		textArea_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 7;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_62, 6, 8);
		textArea_62.setBackground(Color.WHITE);
		textArea_62.setBounds(234, 216, 20, 20);
		contentPane.add(textArea_62);
		
		JTextArea textArea_63 = new JTextArea();
		textArea_63.setEditable(false);
		textArea_63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_63, 7, 0);
		textArea_63.setBackground(Color.WHITE);
		textArea_63.setBounds(24, 239, 20, 20);
		contentPane.add(textArea_63);
		
		JTextArea textArea_64 = new JTextArea();
		textArea_64.setEditable(false);
		textArea_64.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_64, 7, 1);
		textArea_64.setBackground(Color.WHITE);
		textArea_64.setBounds(48, 239, 20, 20);
		contentPane.add(textArea_64);
		
		JTextArea textArea_65 = new JTextArea();
		textArea_65.setEditable(false);
		textArea_65.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_65, 7, 2);
		textArea_65.setBackground(Color.WHITE);
		textArea_65.setBounds(72, 239, 20, 20);
		contentPane.add(textArea_65);
		
		JTextArea textArea_66 = new JTextArea();
		textArea_66.setEditable(false);
		textArea_66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_66, 7, 3);
		textArea_66.setBackground(Color.WHITE);
		textArea_66.setBounds(104, 239, 20, 20);
		contentPane.add(textArea_66);
		
		JTextArea textArea_67 = new JTextArea();
		textArea_67.setEditable(false);
		textArea_67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_67, 7, 4);
		textArea_67.setBackground(Color.WHITE);
		textArea_67.setBounds(128, 239, 20, 20);
		contentPane.add(textArea_67);
		
		JTextArea textArea_68 = new JTextArea();
		textArea_68.setEditable(false);
		textArea_68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_68, 7, 5);
		textArea_68.setBackground(Color.WHITE);
		textArea_68.setBounds(152, 239, 20, 20);
		contentPane.add(textArea_68);
		
		JTextArea textArea_69 = new JTextArea();
		textArea_69.setEditable(false);
		textArea_69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_69, 7, 6);
		textArea_69.setBackground(Color.WHITE);
		textArea_69.setBounds(186, 239, 20, 20);
		contentPane.add(textArea_69);
		
		JTextArea textArea_70 = new JTextArea();
		textArea_70.setEditable(false);
		textArea_70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_70, 7, 7);
		textArea_70.setBackground(Color.WHITE);
		textArea_70.setBounds(210, 239, 20, 20);
		contentPane.add(textArea_70);
		
		JTextArea textArea_71 = new JTextArea();
		textArea_71.setEditable(false);
		textArea_71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 8;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_71, 7, 8);
		textArea_71.setBackground(Color.WHITE);
		textArea_71.setBounds(234, 239, 20, 20);
		contentPane.add(textArea_71);
		
		JTextArea textArea_72 = new JTextArea();
		textArea_72.setEditable(false);
		textArea_72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_72, 8, 0);
		textArea_72.setBackground(Color.WHITE);
		textArea_72.setBounds(24, 262, 20, 20);
		contentPane.add(textArea_72);
		
		JTextArea textArea_73 = new JTextArea();
		textArea_73.setEditable(false);
		textArea_73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_73, 8, 1);
		textArea_73.setBackground(Color.WHITE);
		textArea_73.setBounds(48, 262, 20, 20);
		contentPane.add(textArea_73);
		
		JTextArea textArea_74 = new JTextArea();
		textArea_74.setEditable(false);
		textArea_74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_74, 8, 2);
		textArea_74.setBackground(Color.WHITE);
		textArea_74.setBounds(72, 262, 20, 20);
		contentPane.add(textArea_74);
		
		JTextArea textArea_75 = new JTextArea();
		textArea_75.setEditable(false);
		textArea_75.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_75, 8, 3);
		textArea_75.setBackground(Color.WHITE);
		textArea_75.setBounds(104, 262, 20, 20);
		contentPane.add(textArea_75);
		
		JTextArea textArea_76 = new JTextArea();
		textArea_76.setEditable(false);
		textArea_76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 5;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_76, 8, 4);
		textArea_76.setBackground(Color.WHITE);
		textArea_76.setBounds(128, 262, 20, 20);
		contentPane.add(textArea_76);
		
		JTextArea textArea_77 = new JTextArea();
		textArea_77.setEditable(false);
		textArea_77.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 6;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_77, 8, 5);
		textArea_77.setBackground(Color.WHITE);
		textArea_77.setBounds(152, 262, 20, 20);
		contentPane.add(textArea_77);
		
		JTextArea textArea_78 = new JTextArea();
		textArea_78.setEditable(false);
		textArea_78.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 7;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_78, 8, 6);
		textArea_78.setBackground(Color.WHITE);
		textArea_78.setBounds(186, 262, 20, 20);
		contentPane.add(textArea_78);
		
		JTextArea textArea_79 = new JTextArea();
		textArea_79.setEditable(false);
		textArea_79.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 8;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_79, 8, 7);
		textArea_79.setBackground(Color.WHITE);
		textArea_79.setBounds(210, 262, 20, 20);
		contentPane.add(textArea_79);
		
		JTextArea textArea_80 = new JTextArea();
		textArea_80.setEditable(false);
		textArea_80.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 9;
				Engine.x = 9;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis3 (textArea_80, 8, 8);
		textArea_80.setBackground(Color.WHITE);
		textArea_80.setBounds(234, 262, 20, 20);
		contentPane.add(textArea_80);
		
		JButton toggleButton = new JButton("1");
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 1;
				lValue.setText("Value = 1"); //Button adds 1 to lValue Label
			}
		});
		toggleButton.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton.setForeground(Color.BLUE);
		toggleButton.setBounds(294, 68, 43, 45);
		contentPane.add(toggleButton);
		
		JButton toggleButton_1 = new JButton("2");
		toggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 2;
				lValue.setText("Value = 2"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_1.setForeground(Color.BLUE);
		toggleButton_1.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_1.setBounds(338, 68, 43, 45);
		contentPane.add(toggleButton_1);
		
		JButton toggleButton_2 = new JButton("3");
		toggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 3;
				lValue.setText("Value = 3"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_2.setForeground(Color.BLUE);
		toggleButton_2.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_2.setBounds(382, 68, 43, 45);
		contentPane.add(toggleButton_2);
		
		JButton toggleButton_3 = new JButton("4");
		toggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 4;
				lValue.setText("Value = 4"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_3.setForeground(Color.BLUE);
		toggleButton_3.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_3.setBounds(294, 113, 43, 45);
		contentPane.add(toggleButton_3);
		
		JButton toggleButton_4 = new JButton("5");
		toggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 5;
				lValue.setText("Value = 5"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_4.setForeground(Color.BLUE);
		toggleButton_4.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_4.setBounds(338, 113, 43, 45);
		contentPane.add(toggleButton_4);
		
		JButton toggleButton_5 = new JButton("6");
		toggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 6;
				lValue.setText("Value = 6"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_5.setForeground(Color.BLUE);
		toggleButton_5.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_5.setBounds(382, 113, 43, 45);
		contentPane.add(toggleButton_5);
		
		JButton toggleButton_6 = new JButton("7");
		toggleButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 7;
				lValue.setText("Value = 7"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_6.setForeground(Color.BLUE);
		toggleButton_6.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_6.setBounds(294, 158, 43, 45);
		contentPane.add(toggleButton_6);
		
		JButton toggleButton_7 = new JButton("8");
		toggleButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 8;
				lValue.setText("Value = 8"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_7.setForeground(Color.BLUE);
		toggleButton_7.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_7.setBounds(338, 158, 43, 45);
		contentPane.add(toggleButton_7);
		
		JButton toggleButton_8 = new JButton("9");
		toggleButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 9;
				lValue.setText("Value = 9"); //Button adds 1 to lValue Label
			}
		});
		toggleButton_8.setForeground(Color.BLUE);
		toggleButton_8.setFont(new Font("HanziPen TC", Font.BOLD, 15));
		toggleButton_8.setBounds(382, 158, 43, 45);
		contentPane.add(toggleButton_8);
		
		JButton btnMakeMove = new JButton("Make Move");
		btnMakeMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.madeMove = true; //Button Places Users Move
			}
		});
		btnMakeMove.setForeground(Color.BLUE);
		btnMakeMove.setFont(new Font("HanziPen TC", Font.BOLD, 16));
		btnMakeMove.setBounds(279, 234, 161, 28);
		contentPane.add(btnMakeMove);
		
		JLabel lblRow = new JLabel("Row = ");
		lRow = lblRow;//Reference to lblRow from outside the method
		lblRow.setForeground(Color.BLUE);
		lblRow.setFont(new Font("Dialog", Font.BOLD, 17));
		lblRow.setBounds(24, 294, 100, 20);
		contentPane.add(lblRow);
		
		JLabel lblCol = new JLabel("Col = ");
		lCol = lblCol;//Reference to lblCol from outside the method
		lblCol.setForeground(Color.BLUE);
		lblCol.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCol.setBounds(24, 29, 100, 20);
		contentPane.add(lblCol);
		
		JLabel lblValue = new JLabel("Value = ");
		lValue = lblValue;//Reference to lblValue from outside the method
		lblValue.setForeground(Color.BLUE);
		lblValue.setFont(new Font("Dialog", Font.BOLD, 17));
		lblValue.setBounds(279, 28, 103, 20);
		contentPane.add(lblValue);
	}
}
