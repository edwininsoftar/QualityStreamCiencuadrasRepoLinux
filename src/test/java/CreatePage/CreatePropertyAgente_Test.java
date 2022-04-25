package CreatePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreatePropertyAgente_Test {
	
	private WebDriver driver;
	CreatePropertyAgentePage CreatePropertyAgentePage;
	
	@Before
	public void setUp() throws Exception {
		CreatePropertyAgentePage = new CreatePropertyAgentePage(driver);
		driver = CreatePropertyAgentePage.chromeDriverConnection();
		CreatePropertyAgentePage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		CreatePropertyAgentePage.login();
		CreatePropertyAgentePage.propertyPublication();
		CreatePropertyAgentePage.basicInformation();
		CreatePropertyAgentePage.load();
		CreatePropertyAgentePage.validation();
	}

}
