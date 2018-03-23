package ProxyDesignPattern;

public class A implements IA{

	@Override
	public void f1() {
		
		System.out.println("f1 is called");
	}

	@Override
	public void f2() {
		System.out.println("f2 is called");
		
	}

	@Override
	public void f3() {
		System.out.println("f3 is called");
		
	}

}
