package AdapterDesignPattern;

public class VLCPlayer implements AdvanceMediaPlayer{

	@Override
	public void play() {
		System.out.println("Playing advance VLC player");
	}

}
