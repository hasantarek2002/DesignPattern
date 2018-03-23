package ObserverDesignPattern;

public class CompanyA extends Subject{

		public void sellPriceIncrease() {
			
			notifyAllObserver();
		}
}
