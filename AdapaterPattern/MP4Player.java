package AdapaterPattern;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Mp4 cannot Play VLC " + fileName);
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Mp4 is Playing " + fileName);
	}

}
