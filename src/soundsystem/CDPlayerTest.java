package soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)	//automatically create application context
@ContextConfiguration(classes=CDPlayerConfig.class)	//load config from CDPlayerConfig, 
													//since includes ComponentScan -> CompactDisc bean included
public class CDPlayerTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private MediaPlayer player; 
	
	//inject CompactDisc bean into test
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}	
	
	
	@Test
	public void play(){
		player.play();
		assertEquals("playing: Sgt Peppers by The beatles\n", systemOutRule.getLog());
	}
}