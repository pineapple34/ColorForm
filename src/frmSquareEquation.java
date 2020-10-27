import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
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
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u041A\u0432\u0430\u0434\u0440\u0430\u0442\u043D\u043E\u0435 \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(137, 55, 166, 25);
		contentPane.add(label);
		
		JLabel lbl_final = new JLabel("");
		lbl_final.setBounds(10, 218, 414, 32);
		contentPane.add(lbl_final);
		
		JButton btn_calculate = new JButton("\u0420\u0435\u0448\u0438\u0442\u044C \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		btn_calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a, b, c;
				try {
					a = Double.parseDouble(txt_a.getText());
				}
				catch (NumberFormatException nfe){
					a = 0.0;
					txt_a.setText("0");
				}
				
				try {
					b = Double.parseDouble(txt_b.getText());
				}
				catch (NumberFormatException nfe){
					b = 0.0;
					txt_b.setText("0");
				}
				
				try {
					c = Double.parseDouble(txt_c.getText());
				}
				catch (NumberFormatException nfe){
					c = 0.0;
					txt_c.setText("0");
				}
				
				double D = b * b - 4 * a * c;
				double x1, x2;
				if (D > 0) {
					x1 = (-b - Math.sqrt(D))/(2*a);
					x2 = (-b + Math.sqrt(D))/(2*a);
					lbl_final.setText("x1 = " + x1 + ", x2 = " + x2);
				}
				else if (D == 0) {
					x1 = -b/(2*a);
					lbl_final.setText("x = " + x1);
				}
				else {
					lbl_final.setText("Корней нет");
				}
			}
		});
		btn_calculate.setBounds(126, 158, 174, 23);
		contentPane.add(btn_calculate);
		
		JLabel label_1 = new JLabel("\u0420\u0435\u0448\u0435\u043D\u0438\u0435");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(178, 193, 66, 25);
		contentPane.add(label_1);
		
		txt_a = new JTextField();
		txt_a.setBounds(69, 104, 36, 20);
		contentPane.add(txt_a);
		txt_a.setColumns(10);
		
		txt_b = new JTextField();
		txt_b.setColumns(10);
		txt_b.setBounds(169, 104, 36, 20);
		contentPane.add(txt_b);
		
		txt_c = new JTextField();
		txt_c.setColumns(10);
		txt_c.setBounds(269, 104, 36, 20);
		contentPane.add(txt_c);
		
		JLabel lblX = new JLabel("x^2 +");
		lblX.setBounds(115, 107, 46, 14);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("x +");
		lblX_1.setBounds(225, 107, 46, 14);
		contentPane.add(lblX_1);
		
		JLabel label_3 = new JLabel(" = 0");
		label_3.setBounds(327, 107, 46, 14);
		contentPane.add(label_3);
	}
}
