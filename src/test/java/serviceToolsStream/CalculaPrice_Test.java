package serviceToolsStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CalculaPrice_Test {
	
	private WebDriver driver;
	CalculaPricePage calculaPricePage;

	@Before
	public void setUp() throws Exception {
		calculaPricePage = new CalculaPricePage(driver);
		driver = calculaPricePage.chromeDriverConnection();
		calculaPricePage.visit("https://qa.ciencuadras.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		calculaPricePage.propertyLocation();
		calculaPricePage.propertyInformation();
		calculaPricePage.payThePriceonline();
		calculaPricePage.payFinish();
		calculaPricePage.purchaseDetail();
	}

}
