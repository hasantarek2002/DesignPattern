package ProxyPattern2;

public class RealImage {
	public RealImage() {
		buildImage();
	}
	public void buildImage() {
		System.out.println("image build");
	}
	
	public void provideImage() {
		System.out.println("image provided");
	}

}
