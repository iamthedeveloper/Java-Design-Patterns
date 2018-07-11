package AdapaterPattern;

public class AdvancedPlayerAdapter {

	AdvancedMediaPlayer advancedMediaPlayer;

	public AdvancedPlayerAdapter(String audioType) {

		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VLCPlayer();
		} else if (audioType.equals("mp4")) {
			advancedMediaPlayer = new MP4Player();
		}
	}

	public void playAudioFile(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VLCPlayer();	
			advancedMediaPlayer.playVLC(fileName);
			}
		else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new MP4Player();
			advancedMediaPlayer.playMP4(fileName);
		}
	}
}
