package ProxyDesignPattern;

public class ProxyA implements IA{
	A a=new A();

	@Override
	public void f1() {
		System.out.println("f1 is being called");
		a.f1();
		
	}

	@Override
	public void f2() {
		System.out.println("f2 is being called");
		a.f2();
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("f3 is being called");
		a.f3();
		
	}

}
