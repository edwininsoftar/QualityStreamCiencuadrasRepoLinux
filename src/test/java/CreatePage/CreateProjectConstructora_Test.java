package CreatePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreateProjectConstructora_Test {
	
	private WebDriver driver;
	CreateProjectPageConstructora CreateProjectBuilder;

	@Before
	public void setUp() throws Exception {
		CreateProjectBuilder = new CreateProjectPageConstructora(driver);
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
		CreateProjectBuilder.publicProject();
		CreateProjectBuilder.characteristicsProperty();
		CreateProjectBuilder.salesRoom();
		CreateProjectBuilder.stages();
	}

}
