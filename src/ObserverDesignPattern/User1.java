package ObserverDesignPattern;

public class User1 extends Observer{

	@Override
	public void getNotified() {
		System.out.println("User1 gets notification");
		
	}

}
