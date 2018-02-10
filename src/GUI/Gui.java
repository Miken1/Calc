package GUI;

import MathLib.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	

	//Create JFrame with TextField and a button
	
	public class Gui {
		private JFrame frame = new JFrame();
		
		private JTextField input = new JTextField();
		private JButton enter = new JButton("=");
		
		public Gui(){
		
			frame.setSize(100, 100);	
			frame.setVisible(true);
		
			frame.add(input,BorderLayout.NORTH);
			frame.add(enter);
		
			// ActonListeneer waits for enter button to be pressed 
			enter.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent e){
					int ans = Math.eval(input.getText());   //Sends contents of input to eval.
					input.setText(""+ ans);					// Sets input to show answer.
				
				}
			});
		
		
		}
	
	
	
	
}
