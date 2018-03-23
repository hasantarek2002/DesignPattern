package FlagCreation;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FlagDraw extends JPanel {
	public FlagDraw() {
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		Line l1=new Line(10, 10, 10, 100);
		Line l2=new Line(10,10,100,10);
		Line l3=new Line(100,10,100,100);
		Line l4=new Line(10,100,100,100);
		
		/*Line l1=new Line(20, 30, 70, 50);
		Line l2=new Line(20,30,20,100);
		Line l3=new Line(20,100,120,120);
		Line l4=new Line(70,50,120,120);*/
		
		Rectangle r=new Rectangle(l1, l2, l3, l4);
		Circle c=new Circle(45, 45, 20);
		
		Flag f=new Flag(r, c);
		f.draw(g);
	
	}
}
