package project;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Introducing extends JFrame {
	public Introducing() {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		getContentPane().add(panel);
		panel.setLayout(null);

		JTextPane txtpnFlitchnSd = new JTextPane();

		StyledDocument doc = txtpnFlitchnSd.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		txtpnFlitchnSd.setForeground(Color.BLUE);
		Font font = new Font("Serif", Font.ITALIC, 42);
		txtpnFlitchnSd.setFont(font);
		txtpnFlitchnSd.setFont(font.deriveFont(Font.BOLD));
		txtpnFlitchnSd.setFont(font);

		txtpnFlitchnSd.setText(
				"                   Flitch \r\n        or how not to waste 2 \n   hours on choosing a movie");
		txtpnFlitchnSd.setBounds(217, 27, 499, 169);
		panel.add(txtpnFlitchnSd);
		
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/icon.png"));
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(44, -77, 300, 368);
		lblNewLabel.setIcon(icon);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(188, 389, 97, 25);
		panel.add(btnNewButton);
		ImageIcon play = new ImageIcon(this.getClass().getResource("/play.png"));
		ImageIcon playy = new ImageIcon(this.getClass().getResource("/playy.png"));
		ImageIcon playyy = new ImageIcon(this.getClass().getResource("/playyy.png"));
		btnNewButton
	}
}
