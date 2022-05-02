package CreatePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreatePropertyPersona_Test {
	
	private WebDriver driver;
	CreatePropertyPagePersona createPropertyPersonPage;

	@Before
	public void setUp() throws Exception {
		createPropertyPersonPage = new CreatePropertyPagePersona(driver);
		driver = createPropertyPersonPage.chromeDriverConnection();
		createPropertyPersonPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		createPropertyPersonPage.login();
		createPropertyPersonPage.published();   
		createPropertyPersonPage.purchaseForm();
		createPropertyPersonPage.load();
		createPropertyPersonPage.payFinish();
		createPropertyPersonPage.purchaseDetail();
	}

}
