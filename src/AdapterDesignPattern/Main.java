package AdapterDesignPattern;

public class Main {

	public static void main(String[] args) {

		//MediaPlayer ad= new Mp3Player();
		
		
		MediaPlayer ad = new AdapterMediaPlayer(new Mp4Player());
		//MediaPlayer ad= new AdapterMediaPlayer(new VLCPlayer());
		

		ad.play();
	}
}
