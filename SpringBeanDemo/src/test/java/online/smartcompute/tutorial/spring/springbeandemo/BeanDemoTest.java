package online.smartcompute.tutorial.spring.springbeandemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/demo/springbeandemo/applicationcontext.xml" })
public class BeanDemoTest {

	@Autowired
	private SimpleMovieLister simpleMovieLister;
	@Autowired
	private SimpleMovieLister1 simpleMovieLister1;
	
	
	@Autowired
	@Qualifier("childCollection")
	private CollectionDemo childCollection;
	
	
	
	
	@Autowired
	private CommandManager commandManager;
	@Autowired
	private CommandManager1 commandManager1;
	@Autowired
	private CommandManager2 commandManager2;
	
	
	
	
	
	

	@Test
	public void beanDemoTest() {
		
		System.out.println(childCollection.getAdminEmails());
		
		commandManager.executeCommand();
		commandManager.executeCommand();
		
		
		commandManager1.executeCommand();
		commandManager1.executeCommand();
		
		
		
		commandManager2.executeCommand();
		commandManager2.executeCommand();
		
		
		System.out.println("END");
	}

}
