package contactStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class contact_test {
	
	private WebDriver driver;
	contactPage ContactPage;
	

	@Before
	public void setUp() throws Exception {
		ContactPage = new contactPage(driver);
		driver = ContactPage.chromeDriverConnection();
		ContactPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		ContactPage.contactBuyNew();
		ContactPage.formContact();
		ContactPage.userBuilder(); 
	}

}
