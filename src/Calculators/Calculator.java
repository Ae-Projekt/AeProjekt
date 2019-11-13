package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import static java.lang.Math.sqrt;
public class Calculator {

	private JFrame frame;
	private JTextField tb_display;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_0;
	private JButton btn_plus;
	private JButton btn_sub;
	private JButton btn_MultiP;
	private JButton btn_equal;
	private JButton btn_modulo;
	private JButton btn_division;
	private JButton btn_priam;
	private JButton btn_clear;
	private JButton btn_comma;
	private JButton btn_square;
	private JButton btn_pm;
	private JButton btn_bs;
	
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	private JButton btn_sqr;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tb_display = new JTextField();
		tb_display.setFont(new Font("Tahoma", Font.BOLD, 16));
		tb_display.setHorizontalAlignment(SwingConstants.RIGHT);
		tb_display.setBounds(12, 13, 298, 68);
		frame.getContentPane().add(tb_display);
		tb_display.setColumns(10);
		
		//--------------------Row 1-------------------------------
		
		btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tb_display.setText(null);
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_clear.setBounds(198, 94, 50, 50);
		frame.getContentPane().add(btn_clear);
				
		btn_square = new JButton("x\u00B2");
		btn_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------Squared Function -------------------------------
				firstNumber = Double.parseDouble(tb_display.getText());
				result = firstNumber * firstNumber;
				answer = String.format("%.2f", result);
				tb_display.setText(answer);
			}
		});
		btn_square.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_square.setBounds(136, 94, 50, 50);
		frame.getContentPane().add(btn_square);
		
		btn_MultiP = new JButton("*");
		btn_MultiP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(tb_display.getText());
				tb_display.setText("");
				operations = "*";
			}
		});
		btn_MultiP.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_MultiP.setBounds(198, 220, 112, 50);
		frame.getContentPane().add(btn_MultiP);
		
		//--------------------Row 2-------------------------------	
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_7.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_7.setBounds(12, 157, 50, 50);
		frame.getContentPane().add(btn_7);
		
		btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_8.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_8.setBounds(74, 158, 50, 50);
		frame.getContentPane().add(btn_8);
		
		btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_9.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_9.setBounds(136, 157, 50, 50);
		frame.getContentPane().add(btn_9);
		
		//--------------------Row 3-------------------------------
		
		btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_4.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_4.setBounds(12, 220, 50, 50);
		frame.getContentPane().add(btn_4);
		
		btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_5.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_5.setBounds(74, 219, 50, 50);
		frame.getContentPane().add(btn_5);
		
		btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_6.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_6.setBounds(136, 219, 50, 50);
		frame.getContentPane().add(btn_6);
		
		btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(tb_display.getText());
				tb_display.setText("");
				operations = "+";
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_plus.setBounds(200, 345, 110, 50);
		frame.getContentPane().add(btn_plus);
		
		btn_modulo = new JButton("%");
		btn_modulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(tb_display.getText());
				tb_display.setText("");
				operations = "%";
			}
		});
		btn_modulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_modulo.setBounds(12, 94, 50, 50);
		frame.getContentPane().add(btn_modulo);
		
		//--------------------Row 4-------------------------------
		
		btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_1.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_1.setBounds(12, 283, 50, 50);
		frame.getContentPane().add(btn_1);
		
		btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_2.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_2.setBounds(74, 282, 50, 50);
		frame.getContentPane().add(btn_2);
		
		btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_3.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_3.setBounds(136, 282, 50, 50);
		frame.getContentPane().add(btn_3);
		
		//--------------------Row 5-------------------------------
		
		btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_0.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_0.setBounds(74, 345, 50, 50);
		frame.getContentPane().add(btn_0);
		
		btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(tb_display.getText());
				tb_display.setText("");
				operations = "-";
			}
		});
		btn_sub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_sub.setBounds(198, 282, 112, 50);
		frame.getContentPane().add(btn_sub);
		
		btn_division = new JButton("/");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(tb_display.getText());
				tb_display.setText("");
				operations = "/";
			}
		});
		btn_division.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_division.setBounds(198, 156, 112, 50);
		frame.getContentPane().add(btn_division);
		
		btn_priam = new JButton("PR");
		btn_priam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------Prime Number Checker-------------------------------				
				String str = tb_display.getText();
				int num = Integer.parseInt(str);
				int flag = 0;
				
				for(int i = 2; i< num; i++) {
					if(num%i==0) {
						flag = 1;
						JOptionPane.showMessageDialog(frame, tb_display.getText()+"\n"+num+ " is divisable by" +i);
					}
				}
				if(flag == 0) {
					JOptionPane.showMessageDialog(frame, tb_display.getText()+"\n"+num+ " is a Prime Number...");
				}else {
					JOptionPane.showMessageDialog(frame, tb_display.getText()+"\n\nSo,"+num+ " is not a Prime Number...");
				}
							  
				
			}
		});
		btn_priam.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_priam.setBounds(12, 409, 174, 50);
		frame.getContentPane().add(btn_priam);
				
		btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------The Operations-------------------------------				
				String answer;
				//--------------------Addition -------------------------------
				secondNumber = Double.parseDouble(tb_display.getText());
				if(operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					tb_display.setText(answer);
				}
				//--------------------subtraction -------------------------------
				else if(operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					tb_display.setText(answer);
				}
				//--------------------multiplication  -------------------------------
				else if(operations == "*") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					tb_display.setText(answer);
				}
				//--------------------division  -------------------------------
				else if(operations == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					tb_display.setText(answer);
				}
				//--------------------Modulo -------------------------------
				else if(operations == "%") {
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					tb_display.setText(answer);
				}

			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_equal.setBounds(198, 408, 112, 50);
		frame.getContentPane().add(btn_equal);
		
		btn_comma = new JButton(".");
		btn_comma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = tb_display.getText() + btn_comma.getText();
				tb_display.setText(EnterNumber);
			}
		});
		btn_comma.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_comma.setBounds(136, 345, 50, 50);
		frame.getContentPane().add(btn_comma);
		
		btn_pm = new JButton("+/-");
		btn_pm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------Plus or Minus -------------------------------
				double ops = Double.parseDouble(String.valueOf(tb_display.getText()));
				ops = ops * (-1);
				tb_display.setText(String.valueOf(ops));
			}
		});
		btn_pm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_pm.setBounds(12, 345, 50, 50);
		frame.getContentPane().add(btn_pm);
		
		btn_bs = new JButton("\u2190");
		btn_bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------Back Space Function -------------------------------	
				String backSpace = null;
				
				if(tb_display.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(tb_display.getText());
					strB.deleteCharAt(tb_display.getText().length() -1);
					backSpace = strB.toString();
					tb_display.setText(backSpace);
				}
			}
		});
		btn_bs.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_bs.setBounds(260, 94, 50, 50);
		frame.getContentPane().add(btn_bs);
		
		btn_sqr = new JButton("\u221A");
		btn_sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(tb_display.getText()); 
				result = Math.sqrt(firstNumber);
				answer = String.format("%.2f", result);
				tb_display.setText(answer);
			}
		});
		btn_sqr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_sqr.setBounds(74, 94, 50, 50);
		frame.getContentPane().add(btn_sqr);

	}
}
