package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
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
	public Search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search by name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 178, 55);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(92, 64, 280, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\w\\Downloads\\Webp.net-resizeimage.jpg"));
		lblNewLabel_1.setBounds(31, 58, 52, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Search by");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(17, 127, 133, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 173, 429, 191);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton_1_4_1 = new JButton("Genre");
		panel.add(btnNewButton_1_4_1);
		btnNewButton_1_4_1.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		
		JButton btnNewButton_1_4_1_2 = new JButton("Actor");
		btnNewButton_1_4_1_2.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		panel.add(btnNewButton_1_4_1_2);
		
		JButton btnNewButton_1_4 = new JButton("Year");
		panel.add(btnNewButton_1_4);
		btnNewButton_1_4.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		
		JButton btnNewButton_1_4_1_1 = new JButton("Language");
		btnNewButton_1_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1_4_1_1);
		btnNewButton_1_4_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		
		JButton btnNewButton_1_4_1_3 = new JButton("IMDB");
		btnNewButton_1_4_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1_3.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		panel.add(btnNewButton_1_4_1_3);
		
		JButton btnNewButton_1_4_1_4 = new JButton("Producer");
		btnNewButton_1_4_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1_4.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		panel.add(btnNewButton_1_4_1_4);
	}
}
