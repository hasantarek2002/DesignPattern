package FlagCreation;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class CompositeShape implements IShape {
	ArrayList<IShape> shapes=new ArrayList<IShape>();
	
	@Override
	public void draw(Graphics g) {
		buildShape();
		for (IShape iShape : shapes) {
			iShape.draw(g);
		}

	}
	public abstract void buildShape();
	

}
