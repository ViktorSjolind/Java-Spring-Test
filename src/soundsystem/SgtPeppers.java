package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
	private String title ="Sgt Peppers";
	private String artist ="The beatles";
	
	public void play(){
		System.out.println("playing: " + title + " by " + artist);
	}
}
