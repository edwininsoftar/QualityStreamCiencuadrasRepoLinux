package createPurchaseStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class createPurchasePersona_Test {
	

	private WebDriver driver;
	CreatePurchasePagePersona createPropertyPage;

	@Before
	public void setUp() throws Exception {
		createPropertyPage = new CreatePurchasePagePersona(driver);
		driver = createPropertyPage.chromeDriverConnection();
		createPropertyPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPropertyPage.buys();
		createPropertyPage.purchaseForm(); 
		createPropertyPage.load();
		createPropertyPage.payFinish();
		createPropertyPage.purchaseDetail();
	}

}
