package compositeDesignPattern;

public class Flag extends CompositeShape{

	@Override
	public void buildShape() {
		arr.add(new Rectangle());
		arr.add(new Circle(22, 33, 44));
		// TODO Auto-generated method stub
		
	}

}
