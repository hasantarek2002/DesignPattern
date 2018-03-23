package ObserverDesignPattern;

import java.util.ArrayList;

public class Subject {
	ArrayList<Observer> observer = new ArrayList<Observer>();

	public void registerAObserver(Observer observ) {
		observer.add(observ);
	}

	public void UnRegisterAObserver(Observer observ) {
		if(observer.contains(observ)) {
			observer.remove(observ);
		}
		
		/*int index=observer.lastIndexOf(observ);
		if(index != -1) {
			observer.remove(index);
		}*/
	}
	 public void notifyAllObserver(){
		for(int i=0; i < observer.size(); i++) {
			observer.get(i).getNotified();
		}
	}
	 
}
