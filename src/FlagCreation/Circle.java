package FlagCreation;

import java.awt.Graphics;

public class Circle implements IShape {
	int x,y,r;
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	@Override
	public void draw(Graphics g) {
		g.drawOval(x, y, r, r);
		g.fillOval(x, y, r, r);
	}

}
