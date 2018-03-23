package FlagCreation;


public class Flag extends CompositeShape{

	Rectangle r;
	Circle c;
	
	public Flag(Rectangle r, Circle c) {
		super();
		this.r = r;
		this.c = c;
	}

	@Override
	public void buildShape() {
		shapes.add(r);
		shapes.add(c);

	}

}
