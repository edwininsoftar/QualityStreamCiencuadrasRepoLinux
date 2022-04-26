package CreatePage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class createProjectBuilder_Test {
	
	private WebDriver driver;
	createProjectBuilder CreateProjectBuilder;

	@Before
	public void setUp() throws Exception {
		CreateProjectBuilder = new createProjectBuilder(driver);
		driver = CreateProjectBuilder.chromeDriverConnection();
		CreateProjectBuilder.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		CreateProjectBuilder.logIn();
	}

}
