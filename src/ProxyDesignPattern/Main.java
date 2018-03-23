package ProxyDesignPattern;

public class Main {

	public static void main(String[] args) {
		/*IA a=new A();
		a.f1();
		a.f2();
		a.f3();*/
		
		
		
		IA a=new ProxyA();
		a.f1();
		a.f2();
		a.f3();

	}

}
