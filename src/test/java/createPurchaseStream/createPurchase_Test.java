package createPurchaseStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class createPurchase_Test {
	

	private WebDriver driver;
	CreatePurchasePage createPropertyPage;

	@Before
	public void setUp() throws Exception {
		createPropertyPage = new CreatePurchasePage(driver);
		driver = createPropertyPage.chromeDriverConnection();
		createPropertyPage.visit("https://dev.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		createPropertyPage.buys();
		createPropertyPage.purchaseForm();
		createPropertyPage.load();
		createPropertyPage.topay();
	}

}
