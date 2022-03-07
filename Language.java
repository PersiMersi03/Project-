package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Language {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Language window = new Language();
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
	public Language() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Choose a language:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(40, 33, 200, 35);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(40, 79, 354, 173);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 177, 177, 0 };
		gbl_panel.rowHeights = new int[] { 92, 92, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton btnNewButton_1_1_1 = new JButton("French");
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnNewButton_1_1 = new JButton("German");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnNewButton = new JButton("English");
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1_1.gridx = 1;
		gbc_btnNewButton_1_1.gridy = 0;
		panel.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1_1_1.gridx = 0;
		gbc_btnNewButton_1_1_1.gridy = 1;
		panel.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);

		JButton btnOther = new JButton("Other");
		btnOther.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		GridBagConstraints gbc_btnOther = new GridBagConstraints();
		gbc_btnOther.fill = GridBagConstraints.BOTH;
		gbc_btnOther.gridx = 1;
		gbc_btnOther.gridy = 1;
		panel.add(btnOther, gbc_btnOther);
	}

}
