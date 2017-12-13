package soundsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)	//automatically create application context
@ContextConfiguration(classes=CDPlayerConfig.class)	//load config from CDPlayerConfig, 
													//since includes ComponentScan -> CompactDisc bean included
public class CDPlayerTest {
	
	//inject CompactDisc bean into test
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
}