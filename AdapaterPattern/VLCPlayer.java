package AdapaterPattern;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("VLC is Playing " + fileName);
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("VLC cannot Play MP4 " + fileName);
	}

}
