package AdapterDesignPattern;

public class AdapterMediaPlayer implements MediaPlayer {

	private AdvanceMediaPlayer ad;

	public AdapterMediaPlayer(AdvanceMediaPlayer ad) {
		this.ad = ad;
	}

	@Override
	public void play() {

		ad.play();
	}

}
