import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowWithButtons {

	public static JButton button1 = new JButton("DA");
	public static JButton button2 = new JButton("NE");

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mein Program");
		
		
		frame.setLocation(700, 300);
		frame.setSize(200, 100);
		

		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		ButtonHandler bh = new ButtonHandler();
		button1.addActionListener(bh);
		button1.setBorderPainted(true);
		button1.setForeground(Color.MAGENTA);
		button1.setBackground(Color.BLACK);
		button1.setOpaque(true);
		
	    button2.addActionListener(bh);
		button2.setBorderPainted(true);
		button2.setForeground(Color.MAGENTA);
		button2.setBackground(Color.BLACK);
		button2.setOpaque(true);
		

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
            JButton b = (JButton) e.getSource();
			if (b.getText().equals("DA")) {
				button1.setText("Clicked");
				button2.setText("NE");
			} else if (b.getText().equals("NE")) {
				button1.setText("DA");
				button2.setText("Clicked");
			}

		}

	}
}
