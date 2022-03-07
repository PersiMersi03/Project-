package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Flitch {

	private JFrame frmFlitch;
	private JTextField textField;
	private JTextField txtPassword;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flitch window = new Flitch();
					window.frmFlitch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Flitch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFlitch = new JFrame();
		frmFlitch.setTitle("Flitch");
		frmFlitch.setBounds(100, 100, 450, 363);
		frmFlitch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFlitch.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Flitch");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(168, 11, 90, 58);
		frmFlitch.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Sign in");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(63, 75, 100, 30);
		frmFlitch.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(63, 116, 302, 30);
		frmFlitch.getContentPane().add(textField);
		textField.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setToolTipText("");
		txtPassword.setColumns(10);
		txtPassword.setBounds(63, 166, 302, 30);
		frmFlitch.getContentPane().add(txtPassword);

		JLabel lblNewLabel_2 = new JLabel("New to Flitch?");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(39, 271, 136, 27);
		frmFlitch.getContentPane().add(lblNewLabel_2);

		btnNewButton = new JButton("Sign up");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton.setBounds(263, 271, 116, 27);
		frmFlitch.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\w\\Downloads\\Webp.net-resizeimage (5).jpg"));
		btnNewButton_1.setBounds(176, 207, 70, 63);
		frmFlitch.getContentPane().add(btnNewButton_1);

	}
}
