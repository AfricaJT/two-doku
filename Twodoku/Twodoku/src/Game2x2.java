import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game2x2 extends JFrame {

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
					Game2x2 frame = new Game2x2();
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
	public Game2x2() {
		setTitle("Twodoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
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
		dsg.setArrDis2 (textArea, 0, 0);//Places textArea into DisplayG array = arrDis2
		textArea.setForeground(new Color(0, 0, 255));
		textArea.setFont(new Font("Dialog", Font.BOLD, 30));
		textArea.setBounds(41, 59, 40, 40);
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
		dsg.setArrDis2 (textArea_1, 0, 1);//
		textArea_1.setForeground(Color.BLUE);
		textArea_1.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_1.setBounds(86, 59, 40, 40);
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
		dsg.setArrDis2 (textArea_2, 0, 2);//x, y
		textArea_2.setForeground(Color.BLUE);
		textArea_2.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_2.setBounds(138, 59, 40, 40);
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
		dsg.setArrDis2 (textArea_3, 0, 3);//
		textArea_3.setForeground(Color.BLUE);
		textArea_3.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_3.setBounds(183, 59, 40, 40);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setEditable(false);
		textArea_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_4, 1, 0);//
		textArea_4.setForeground(Color.BLUE);
		textArea_4.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_4.setBounds(41, 104, 40, 40);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setEditable(false);
		textArea_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_5, 1, 1);//
		textArea_5.setForeground(Color.BLUE);
		textArea_5.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_5.setBounds(86, 104, 40, 40);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setEditable(false);
		textArea_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_6, 1, 2);//
		textArea_6.setForeground(Color.BLUE);
		textArea_6.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_6.setBounds(138, 104, 40, 40);
		contentPane.add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setEditable(false);
		textArea_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 2;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_7, 1, 3);//
		textArea_7.setForeground(Color.BLUE);
		textArea_7.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_7.setBounds(183, 104, 40, 40);
		contentPane.add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setEditable(false);
		textArea_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_8, 2, 0);//
		textArea_8.setForeground(Color.BLUE);
		textArea_8.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_8.setBounds(41, 154, 40, 40);
		contentPane.add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setEditable(false);
		textArea_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_9, 2, 1);//
		textArea_9.setForeground(Color.BLUE);
		textArea_9.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_9.setBounds(86, 154, 40, 40);
		contentPane.add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setEditable(false);
		textArea_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_10, 2, 2);//
		textArea_10.setForeground(Color.BLUE);
		textArea_10.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_10.setBounds(138, 154, 40, 40);
		contentPane.add(textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setEditable(false);
		textArea_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 3;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_11, 2, 3);//
		textArea_11.setForeground(Color.BLUE);
		textArea_11.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_11.setBounds(183, 154, 40, 40);
		contentPane.add(textArea_11);
		
		JTextArea textArea_12 = new JTextArea();
		textArea_12.setEditable(false);
		textArea_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 1;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_12, 3, 0);//
		textArea_12.setForeground(Color.BLUE);
		textArea_12.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_12.setBounds(41, 199, 40, 40);
		contentPane.add(textArea_12);
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setEditable(false);
		textArea_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 2;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_13, 3, 1);//
		textArea_13.setForeground(Color.BLUE);
		textArea_13.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_13.setBounds(86, 199, 40, 40);
		contentPane.add(textArea_13);
		
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setEditable(false);
		textArea_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 3;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_14, 3, 2);//
		textArea_14.setForeground(Color.BLUE);
		textArea_14.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_14.setBounds(138, 199, 40, 40);
		contentPane.add(textArea_14);
		
		JTextArea textArea_15 = new JTextArea();
		textArea_15.setEditable(false);
		textArea_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Engine.y = 4;
				Engine.x = 4;
				lRow.setText("Row = " + Engine.y);
				lCol.setText("Col = " + Engine.x);
			}
		});
		dsg.setArrDis2 (textArea_15, 3, 3);//
		textArea_15.setForeground(Color.BLUE);
		textArea_15.setFont(new Font("Heiti TC", Font.BOLD, 30));
		textArea_15.setBounds(183, 199, 40, 40);
		contentPane.add(textArea_15);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 1;
				lValue.setText("Value = 1"); //Button adds 1 to lValue Label
			}
		});
		button.setBackground(new Color(255, 255, 255));
		button.setForeground(Color.BLUE);
		button.setFont(new Font("HanziPen TC", Font.BOLD, 16));
		button.setBounds(279, 72, 60, 60);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 2;
				lValue.setText("Value = 2"); //Button adds 2 to lValue Label
			}
		});
		button_1.setBackground(new Color(255, 255, 255));
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("HanziPen TC", Font.BOLD, 16));
		button_1.setBounds(340, 72, 60, 60);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 4;
				lValue.setText("Value = 4"); //Button adds 4 to lValue Label
			}
		});
		button_3.setBackground(new Color(255, 255, 255));
		button_3.setForeground(Color.BLUE);
		button_3.setFont(new Font("HanziPen TC", Font.BOLD, 16));
		button_3.setBounds(340, 134, 60, 60);
		contentPane.add(button_3);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.m = 3;
				lValue.setText("Value = 3"); //Button adds 3 to lValue Label
			}
		});
		button_2.setBackground(new Color(255, 255, 255));
		button_2.setForeground(Color.BLUE);
		button_2.setFont(new Font("HanziPen TC", Font.BOLD, 16));
		button_2.setBounds(279, 134, 60, 60);
		contentPane.add(button_2);
		
		JButton btnMakeMove = new JButton("Make Move");
		btnMakeMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Engine.madeMove = true; //Button Places Users Move
			}
		});
		btnMakeMove.setForeground(Color.BLUE);
		btnMakeMove.setFont(new Font("HanziPen TC", Font.BOLD, 16));
		btnMakeMove.setBounds(255, 211, 161, 28);
		contentPane.add(btnMakeMove);
		
		JLabel lblRow = new JLabel("Row = ");
		lRow = lblRow;//Reference to lblRow from outside the method
		lblRow.setForeground(Color.BLUE);
		lblRow.setFont(new Font("Dialog", Font.BOLD, 15));
		lblRow.setBounds(51, 250, 75, 20);
		contentPane.add(lblRow);
		
		JLabel lblCol = new JLabel("Col = ");
		lCol = lblCol;//Reference to lblCol from outside the method
		lblCol.setForeground(Color.BLUE);
		lblCol.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCol.setBounds(41, 28, 62, 20);
		contentPane.add(lblCol);
		
		JLabel lblValue = new JLabel("Value = ");
		lValue = lblValue;//Reference to lblValue from outside the method
		lblValue.setForeground(Color.BLUE);
		lblValue.setFont(new Font("Dialog", Font.BOLD, 15));
		lblValue.setBounds(279, 28, 103, 20);
		contentPane.add(lblValue);
	}
}
