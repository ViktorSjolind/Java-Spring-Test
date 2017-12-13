package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Create bean
@Component
public class CDPlayer implements MediaPlayer{
	
	private CompactDisc cd;
	
	//pass in CompactDisc bean when Spring creates CDPlayer bean
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play(){
		cd.play();
	}
}
