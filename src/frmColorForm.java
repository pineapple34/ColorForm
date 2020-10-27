import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmColorForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmColorForm frame = new frmColorForm();
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
	public frmColorForm() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(59, 179, 87, 14);
		contentPane.add(label);
		
		JButton button = new JButton("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C \u0446\u0432\u0435\u0442");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contentPane.getBackground() == Color.white) {
					contentPane.setBackground(Color.red);
					label.setText("Красный");
				}
				else if(contentPane.getBackground() == Color.red) {
					contentPane.setBackground(Color.green);
					label.setText("Зеленый");
				}
				else {
					contentPane.setBackground(Color.white);
					label.setText("");
				}
			}
		});
		button.setBounds(158, 68, 120, 42);
		contentPane.add(button);
	}
}
