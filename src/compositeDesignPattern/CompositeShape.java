package compositeDesignPattern;

import java.util.ArrayList;

public abstract class CompositeShape implements IShape{
	
	ArrayList<IShape> arr=new ArrayList<IShape>();
	public void draw() {
		buildShape();
		for (IShape shape: arr) {
			shape.draw();
		}
	}
	
	public abstract void buildShape() ;

}
