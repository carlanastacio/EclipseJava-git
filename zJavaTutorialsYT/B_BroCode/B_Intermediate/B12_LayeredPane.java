package B_Intermediate;

import javax.swing.*;
import java.awt.*;

public class B12_LayeredPane {

	public static void main(String[] args) {
		  // JLayeredPane = Swing container that provides a 
		  // third dimension for positioning components
		  // ex. depth, Z-index     
		  
		  // Creating the first label with a red background
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150, 150, 200, 200);

		JLayeredPane layaredPane = new JLayeredPane();
		layaredPane.setBounds(0, 0, 500, 500);
		
		layaredPane.add(label1, Integer.valueOf(0));
		layaredPane.add(label2, Integer.valueOf(2));
		layaredPane.add(label3, Integer.valueOf(0));
		
		JFrame frame = new JFrame("JLayaredPane");
		frame.add(layaredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		
		frame.setVisible(true);
	}

}
