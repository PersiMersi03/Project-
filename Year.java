package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Year {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Year window = new Year();
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
	public Year() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("Movies");
		tglbtnNewToggleButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		tglbtnNewToggleButton.setBounds(52, 85, 116, 36);
		frame.getContentPane().add(tglbtnNewToggleButton);

		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(52, 29, 137, 45);
		frame.getContentPane().add(lblNewLabel);

		JToggleButton tglbtnSeries = new JToggleButton("Series");
		tglbtnSeries.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		tglbtnSeries.setBounds(195, 85, 116, 36);
		frame.getContentPane().add(tglbtnSeries);

		JLabel lblNewLabel_1 = new JLabel("from:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(342, 87, 65, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel  year = new JLabel();
		 year.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		 year.setBounds(126, 227, 185, 28);
		frame.getContentPane().add(year);

		JSlider slider = new JSlider(1960, 2022, 1991);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				year.setText("Year chosen = " + slider.getValue());
			}
		});
	
		slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(10);
        
		slider.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setToolTipText("");
		slider.setBounds(53, 153, 302, 77);
		frame.getContentPane().add(slider);
		
		
		
	
		
	    
	      
		
	}
}
