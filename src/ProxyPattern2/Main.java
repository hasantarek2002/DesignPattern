package ProxyPattern2;


public class Main {
	public static void main(String[] args) {
		ProxyRealImage im= new ProxyRealImage();
		im.provideImage();
		
		im.provideImage();

	}

}
