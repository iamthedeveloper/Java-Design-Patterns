package AdapaterPattern;

public class AdpaterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer =  new AudioPlayer();
		audioPlayer.play("vlc", "vlcfile");
		audioPlayer.play("mp4", "mp4file");
		audioPlayer.play("mp3", "mp3file");
	}
}