package AdapaterPattern;

public class AudioPlayer implements MediaPlayer {

	AdvancedPlayerAdapter advancedAdapter;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Audio Player is Playing MP3 " + fileName);
		}
		else {
			advancedAdapter =  new AdvancedPlayerAdapter(fileName);
			advancedAdapter.playAudioFile(audioType, fileName);
		}
	}

}
