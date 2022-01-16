import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Introducing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Welcome to Flitch");
		
		JTextField flitch = new JTextField("FLITCH + \n Or how not to waste 2 hours on choosing a movie");
		flitch.setEditable(false);
		flitch.setText("FLITCH");
		flitch.setFont(new Font("Tahoma", Font.BOLD, 14));
		flitch.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel panel = new JPanel();
		panel.add()
		panel.add(flitch);
		
		frame.setLayout(new BorderLayout());
		frame.setSize(600, 600);
		frame.add(panel);
		frame.setVisible(true);
	}

}
