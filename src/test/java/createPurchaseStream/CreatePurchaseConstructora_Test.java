package createPurchaseStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreatePurchaseConstructora_Test {
	
	private WebDriver driver;
	CreatePurchasePageConstructora createPurchasePageConstructora;
	
	@Before
	public void setUp() throws Exception {
		createPurchasePageConstructora = new CreatePurchasePageConstructora(driver);
		driver = createPurchasePageConstructora.chromeDriverConnection();
		createPurchasePageConstructora.visit("https://qa.ciencuadras.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPurchasePageConstructora.buys();
		createPurchasePageConstructora.paymentSelection();
		createPurchasePageConstructora.finalPaymentForm();
		createPurchasePageConstructora.payFinish();
		createPurchasePageConstructora.purchaseDetail();
	}

}
