package online.smartcompute.tutorial.spring.springaspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import online.smartcompute.tutorial.spring.springaspectj.example.TestClass;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/demo/spring/applicationcontext.xml" })
public class AppTest {

	@Autowired
	private TestClass testClass;

	@Test
	public void testAspect() {
		testClass.testMethod();
	}

}
