package FlagCreation;


public class Rectangle extends CompositeShape {
	
	Line l1,l2,l3,l4;
	
	public Rectangle(Line l1, Line l2, Line l3, Line l4) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}

	@Override
	public void buildShape() {
		shapes.add(l1);
		shapes.add(l2);
		shapes.add(l3);
		shapes.add(l4);
		
	}

}
