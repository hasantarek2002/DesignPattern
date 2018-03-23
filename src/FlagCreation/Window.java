package FlagCreation;

import javax.swing.JFrame;

public class Window extends JFrame{
	FlagDraw panel;
	
	public Window() {
		panel=new FlagDraw();
		add(panel);
		
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		
	}
}
