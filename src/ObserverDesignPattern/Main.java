package ObserverDesignPattern;

public class Main {

	public static void main(String[] args) {
		Observer u1=new User1();
		Observer u2=new User2();
		
		Subject c=new CompanyA();
		c.registerAObserver(u1);
		c.registerAObserver(u2);
		//c.UnRegisterAObserver(u1);
		((CompanyA)c).sellPriceIncrease();
	

	}

}
