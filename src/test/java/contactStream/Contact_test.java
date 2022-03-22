package contactStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class Contact_test {
	
	private WebDriver driver;
	ContactPage contactPage;

	@Before
	public void setUp() throws Exception {
		contactPage = new ContactPage(driver);
		driver = contactPage.chromeDriverConnection();
		contactPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		contactPage.contactBuyNew();
	}

}
