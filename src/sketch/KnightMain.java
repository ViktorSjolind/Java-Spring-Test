package sketch;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.ApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("knights.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();

	}

}
