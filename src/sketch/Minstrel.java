package sketch;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	
	public Minstrel(PrintStream stream){
		this.stream = stream;
	}
	
	public void singBeforeQuest(){
		stream.println("Lalalala knight is so brave");		
	}	
	public void singAfterQuest(){
		stream.println("Hahah knight did embark on a quest");
	}
	
	
}
