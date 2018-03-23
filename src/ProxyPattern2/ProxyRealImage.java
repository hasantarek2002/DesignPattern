package ProxyPattern2;

public class ProxyRealImage {
	private RealImage im=null;
	
	public void provideImage() {
		
		if(im==null) {
			System.out.println("first time image builded");
			im=new RealImage();
		}
			
		im.provideImage();
	}

}
